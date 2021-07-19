/**
This program sorts names

@author JosephTelaak

10/3/18
 */


package sortedNames;

import java.util.Scanner;

public class sortedNamesTest1 {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		
		// Strings
		String name1,
			   name2,
			   name3;
		
		keyboard = new Scanner(System.in);
		
		// Inputs 
		System.out.println("First name");
		name1 = keyboard.nextLine();
		
		System.out.println("Second name");
		name2 = keyboard.nextLine();
		
		System.out.println("Third name");
		name3 = keyboard.nextLine();
		
		// Sorting
		if (name1.compareToIgnoreCase(name2) <=0 && 
			name1.compareToIgnoreCase(name3) <=0) {
			
			System.out.println(name1);
			
		} else if (name2.compareToIgnoreCase(name1) <=0 &&
				   name2.compareToIgnoreCase(name3) <=0) {
			
			System.out.println(name2);
			
		} else if (name3.compareToIgnoreCase(name1) <=0 &&
				   name3.compareToIgnoreCase(name2) <=0) {
			
			System.out.println(name3);
			
		}
		
	}
}