package Q09;

import java.util.Scanner;

public class Sigma {
	
	public static String sigma(int n) {
		String sigma = "";
		int total = 0;
		
		
		for (int i = 1; i <= n; i++) {
			total += i;
			
			if (i == n) {
				sigma += i + " = ";
			} else {
				sigma += i + " + ";
			}
		}
		
		return sigma + total;
	}

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		int n = keyboard.nextInt();
		keyboard.close();
		
		System.out.println(sigma(n));
		
	}

}
