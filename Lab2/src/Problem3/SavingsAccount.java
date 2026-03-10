package Problem3;

public class  SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(int account, double rate) {
		super(account);

		this.interestRate = rate;
	}
	
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void addInterest() {
		double currentBalance = this.getBalance();
		double interest = this.getInterestRate() / 100;
		this.deposit(currentBalance * interest);
	}
}