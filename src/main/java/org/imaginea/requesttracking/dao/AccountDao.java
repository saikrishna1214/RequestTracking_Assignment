package org.imaginea.requesttracking.dao;

import org.imaginea.requesttracking.entity.Account;

public interface AccountDao {
	
	public void createAccount(Account account);
	
	public Account getAccount(int id);

}
