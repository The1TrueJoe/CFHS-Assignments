/**
 * This program estimates the cost of a paint job
 * 
 * @author JosephTelaak
 * 
 * @date_created 10/30/18 
 * @date_edited 10/31/18
 */

package paintJobEstimator;

import java.util.Scanner;

public class paintJobEstimator2 {

	public static void main(String[] args) {
		
		// Constants
				final double SQUARE_FEET_PER_GALLON = 115,
						     HOURS_PER_115SQFT = 8,
						     PAY_RATE = 18;
				
				// Doubles
				double gallons		 = 0,
				       laborHours	 = 0,
				       paintCost	 = 0,
				       laborCharge	 = 0,
				       totalCost	 = 0,
				       squareFootage = 0,
				       rooms	     = 0,
				       priceOfPaint	 = 0;
				
				// Scanner object
				Scanner keyboard = new Scanner(System.in);
				
				// Input
				System.out.println("Enter rooms");																// Rooms
				rooms = keyboard.nextDouble();																	// Rooms
				
				System.out.println("Enter price of paint");														// Gets paint price
				priceOfPaint = keyboard.nextDouble();															// Gets paint price
				
				for (int i = 1; i <= rooms; i++) {
					System.out.println("Enter wall space per room");											// Wall space
					squareFootage += keyboard.nextDouble();														// Wall space
					
					
				}
				
				// Get numbers
				gallons += getNumOfGal(gallons, rooms, squareFootage, SQUARE_FEET_PER_GALLON, keyboard);	// Get gallons
				laborHours += getHoursOfLabor(squareFootage, HOURS_PER_115SQFT);							// Get labor hours
				paintCost += getPaintCost(paintCost, priceOfPaint, gallons, keyboard);						// Get paint cost
				laborCharge += getLaborCharge(laborCharge, PAY_RATE, laborHours);							// Get labor charge
				
				// Total and display
				totalCost = getTotalCost(totalCost, laborCharge, paintCost);									// Get total cost
				displayData(gallons, laborHours, paintCost, laborCharge, totalCost);							// Display data
				
	}
	
	/**
	 * This method gets the number of paint gallon
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param gallons
	 * @param rooms
	 * @param squareFootage
	 * @param SQUARE_FEET_PER_GALLON
	 * @param keyboard
	 * @return
	 */

	public static double getNumOfGal(double gallons, double rooms, double squareFootage, 
			                         double SQUARE_FEET_PER_GALLON, Scanner keyboard) {
		
		// Calculation													// Total Square Footage
		gallons =  squareFootage / SQUARE_FEET_PER_GALLON;												// Gets gallons
		
		// Return
		return gallons;																					// Returns gallons
	}
	
	/**
	 * This method gets the hours of labor
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param squareFootage
	 * @param HOURS_PER_115SQFEET
	 * @return
	 */
	
	public static double getHoursOfLabor(double squareFootage, double HOURS_PER_115SQFEET) {
		
		// Calculation
		squareFootage = (squareFootage / 115) * HOURS_PER_115SQFEET;														// Hours required
		
		// Return
		return squareFootage;																				// Retturns labor hours
	}
	
	/**
	 * This method gets the paint cost
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param paintCost
	 * @param priceOfPaint
	 * @param gallons
	 * @param keyboard
	 * @return
	 */
	
	public static double getPaintCost(double paintCost, double priceOfPaint, double gallons, Scanner keyboard) {
		// Caclulation
		paintCost = gallons * priceOfPaint;																// Gets total paint cost		
		
		// Return
		return paintCost;																				// Returns paint cost
	}
	
	/**
	 * This method gets the labor charge
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param laborCharge
	 * @param PAY_RATE
	 * @param laborHours
	 * @return
	 */
	
	public static double getLaborCharge(double laborCharge, double PAY_RATE, double laborHours) {
		
		// Calculation
		laborCharge = PAY_RATE * laborHours;															// Gets labor charge
		
		// Return
		return laborCharge;																				// Returns charge
	}
	
	/**
	 * This method gets the total cost
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param totalCost
	 * @param laborCharge
	 * @param paintCost
	 * @return
	 */
	
	public static double getTotalCost(double totalCost, double laborCharge, double paintCost) {
		
		// Calculation
		totalCost = laborCharge + paintCost;															// Calculates total cost
		
		// Return
		return totalCost;																				// Returns total cost
	}
	
	/**
	 * This method displays all data
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param gallons
	 * @param laborHours
	 * @param paintCost
	 * @param laborCharge
	 * @param totalCost
	 */
	
	public static void displayData(double gallons, double laborHours, double paintCost, double laborCharge, double totalCost) {
		
		// Output
		System.out.println(String.format("Bill \n" + 													// Prints
										"----------------------\n" +
										"Gallons of Paint: %,.0f \n" +
										"Labor Hours: %,.0f \n\n" +
										"Paint Cost: $%,.0f \n" +
										"Labor Charge: $%,.0f \n" +
										"----------------------\n" +
										"Total Cost: $%,.2f",
										gallons, laborHours, paintCost, laborCharge, totalCost));
	}
	
	/**
	 * Answer
	 * 
	 * Enter rooms
	 * 3
	 * Enter price of paint
	 * 20
	 * Enter wall space per room
	 * 100
	 * Enter wall space per room
	 * 123
	 * Enter wall space per room
	 * 456
	 * 
	 * Answer = 968
	 */

}
