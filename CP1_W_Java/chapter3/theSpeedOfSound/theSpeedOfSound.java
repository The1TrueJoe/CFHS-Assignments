/**
This program calculates the time it will take for a sound wave to pass through a medium

@author JosephTelaak

10/5/18

******** Example Output ********

---- Input ----

What medium do you want to use
"wAtEr"
What distance will the sound wave travel
"2200"

---- Expected Output ----

The time it will take for the sound wave to travel through 2200ft of water is 2s, it will travel at 1100ft/s
 */


package theSpeedOfSound;

import java.util.Scanner;

public class theSpeedOfSound {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		
		// Doubles and Strings
		final double AIRSPEED   = 1100,
				     WATERSPEED = 4900,
				     STEELSPEED = 16400;
		
		double time,
			   distance,
			   speed;
		
		String medium;
		
		keyboard = new Scanner(System.in);
		
		// Inputs
		System.out.println("What medium do you want to use");				// Gets medium
		medium = keyboard.nextLine();										// Gets medium
		
		System.out.println("What distance will the sound wave travel");		// Gets distance
		distance = keyboard.nextDouble();									// Gets distance
		
		// Switch and Case
		switch (medium.toLowerCase()) {										// Turns medium to all lower case
		
			case "air":														// Looks for "air"
				time = distance / AIRSPEED;									// Time Calculation
				speed = AIRSPEED;											// Sets speed for output
				break;
			
			case "water":													// Looks for "water"
				time = distance / WATERSPEED;								// Time Calculation
				speed = WATERSPEED;											// Sets speed for output
				break;
			
			case "steel":													// Looks for steel
				time = distance / STEELSPEED;								// Time Calculation
				speed = STEELSPEED;											// Sets speed for output
				break;
			
			default:														// Defaults
				time = 0;													// Defaults
				speed = 0;													// Defaults
				System.out.println("ERR");									// ERROR
				System.exit(0);												// Exit
		}
		
		// Output
		System.out.printf("The time it will take for the sound wave to travel through %,.0fft of " + medium.toLowerCase() + 
				          " is %,.6fs, it will travel at %,.0fft/s" , distance, time, speed);
		
	}

}
