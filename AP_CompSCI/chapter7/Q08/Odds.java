package Q08;

import java.util.Scanner;

public class Odds {
	
	public static int addOdds(int n) {
		int total = 0;
		
		for (int i = 1; i <= n; i += 2) {
			total += i;
		}
		
		return total;
	}

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		int n = keyboard.nextInt();
		
		System.out.println("Total Odd: " + addOdds(n));
		
		keyboard.close();

	}

}
