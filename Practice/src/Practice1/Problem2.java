package Practice1;

import java.util.Scanner;
import java.lang.Math;

public class Problem2 {

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		scan.close();
		
		int area, perimeter;
		double diagonal;
		
		area = a * a;
		perimeter = 4 * a;
		diagonal = a * Math.sqrt(2);
		
		System.out.println("Area = " + area + "\nPerimeter = " + perimeter + "\nDiagonal = " + diagonal);
		
	}

}
