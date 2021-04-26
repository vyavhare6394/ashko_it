package com.ashoit.service;

import java.util.List;

import com.ashoit.dao.ContactDao;
import com.ashok.model.Contact;
import com.ashokit.exceptions.NoDataFoundException;

public class ContactServiceImpl implements ContactService {

	private ContactDao contactDao;

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	public String getNameById(Integer id) {
		String name = contactDao.findNameById(id);

		// logic
		String formattedName = name.toUpperCase();

		return formattedName;
	}

	public List<String> getAllContactNames() {
		List<String> names = contactDao.findNames();
		if (names!=null && names.size()>0) {
			return names;
		}
		return null;
	}

	public Contact getContactById(Integer id) {
		Contact contact = contactDao.findById(id);
		if (contact == null) {
			throw new NoDataFoundException("No data found");
		}
		return contact;
	}

}
