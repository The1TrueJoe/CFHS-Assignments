package Q12;

import java.util.Scanner;

public class Digits {
	
	public static int getSum(int n) {
		int total = 0;

		while (n > 0) {
			total += n % 10;
			n /= 10;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = keyboard.nextInt();
		keyboard.close();
		
		System.out.println("Total: " + getSum(n));

	}
}