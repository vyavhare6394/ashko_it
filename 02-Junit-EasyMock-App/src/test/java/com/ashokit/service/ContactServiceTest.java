package com.ashokit.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ashoit.dao.ContactDao;
import com.ashoit.service.ContactServiceImpl;
import com.ashok.model.Contact;
import com.ashokit.exceptions.NoDataFoundException;

public class ContactServiceTest {

	private static ContactServiceImpl service = null;

	@BeforeClass
	public static void init() {
		// Creating Proxy
		ContactDao daoProxy = EasyMock.createMock(ContactDao.class);

		// setting behaviour for dao method-1
		EasyMock.expect(daoProxy.findNameById(101)).andReturn("Ashok");
		EasyMock.expect(daoProxy.findNameById(102)).andReturn("Ashok IT");

		// Setting behaviour for dao method-2
		List<String> names = new ArrayList();
		names.add("John");
		names.add("Smith");
		names.add("Peter");
		EasyMock.expect(daoProxy.findNames()).andReturn(names);
		EasyMock.expect(daoProxy.findNames()).andReturn(null);

		// Setting behaviour for dao method-3
		Contact c = new Contact();
		c.setContactId(101);
		c.setContactName("Charles");
		c.setContactNumber(675656767l);

		EasyMock.expect(daoProxy.findById(101)).andReturn(c);

		EasyMock.expect(daoProxy.findById(201)).andReturn(null);

		// Saving proxy behaviour
		EasyMock.replay(daoProxy);

		// Injecting proxy object into target obj
		service = new ContactServiceImpl();
		service.setContactDao(daoProxy);
	}

	@Test
	public void testGetNameById_01() {
		String name = service.getNameById(101);
		assertNotNull(name);
	}

	@Test
	public void testGetAllContactNames_01() {
		List<String> contactNames = service.getAllContactNames();
		assertNotNull(contactNames);
	}
	
	@Test
	public void testGetAllContactNames_02() {
		List<String> contactNames = service.getAllContactNames();
		assertNull(contactNames);
	}

	@Test
	public void testGetContactById_01() {
		Contact contact = service.getContactById(101);
		assertNotNull(contact);
	}
	
	@Test(expected=NoDataFoundException.class)
	public void testGetContactById_02() {
		service.getContactById(201);
	}

}
