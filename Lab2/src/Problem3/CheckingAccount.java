package Problem3;

public class CheckingAccount extends Account {
	private int numberOfTransactions;
	private final int FREE_TRANSACTIONS;

	public CheckingAccount(int account) {
		super(account);
		
		numberOfTransactions = 0;
		FREE_TRANSACTIONS = 10;
	}
	
	
	@Override
	public void deposit(double sum) {
		super.deposit(sum);
		numberOfTransactions++;
		
	}
	
	@Override
	public void withdraw(double sum) {
		super.withdraw(sum);
		numberOfTransactions++;
	}
	
	
	public void deductFee() {
		if (numberOfTransactions > FREE_TRANSACTIONS) {
			int extraTransactions = numberOfTransactions - FREE_TRANSACTIONS;
            double totalFee = extraTransactions * 0.02;
            
            super.withdraw(totalFee);
		}
	}
	
	
}