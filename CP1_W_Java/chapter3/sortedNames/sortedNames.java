/**
This program sorts names. This program uses nested if's to decide how to order the names.

@author JosephTelaak

10/3/18


******** Expected Output ********

---- Input ----

First name
"Bill"
Second name
"Alex"
Third name 
"Carter"

---- Expected Output ----

Alex
Bill
Carter


 */

package sortedNames;

import java.util.Scanner;

public class sortedNames {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		
		// Strings
		String name1,
			   name2,
			   name3;
		
		keyboard = new Scanner(System.in);
		
		// Inputs 
		System.out.println("First name");										// Gets first name to sort
		name1 = keyboard.nextLine();											// Gets first name to sort
		
		System.out.println("Second name");										// Gets second name to sort
		name2 = keyboard.nextLine();											// Gets second name to sort
		
		System.out.println("Third name");										// Gets third name to sort
		name3 = keyboard.nextLine();											// Gets third name to sort
		
		// Adds lines
		System.out.println("\n\n\n\n\n\n\n\n");									// Adds lines
		
		// Sorting
		if (name1.compareToIgnoreCase(name2) <=0 && 							// Name 1 is greater than 2 and 3
			name1.compareToIgnoreCase(name3) <=0) {
			
			if (name2.compareToIgnoreCase(name3) <= 0) {						// Name 2 is greater than 3
				System.out.println(name1 + "\n" + name2 + "\n" + name3);		// Print Name 1, Name 2, Name 3
				
			} else {															// Name 3 is greater than 2
				System.out.println(name1 + "\n" + name3 + "\n" + name2);		// Print Name 1, Name 3, Name 2
				
			} 
			
		} else if (name2.compareToIgnoreCase(name1) <=0 && 						// Name 2 is greater than 1 and 3
				   name2.compareToIgnoreCase(name3) <=0) {
			
			if (name1.compareToIgnoreCase(name3) <=0) {							// Name 1 is greater than 3
				System.out.println(name2 + "\n" + name1 + "\n" + name3);		// Print Name 2, Name 1, Name 3
				
			} else {															// Name 3 is greater than 1
				System.out.println(name2 + "\n" + name3 + "\n" + name1);		// Print Name 2, Name 3, Name 1
				
			}
			
		} else if (name3.compareToIgnoreCase(name1) <=0 &&						// Name 3 is greater than 1 and 2
				   name3.compareToIgnoreCase(name2) <=0) {
			
			if (name1.compareToIgnoreCase(name2) <=0) {							// Name 1 is greater than 2
				System.out.println(name3 + "\n" + name2 + "\n" + name1);		// Print Name 3, Name 2, Name 1
				
			} else {															// Name 2 is greater than 1
				System.out.println(name3 + "\n" + name1 + "\n" + name2);		// Print Name 3, Name 1, Name 2
				
			}
			
		}			// Main sort
	} 				// Main
} 					// Class
