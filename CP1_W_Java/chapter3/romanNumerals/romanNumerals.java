/**
This program converts numbers to Roman Numerals

@author JosephTelaak

9/7/18
 */



package romanNumerals;

import java.util.Scanner;

public class romanNumerals {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		
		// Integers
		int roman = 0;
		
		keyboard = new Scanner(System.in);
		
		// Input
		System.out.println("Enter a number 1 through 10");      // Asks for number
		roman = keyboard.nextInt();								// Scans number
		
		// If Statements
		
		if (roman == 1) {										// I
			System.out.println(roman + " = I");					// I
			
		} else if (roman == 2) {								// II
			System.out.println(roman + " = II");				// II
			
		} else if (roman == 3) {								// III
			System.out.println(roman + " = III");				// III
			
		} else if (roman == 4) {								// IV
			System.out.println(roman + " = IV");				// IV
			
		} else if (roman == 5) {								// V
			System.out.println(roman + " = V");					// V
			
		} else if (roman == 6) {								// VI
			System.out.println(roman + " = VI");				// VI
			
		} else if (roman == 7) {								// VII
			System.out.println(roman + " = VII");				// VII
			
		} else if (roman == 8) {								// VIII
			System.out.println(roman + " = VIII");				// VIII
			
		} else if (roman == 9) {								// IX
			System.out.println(roman + " = IX");				// IX
			
		} else if (roman == 10) {								// X
			System.out.println(roman + " = X");					// X
			
		} else {
			System.out.println("Not Valid");					// Not valid
		}
	}

}
