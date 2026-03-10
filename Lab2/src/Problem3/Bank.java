package Problem3;

import java.util.Vector;

public class Bank {
	private Vector<Account> accounts;
	
	public Bank() {
		accounts = new Vector<>();	
	}
	
	public void openAccount(Account account) {
		accounts.add(account);
	}
	
	public void closeAccount(Account account) {
		accounts.remove(account);
	}
	
	public void update() {
		for (Account account: accounts) {
			
			if (account instanceof SavingsAccount) {
	            ((SavingsAccount) account).addInterest();
	        }

	        if (account instanceof CheckingAccount) {
	            ((CheckingAccount) account).deductFee();
	        }
		}
	}
}
