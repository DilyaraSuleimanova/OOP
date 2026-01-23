package Practice1;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grade_number = scan.nextInt();
		
		if (grade_number >= 95) {
            System.out.println("Grade A");
        } 
		else if (grade_number >= 90) {
            System.out.println("Grade A-");
        } 
		else if (grade_number >= 85) {
            System.out.println("Grade B+");
        }
		else if (grade_number >= 80) {
            System.out.println("Grade B");
        }
		else if (grade_number >= 75) {
            System.out.println("Grade B-");
        }
		else if (grade_number >= 70) {
            System.out.println("Grade C+");
        }
		else if (grade_number >= 65) {
            System.out.println("Grade C");
        }
		else if (grade_number >= 60) {
            System.out.println("Grade C-");
        }
		else if (grade_number >= 55) {
            System.out.println("Grade D+");
        }
		else if (grade_number >= 50) {
            System.out.println("Grade D");
        }
		else {
            System.out.println("Fail");
        }

	}

}
