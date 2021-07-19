/**
 * This program calculates the retail price
 * 
 * @author JosephTelaak
 * 
 * 10/30/18
 */

package retailPrice;

import java.util.Scanner;

public class retailPrice {

	public static void main(String[] args) {
		
		// Double
		double price,
		       markup,
		       finalValue = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Input
		System.out.println("Enter price");												// Get price
		price = keyboard.nextDouble();													// Get price
		
		System.out.println("Enter markup");												// Get markup
		markup = keyboard.nextDouble();													// Get markup
		
		// Calculate
		markup = markup / 100;															// Divide by 100
		
		// Calculate retail
		System.out.println(calculateRetail(price, markup, finalValue));					// Get retail price
		
		// Close
		keyboard.close();																// Close keyboard

	}
	
	/**
	 * This method calculates the retail price
	 * 
	 * @author JosephTelaak
	 * 
	 * @param price
	 * @param markup
	 * @param finalValue
	 * @return
	 */
	
	public static double calculateRetail(double price, double markup, double finalValue) {
		
		// Calculation
		finalValue = (price * markup) + price;											// Calculate value
		
		// Return
		return finalValue;																// Return value
		
	}

}
