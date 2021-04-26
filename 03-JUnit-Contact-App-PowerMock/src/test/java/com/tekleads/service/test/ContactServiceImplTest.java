package com.tekleads.service.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.tekleads.dao.ContactDao;
import com.tekleads.exception.NoDataFoundException;
import com.tekleads.model.Contact;
import com.tekleads.service.ContactServiceImpl;

public class ContactServiceImplTest {

	@Test
	public void testGetContactNumByName() {
		ContactServiceImpl service = new ContactServiceImpl();

		ContactDao daoMock = mock(ContactDao.class);

		when(daoMock.findContactNumByName("Suresh")).thenReturn(89797979l);

		service.setDao(daoMock);

		Long num = service.getContactNumByName("Suresh");

		assertNotNull(num);
	}

	@Test(expected = NoDataFoundException.class)
	public void testGetAllContacts() {
		ContactServiceImpl service = new ContactServiceImpl();

		ContactDao daoMock = PowerMockito.mock(ContactDao.class);

		when(daoMock.findAll()).thenReturn(null);

		service.setDao(daoMock);

		service.getAllContacts();
	}

	@Ignore
	@Test(expected = NoDataFoundException.class)
	public void testgetInactiveRecords01() {
		ContactServiceImpl service = new ContactServiceImpl();

		ContactDao daoMock = PowerMockito.mock(ContactDao.class);

		when(daoMock.findInActiveRecords()).thenReturn(null);

		service.setDao(daoMock);

		List<Contact> list = service.getInActiveRecords();
		assertNull(list);
	}

	@Test
	public void testgetInactiveRecords02() {
		ContactServiceImpl service = new ContactServiceImpl();

		ContactDao daoMock = PowerMockito.mock(ContactDao.class);

		when(daoMock.findInActiveRecords()).thenThrow(new NullPointerException());

		service.setDao(daoMock);

		List<Contact> list = service.getInActiveRecords();
		assertNull(list);
	}

	@Test
	@Ignore
	public void testgetInactiveRecords03() {
		ContactServiceImpl service = new ContactServiceImpl();

		ContactDao daoMock = PowerMockito.mock(ContactDao.class);

		List<Contact> contactsList = new ArrayList<Contact>();
		contactsList.add(new Contact(101, "John", 7997979l, ""));
		contactsList.add(new Contact(102, "Smith", 8997979l, ""));
		contactsList.add(new Contact(103, "Orlen", 6997979l, ""));

		when(daoMock.findInActiveRecords()).thenReturn(contactsList);

		service.setDao(daoMock);

		List<Contact> list = service.getInActiveRecords();
		assertNotNull(list);
	}

}
