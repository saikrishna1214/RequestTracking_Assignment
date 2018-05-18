package org.imaginea.requesttracking.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.imaginea.requesttracking.dao.AccountDao;
import org.imaginea.requesttracking.dao.ActivityDao;
import org.imaginea.requesttracking.dao.ServiceRequestDao;
import org.imaginea.requesttracking.entity.Account;
import org.imaginea.requesttracking.entity.Activity;
import org.imaginea.requesttracking.entity.Contact;
import org.imaginea.requesttracking.entity.ServiceRequest;
import org.imaginea.requesttracking.service.ActivityService;
import org.imaginea.requesttracking.service.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service(value = "servicerequest")
public class ServiceRequestImpl implements ServiceRequestService {

	@Autowired
	private ServiceRequestDao serviceRequestDao;
	
	@Autowired
	private AccountDao accountdao;
	
	@Autowired
	private ActivityService activityService;
	
	
	
	
	public void createServiceRequest(ApplicationContext context) {

		
		Scanner sc = new Scanner(System.in);
		ServiceRequest serviceReq = new ServiceRequest();
		serviceReq.setSrnumber("1");
		serviceReq.setAccountid(1234);
		serviceReq.setTitle("sample Service Request");
		serviceReq.setStatus("Active");
		Account account = accountdao.getAccount(1234);
		Collection<Contact> contact = account.getContact();
		for(Contact cont : contact)
		{
			System.out.println(cont.getContactid());
		}
		System.out.println("select a primary contact");
		serviceReq.setContactid(sc.nextInt());
		serviceRequestDao.createServiceRequest(serviceReq);
		activityService.createActivity(serviceReq);


	}

}
