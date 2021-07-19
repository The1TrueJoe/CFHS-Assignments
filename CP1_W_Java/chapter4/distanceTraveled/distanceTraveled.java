/**
This program calculates the distance a vehicle travels

@author JosephTelaak

10/5/18
 */



package distanceTraveled;

import java.util.Scanner;

public class distanceTraveled {

	private static Scanner keyboard;
	
	public static void main(String[] args) {
		
		// Doubles
		double distance,
		       speed,
		       time,
		       maxTime = 0;
		
		keyboard = new Scanner(System.in);
		
		// Input Validation
		do {
			System.out.println("How many hours did the vehicle travel");			// Vehicle travel time
			maxTime = keyboard.nextDouble();										// Vehicle travel time
			
			if (maxTime <= 1) {														// Invalid input
				System.out.println("Not Valid, enter a number above 1 \n");			// Invalid input
			}
			
		} while (maxTime <= 1);														// Invalid input
		
		do {
			System.out.println("How fast did the vehicle travel");					// Vehicle speed
			speed = keyboard.nextDouble();											// Vehicle speed
			
			if (speed <= 0) {														// Invalid input
				System.out.println("Not Valid, enter a number above 0 \n");			// Invalid input
				
			}
			
		} while (speed <= 0);														// Invalid input

		// Output 1
		System.out.println("\n\nHour \t\tDistance");
		System.out.println("-------------------------");
		
		// Output / Calcualtions
		for (time = 1; time <= maxTime; time++ ) {	
			distance = speed * time;												// Calculate distance
			System.out.println(time + "\t\t" + distance);							// Output distance
			
		}
		
	}

}
