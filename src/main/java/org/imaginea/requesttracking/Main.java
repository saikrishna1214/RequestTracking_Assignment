package org.imaginea.requesttracking;

import org.imaginea.requesttracking.service.AccountService;
import org.imaginea.requesttracking.service.ContactService;
import org.imaginea.requesttracking.service.ServiceRequestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * creates objects for classes ServiceRequestService, AccountService
 * and ContactService by using their Beans. 
 * @author saikrishnak
 *
 */

public class Main {
	
	/**
	 * creates ServiceRequest,Account and Contact services
	 * by calling respective create methods.
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ServiceRequestService serviceReq = (ServiceRequestService) context.getBean("servicerequest");
		AccountService account = (AccountService) context.getBean("accountservice");
		ContactService contact = (ContactService) context.getBean("contactservice");
		account.createAccount();
		contact.createContact();
		serviceReq.createServiceRequest(context);
	}

}
