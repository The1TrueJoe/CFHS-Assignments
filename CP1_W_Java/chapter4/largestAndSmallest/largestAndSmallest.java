/**
This program pics the largest and smallest numbers

@author JosephTelaak

10/17/18
 */

package largestAndSmallest;

import java.util.Scanner;

public class largestAndSmallest {

	private static Scanner keyboard;
	
	public static void main(String[] args) {
		
		// Ints
		int number = -99,
		    smallestNumber = 0,
		    largestNumber = 1;
		
		String output = "";

		keyboard = new Scanner(System.in);
		
		// Get numbers
		do {
			
			// Input
			System.out.println("Enter an integer");									// Get int
			number = keyboard.nextInt();											// Get int
			
			// Sorts
			if (number == -99) {													// If exit value
			} else if (number > largestNumber) {									// If it is the largest
				largestNumber = number;												// Sets largest number
				
			} else if (number < smallestNumber) {									// If it is the smallest
				smallestNumber = number;											// Sets smallest
				
			}
			
			output += number + "\n";												// Creates history
			
		} while (number != -99);
		
		// Output
		System.out.println(output);
		System.out.println("\n" + "Largest Number " + largestNumber + "\n" + 
		                          "Smallest Number " + smallestNumber +"\n\n"
		                          );
		
	}

}
