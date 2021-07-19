/**
This program finds the um of numbers

@author JosephTelaak

10/15/18
 */

package sumOfNumbers;

import java.util.Scanner;

public class sumOfNumbers {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		
		// Doubles
		double num = 0,
			   total = 0;
		
		keyboard = new Scanner(System.in);
		
		// Input
		System.out.println("Enter Number");							// Gets number
		num = keyboard.nextDouble();								// Gets number
		
		// Calculation
		for (int i = 1; i <= num; i++) {							// Repeatedly adds the count and number
			total += i;
			
		}
		
		// Output
		System.out.println("For all numbers from 1 to " + num + ", the total would be:" + total);
		
	}

}
