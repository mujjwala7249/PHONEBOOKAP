package com.markadIt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.markadIt.Model.Contact;

@Service
public interface ContactServiceI {

	boolean saveContact(Contact contact);
	List<Contact>  getAllContact();
	
	Contact getContactFindById(Integer cid);
	
	public boolean UpdateContact(Contact contact);
	
	public boolean deleteById(Integer cid);
	
}
