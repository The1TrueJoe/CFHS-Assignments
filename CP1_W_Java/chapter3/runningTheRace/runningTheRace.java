/**
This program sorts running times

@author JosephTelaak

10/8/18
 */


package runningTheRace;

import java.util.Scanner;

public class runningTheRace {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		
		// Doubles and strings
		double time1,
			   time2,
			   time3;
		
		String person1,
		       person2,
		       person3;
		
		keyboard = new Scanner (System.in);
		
		// Inputs
		System.out.println("What is the name of the first runner");					// First runner
		person1 = keyboard.nextLine();												// First runner
		
		System.out.println("What is the name of the second runner");				// Second runner
		person2 = keyboard.nextLine();												// Second runner
		
		System.out.println("What is the name of the third runner");					// Third runner
		person3 = keyboard.nextLine();												// Third runner
		
		
		System.out.println("What is the running time of " + person1);				// First runner time
		time1 = keyboard.nextDouble();												// First runner time
		
		System.out.println("What is the running time of " + person2);				// Second runner time
		time2 = keyboard.nextDouble();												// Second runner time
		
		System.out.println("What is the running time of " + person3);				// Third runner time
		time3 = keyboard.nextDouble();												// Third runner time
		
		// Decision
		if (time1 >= time2 && time1 >= time3) {										// Time 1 greater than time 2 and 3
		
			if (time2 >= time3) {													// Time 2 greater than 3
				// Output
				System.out.println(person1 + " " + time1);
				System.out.println(person2 + " " + time2);
				System.out.println(person3 + " " + time3);
				
			} else {																// Time 3 greater than 2
				// Output
				System.out.println(person1 + " " + time1);
				System.out.println(person3 + " " + time3);
				System.out.println(person2 + " " + time2);
				
			}
		
		} else if (time2 >= time1 && time2 >= time3) {								// Time 2 greater than time 1 and 3
			
			if (time1 >= time3) {													// Time 1 greater than 3
				// Output
				System.out.println(person2 + " " + time2);
				System.out.println(person1 + " " + time1);
				System.out.println(person3 + " " + time3);
				
			} else {																// Time 3 greater than 1
				// Output
				System.out.println(person2 + " " + time2);
				System.out.println(person3 + " " + time3);
				System.out.println(person1 + " " + time1);
				
			}
			
		} else if (time3 >= time2 && time3 >= time1) { 								// Time 3 greater than 2 and 1
		
			if (time2 >= time1) {													// Time 2 greater than 1
				// Output
				System.out.println(person3 + " " + time3);
				System.out.println(person2 + " " + time2);
				System.out.println(person1 + " " + time1);
				
			} else {																// Time 1 greater than 2
				// Output
				System.out.println(person3 + " " + time3);
				System.out.println(person1 + " " + time1);
				System.out.println(person2 + " " + time2);
			}
			
		} else {																	// Else
			System.out.println("ERR");
			System.exit(0);
		}

		
		
	}

}
