package org.imaginea.ServiceRequest;

import org.imaginea.requesttracking.dao.impl.AccountDaoImpl;
import org.imaginea.requesttracking.entity.Account;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Unit test for simple App.
 */
@Service (value = "apptest")
public class AppTest 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * @return 
     */
	@Autowired
	private AccountDaoImpl accountdao;
	@Test
    public void testAccount()
    {
    	Account account = new Account();
    	account.setAccountid(1234);
    	account.setName("pqr");
		accountdao.createAccount(account);
		Account account2 = accountdao.getAccount(1234);
		Assert.assertEquals(account2.getName(), account.getName());
    }

}
