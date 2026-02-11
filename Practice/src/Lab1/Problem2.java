package Lab1;


enum AccountType {
    SAVINGS,
    CHECKING
}

class BankAccount {
    private static int accountsCount = 0;   
    private final int accountNumber;
    private String ownerName;
    private double balance;
    private AccountType type;

    
    {
        accountsCount++; 
    }

    public BankAccount(String ownerName, AccountType type) {
        this(ownerName, type, 0);
    }

    public BankAccount(String ownerName, AccountType type, double balance) {
        this.ownerName = ownerName; 
        this.type = type;
        this.balance = balance;
        this.accountNumber = accountsCount;
    }
    
    public static int getAccountsCount() {
    	return accountsCount;
    }
    
    public int getAccountNumber() {
    	return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(double amount, String comment) {
        balance += amount;
        System.out.println("Deposit comment: " + comment);
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber + " | Owner: " + ownerName + " | Type: " + type + " | Balance: " + balance;
    }
    
}

public class Problem2 {
    public static void main(String[] args) {

        BankAccount user1 = new BankAccount("Alice", AccountType.SAVINGS);
        BankAccount user2 = new BankAccount("Bob", AccountType.CHECKING, 500);

        user1.deposit(200);
        user2.deposit(100, "Salary");

        System.out.println(user1);
        System.out.println(user2);

        System.out.println("Total accounts: " + BankAccount.getAccountsCount());
    }
}
