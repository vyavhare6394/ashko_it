package com.tekleads.service;

import java.util.List;

import com.tekleads.dao.ContactDao;
import com.tekleads.exception.NoDataFoundException;
import com.tekleads.model.Contact;
import com.tekleads.util.EmailUtils;

public class ContactServiceImpl implements ContactService {

	private ContactDao dao;

	private EmailUtils emailUtils;

	// Alt+Shift+S+R
	public void setDao(ContactDao dao) {
		this.dao = dao;
	}

	public void setEmailUtils(EmailUtils emailUtils) {
		this.emailUtils = emailUtils;
	}

	public Long getContactNumByName(String name) {
		Long number = dao.findContactNumByName(name);
		return number;
	}

	public List<Contact> getAllContacts() {
		List<Contact> contacts = dao.findAll();
		if(contacts==null) {
			throw new NoDataFoundException();
		}
		return contacts;
	}

	public List<Contact> getInActiveRecords() {
		List<Contact> contacts = dao.findInActiveRecords();
		if(contacts==null) {
			throw new NoDataFoundException();
		}
		return contacts;
	}

	public boolean insertContact(Contact c) {
		boolean isSaved = dao.saveContact(c);
		boolean isSent = false;
		if (isSaved) {
			isSent = emailUtils.sendEmail(c.getContactEmail());
		}
		return isSent;
	}

}
