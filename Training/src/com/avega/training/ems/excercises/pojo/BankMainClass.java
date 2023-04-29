package com.avega.training.ems.excercises.pojo;

public class BankMainClass {

	public static void main(String[] args) {
		
		BankAccount bankAccount1 = new BankAccount("101","Kavya");
		BankAccount bankAccount2 = new BankAccount("102","Linjaraja");
		BankAccount bankAccount3 = new BankAccount("103","Gokul");
		
		BankAccount[] totalBankAccounts = {bankAccount1,bankAccount2,bankAccount3};
		Bank bank = new Bank();
		bank.setBankAccount(totalBankAccounts);
		
		//System.out.println(bank.checkBankAccount("104"));
		//System.out.println(bank.checkBankBalance("101"));
		System.out.println(bank.checkBankBalance("102"));
		
	}

}
