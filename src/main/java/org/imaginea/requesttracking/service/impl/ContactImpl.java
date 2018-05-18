package org.imaginea.requesttracking.service.impl;

import org.imaginea.requesttracking.dao.AccountDao;
import org.imaginea.requesttracking.dao.ContactDao;
import org.imaginea.requesttracking.entity.Account;
import org.imaginea.requesttracking.entity.Contact;
import org.imaginea.requesttracking.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service (value = "contactservice")
public class ContactImpl implements ContactService {
	
	@Autowired
	private ContactDao contactdao;
	@Autowired
	private AccountDao accountdao;
	
	public void createContact() {
		Account account;
		
		Contact contact  = new Contact();
		contact.setContactid(2345);
		account = accountdao.getAccount(1234);
		contact.setAccount(account);
		account.getContact().add(contact);
		contactdao.createContactDao(contact);
		
		Contact contact1  = new Contact();
		contact1.setContactid(2346);
		account = accountdao.getAccount(1234);
		contact1.setAccount(account);
		account.getContact().add(contact1);
		contactdao.createContactDao(contact1);
		
		Contact contact2  = new Contact();
		contact2.setContactid(2347);
		account = accountdao.getAccount(1234);
		contact2.setAccount(account);
		account.getContact().add(contact2);
		contactdao.createContactDao(contact2);
		
		Contact contact3  = new Contact();
		contact3.setContactid(2348);
		account = accountdao.getAccount(1235);
		contact3.setAccount(account);
		account.getContact().add(contact3);
		contactdao.createContactDao(contact3);
		
		Contact contact4  = new Contact();
		contact4.setContactid(2349);
		account = accountdao.getAccount(1235);
		contact4.setAccount(account);
		account.getContact().add(contact4);
		contactdao.createContactDao(contact4);
	}

}
