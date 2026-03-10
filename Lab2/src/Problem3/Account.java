package Problem3;

public class Account{
	private double balance; // The current balance
	private int accNumber; // The account number
	
	public Account(int a){
		balance = 0.0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		this.balance += sum;
	}
	
	public void withdraw(double sum) { 
		if (sum <= balance) {
	        balance -= sum;
	    }
	}
	
	public void setBalance(double balance) { 
		this.balance = balance;
	}
	
	public double getBalance() { 
		return this.balance;
	}
	
	public int getAccountNumber() {
		return this.accNumber;
	}
	
	public void transfer(double amount, Account other) {
		this.balance -= amount;
		other.balance += amount;
	}
	
	public String toString() { 
		return "Account number: " + getAccountNumber() + "\nBalance: " + getBalance() + "\n";
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
