package com.avega.training.ems.excercises.pojo;

import java.util.Objects;

public class BankAccount {
	
	public static final  int INITIALBALANCE = 1000;
	
	private String accountNo;
	
	private String accountName;

	private   int balance ;
	
	
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		 this.balance = INITIALBALANCE;
		 
	}

	public BankAccount() {
		
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountName, accountNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Objects.equals(accountName, other.accountName) && Objects.equals(accountNo, other.accountNo);
	}


}
