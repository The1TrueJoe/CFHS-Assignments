/**
 * This program calculates falling distance
 * 
 * @author JosephTelaak
 * 
 * 10/30/18
 */

package fallingDistance;

import java.util.Scanner;

public class fallingDisance {

	public static void main(String[] args) {
		
		// Doubles
		final double GRAVITY = 9.8;
		
		double fallingDistance = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Get falling distance
		for(double time = 0; time <= 10; time++) {
		
			// Get falling distance
			double output = calculateFallingDistance(GRAVITY, time, fallingDistance);		// Get falling distance
			
			// Output
			System.out.printf("%,.2f Meters - For %,.0f Seconds \n", output, time);			// Output falling distance
		}
		
		// Close
		keyboard.close();																	// Close 

	}
	
	/**
	 * This method calculates falling distance
	 * 
	 * @author JosephTelaak
	 * 
	 * @param GRAVITY
	 * @param time
	 * @param fallingDistance
	 * @return
	 */
	
	public static double calculateFallingDistance(final double GRAVITY, double time, double fallingDistance) {
		// Calculate
		fallingDistance = 0.5 * GRAVITY * Math.pow(time, 2);								// Calculate falling distance
		
		// Returm
		return fallingDistance; 															// Return falling distance
		
	}

}
