package Problem3;

public class Main {
	public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount saving1 = new SavingsAccount(1, 5.0);
        saving1.deposit(1000);

        CheckingAccount checking1 = new CheckingAccount(2);
        checking1.deposit(500);

        System.out.println("=== INITIAL DATA ===");
        saving1.print();
        checking1.print();
        
        
        for (int i = 0; i < 12; i++) {
        	checking1.deposit(10);
        }

        bank.openAccount(saving1);
        bank.openAccount(checking1);

        System.out.println("\n=== BEFORE UPDATE ===");
        saving1.print();
        checking1.print();


        bank.update();

        System.out.println("\n=== AFTER UPDATE ===");
        saving1.print();
        checking1.print();
    }
}
