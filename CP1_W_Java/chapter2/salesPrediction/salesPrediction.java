/*
This program will predict the sales of a company given the percent of sales that they generate and the total sales

Joseph Telaak

8/29/18
*/

package salesPrediction;

import java.util.Scanner; 																// Imports Scanner

public class salesPrediction {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		
		// Sets doubles
		double  totalSales,
				salesPrediction;
		
		final double GENERATION_RATE = 0.62;
		
		keyboard = new Scanner(System.in); 												// Prepares Scanner
		
		// Get sales generation
		System.out.println("How much in sales did you generate?");						// Asks for sales generation
		totalSales = keyboard.nextInt();												// Asks for sales generation
		
		// Calculation
		salesPrediction = GENERATION_RATE * totalSales;									// Calculates the sales prediction
		
		// Output
		System.out.println("You are predicted to generate $" + salesPrediction);		// Prints results
		
	} // End Main

} // End Class
