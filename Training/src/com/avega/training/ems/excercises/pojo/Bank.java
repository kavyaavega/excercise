package com.avega.training.ems.excercises.pojo;

public class Bank {
	
private	 BankAccount[] bankAccount  ;

public BankAccount[] getBankAccount() {
	return bankAccount;
}

public void setBankAccount(BankAccount[] bankAccount) {
	this.bankAccount = bankAccount;
}

public boolean checkBankAccount(String accountNo) {
	boolean IsAccountNumberAvailable = false;
	for(BankAccount account: bankAccount) {
		if(account.getAccountNo().equals(accountNo))
			IsAccountNumberAvailable = true;
	}
	if(IsAccountNumberAvailable)
		return true;
	else
		return false;	
}

public int checkBankBalance(String accountNo) {
	for(BankAccount account: bankAccount) {
		if(account.getAccountNo().equals(accountNo))
			return account.getBalance();	
	}
	return 0;
  }

public boolean checkdeposite(String accountNo,double amount) {
	//change return type
	boolean IsAccountNumberAvailable = false;
	int totalAmount = 0;
	for(BankAccount account: bankAccount) {
		if(account.getAccountNo().equals(accountNo)) {
			totalAmount = account.getBalance() + (int)amount;
			account.setBalance(totalAmount);
			IsAccountNumberAvailable= true;
			break;
		} 		
    }
	   if(IsAccountNumberAvailable)
		     return true;
	
	 else
		     return false;
}

public boolean checkWithdraw(String accountNo,double amount) {
	//change naming convention
	boolean IsAccountNumberAvailable = false;
	int withdrawAmount = 0;
	for(BankAccount account: bankAccount) {
		if(account.getAccountNo().equals(accountNo)) {
			if(account.getBalance() >= amount) {
				withdrawAmount = account.getBalance() - (int)amount;
			account.setBalance(withdrawAmount);
			IsAccountNumberAvailable= true;
			break;
        }
	}	
 }	
	 if(IsAccountNumberAvailable)
	     return true;

 else
	     return false;
}	

public void transferMoney(String fromAccount, String toAccount, double amount) {
	if(checkBankAccount(fromAccount)) {
		checkWithdraw(fromAccount, (int)amount); 
	}
	
	if(checkBankAccount(fromAccount)) {
		System.out.println("Transcation is successful completed");	
		checkdeposite(toAccount, amount); 
	}		
}
		

}
