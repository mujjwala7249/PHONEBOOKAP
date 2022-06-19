package com.markadIt.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.markadIt.Model.Contact;
import com.markadIt.service.ContactServiceI;

@Controller
public class ContactController {
	
	private ContactServiceI contactServiceI;

	@PostMapping(value="/saveContact",consumes = "APPLICATION/JSON")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
	
		boolean save=contactServiceI.saveContact(contact);
		if(save == true) {
			String msg="Contact Saved Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}else {
			String msg="Contact Not Saved Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value="/getAllContact",produces = "APPLICATION/JSON")
	public ResponseEntity<List<Contact>> getAllContact(){
	
		List<Contact> list = contactServiceI.getAllContact();
		
		if(list !=null) {
			return new ResponseEntity<List<Contact>> (list,HttpStatus.OK);
		}else
		{
			String msg="Data Not found";
		return new ResponseEntity(msg,HttpStatus.BAD_REQUEST);
		}
	}
	

	}

