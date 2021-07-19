/**
This program prints a square diaplay

@auhor JosephTelaak

10/18/18
 */

package squareDisplay;

import java.util.Scanner;

public class squareDisplay {

	private static Scanner keyboard;
	
	public static void main(String[] args) {
		
		// Double
		double num;
		
		keyboard = new Scanner(System.in);
		
		// Input validation
		do {
			// Input
			System.out.println("Enter num");						// Get num
			num = keyboard.nextDouble();							// Get num
			
			if (num >= 15) {										// Incorrect
				System.out.println("Enter a number under 15");
				
			}
		} while (num >= 15);
		
		// Print dispalay
		for (int i = 1; num >= i; i++ ) {							// Col
			for (int a = 1; num >= a; a++) {						// Row
				System.out.print("X");								// Add X
				
			}
			System.out.println();									// Next LN
		}
		
	}

}
