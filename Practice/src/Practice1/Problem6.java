package Practice1;

//import java.util.Scanner;

public class Problem6 {

	public static boolean isPalindrome (String word) {
		
		int i = 0, j = word.length() - 1;
		
		while (j / 2 != i) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
			j--;
			i++;
		}
		return true;

	}
//	
//	public static void main (String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String word = scan.next();
//		
//		if (isPalindrome(word)) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
//	}

}
