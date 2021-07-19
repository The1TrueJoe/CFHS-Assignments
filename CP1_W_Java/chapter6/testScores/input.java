package testScores;

import java.util.Scanner;

public class input {

	// Keyboard object
	private static Scanner keyboard = new Scanner(System.in);
	
	/**
	 * 
	 * @return
	 */
	
	public static double getScores() {
		// Double
		double score;
		
		// Input
		System.out.println("Enter score");
		score = keyboard.nextDouble();
		
		// Return
		return score;
		
	}
	
	
	
}
