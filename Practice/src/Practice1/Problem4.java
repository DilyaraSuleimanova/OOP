package Practice1;

import java.util.Scanner;
import java.lang.Math;

public class Problem4 {

	public static void main(String[] args) {
		int a, b, c;
		double D;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a = ");
		a = scan.nextInt();
		System.out.println("b = ");
		b = scan.nextInt();
		System.out.println("c = ");
		c = scan.nextInt();
		
		scan.close();
		
		D = b * b - 4 * a * c;
		
		if (D > 0) {
			double x1, x2;
			x1 = (-b + Math.sqrt(D)) / (2 * a);
			x2 = (-b - Math.sqrt(D)) / (2 * a);
			
			System.out.println("x1 = " + x1 + "; " + "x2 = " + x2);
		}
		else if (D == 0) {
			double x = (-b) / (2 * a);
			
			System.out.println("x = " + x);
		}
		else {
			System.out.println("Error");
		}

	}

}
