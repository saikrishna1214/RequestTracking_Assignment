package org.imaginea.requesttracking.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.hibernate.cfg.CreateKeySecondPass;
import org.imaginea.requesttracking.dao.impl.AccountDaoImpl;
import org.imaginea.requesttracking.dao.impl.ActivityDaoImpl;
import org.imaginea.requesttracking.dao.impl.ServiceRequestDaoImpl;
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
	private ServiceRequestDaoImpl serviceRequestDao;
	
	@Autowired
	private AccountDaoImpl accountdao;
	
	@Autowired
	private ActivityService activityService;
	
	private Logger log = Logger.getLogger(ServiceRequestImpl.class);
	
	
	public void createServiceRequest(ApplicationContext context) {

		
		Scanner sc = new Scanner(System.in);
		ServiceRequest serviceReq = new ServiceRequest();
		serviceReq.setSrnumber("1");
		serviceReq.setAccountid(1234);
		serviceReq.setTitle("sample Service Request");
		serviceReq.setStatus("Active");
		Account account = accountdao.getAccount(1234);
		serviceReq.setAccount(account);
		account.getServicereq().add(serviceReq);
		Collection<Contact> contact = account.getContact();
		for(Contact cont : contact)
		{
			log.debug(cont.getContactid());
		}
		log.debug("select a primary contact");
		serviceReq.setContactid(sc.nextInt());
		serviceRequestDao.createServiceRequest(serviceReq);
		activityService.createActivity(serviceReq);


	}

}
