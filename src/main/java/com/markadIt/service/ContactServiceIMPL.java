package com.markadIt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markadIt.Model.Contact;
import com.markadIt.repository.ContactRepository;

@Service
public class ContactServiceIMPL implements ContactServiceI {
	private static final String save = null;
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {
		Contact save = contactRepository.save(contact);
		if(save != null) {
			return true;
		}else {
			
		return false;
	}
	}

	@Override
	public List<Contact> getAllContact() {
List<Contact> contacts = contactRepository.findAll();
		
		if (contacts !=null ) {
			return contacts;
		}else {
			return null;
		}
		
	}

}
