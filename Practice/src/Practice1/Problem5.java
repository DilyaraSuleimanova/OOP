package Practice1;

import java.util.Scanner;


public class Problem5 {

	public static void main(String[] args) {
		int initial_balance, interest;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("initial balance: ");
		initial_balance = scan.nextInt();
		System.out.print("interest: ");
		interest = scan.nextInt();
		
		double new_balance = initial_balance;
		new_balance += initial_balance * interest / 100;
		
		System.out.println("new balance: " + new_balance);
		
		

	}

}
