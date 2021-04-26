package com.ashoit.service;

import java.util.List;

import com.ashok.model.Contact;

public interface ContactService {

	public String getNameById(Integer id);

	public List<String> getAllContactNames();

	public Contact getContactById(Integer id);
}
