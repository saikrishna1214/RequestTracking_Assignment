package org.imaginea.ServiceRequest;

import javax.swing.Spring;

import org.imaginea.requesttracking.dao.AccountDao;
import org.imaginea.requesttracking.dao.ServiceRequestDao;
import org.imaginea.requesttracking.dao.impl.AccountDaoImpl;
import org.imaginea.requesttracking.entity.Account;
import org.imaginea.requesttracking.entity.ServiceRequest;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Create the test case and checks whether 
     * obtained result and original result are true or not.
     *
     * @param testName name of the test case
     * @return 
     */
	private static ApplicationContext context;
	
	/**
	 * sets context application path to spring.xml
	 */
	
	@BeforeClass
	public static void getApplicationContext()
	{
		context = new ClassPathXmlApplicationContext("Spring.xml");
	}
	
	/**
	 * tests whether Account details are entered correctly or not. 
	 */
	
	@Test
    public void testAccount()
    {
		 
		AccountDao accountdao = (AccountDao) context.getBean("accountDaoImpl");
    	Account account = new Account();
    	account.setAccountid(1234);
    	account.setName("pqr");
		accountdao.createAccount(account);
		Account account2 = accountdao.getAccount(1234);
		Assert.assertEquals(account2.getName(), account.getName());
    }
	
	/**
	 * tests whether service details are entered correctly or not. 
	 */
	
	@Test
	public void testServiceRequest()
	{
		ServiceRequestDao servicereq = (ServiceRequestDao) context.getBean("servicereqimpl");
		ServiceRequest service = new ServiceRequest();
		service.setSrnumber("123");
		service.setAccountid(12);
		servicereq.createServiceRequest(service);
		ServiceRequest service2 = servicereq.getServiceRequest(service.getSrnumber());
		Assert.assertEquals(service.getSrnumber(),service2.getSrnumber());
	}

}
