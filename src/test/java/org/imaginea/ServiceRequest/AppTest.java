package org.imaginea.ServiceRequest;

import javax.swing.Spring;

import org.imaginea.requesttracking.dao.AccountDao;
import org.imaginea.requesttracking.dao.impl.AccountDaoImpl;
import org.imaginea.requesttracking.entity.Account;
import org.junit.Assert;
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
     * Create the test case
     *
     * @param testName name of the test case
     * @return 
     */
	@Test
    public void testAccount()
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		AccountDao accountdao = (AccountDao) context.getBean("accountDaoImpl");
    	Account account = new Account();
    	account.setAccountid(1234);
    	account.setName("pqr");
		accountdao.createAccount(account);
		Account account2 = accountdao.getAccount(1234);
		Assert.assertEquals(account2.getName(), account.getName());
    }

}
