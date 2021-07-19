package conversionProgram;

import java.util.Scanner;

public class conversionProgram {

	public static void main(String[] args) {
		// Ints and doubles
		int menuNum;
		double meters;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			// Display menu
			menu();
			
			do {
				// Input
				menuNum = keyboard.nextInt();
				
				// Input validation
				if (menuNum <= 0) {
					// Ouput
					System.out.println("Try Again");
				}
				
			} while (menuNum <= 0);
			
			// Input
			System.out.println("Enter Distance in Meters (M)");
			meters = keyboard.nextDouble();
			
			// Menu
			switch (menuNum) {
				case 1:
					showKilometers(meters);
					break;
				case 2:
					showCentimeters(meters);
					break;
				case 3:
					showMilimeters(meters);
					break;
				case 4:
					showNanometers(meters);
					break;
				case 5:
					showMiles(meters);
					break;
				case 6:
					showFeet(meters);
					break;
				case 7:
					showInches(meters);
					break;
				case 8:
					System.exit(0);
					break;
			}
			
		} while (menuNum != 8);
		
		// Close
		keyboard.close();
	}
	
	/**
	 * This method shows menu
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/7/18
	 * @date_edited 11/7/18
	 */
	
	public static void menu() {
		// Output
		System.out.println("Menu: \n" + 
						   "1) Kilometers \n" + 
						   "2) Centimeters \n" +
						   "3) Milimeters \n" +
						   "4) Nanometers \n" +
						   "5) Miles \n" +
						   "6) Feet \n" +
						   "7) Inches \n" +
						   "8) Quit");
	}
	
	/**
	 * This method shows kilometers
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/7/18
	 * @date_edited 11/7/18
	 * 
	 * @param meters
	 */
	
	public static void showKilometers(double meters) {
		// Doubles
		double kilometers;
		
		// Calculation
		kilometers = meters / 1000;																			// Convert kilometers
		
		// Output
		System.out.println(meters + " Meters = " + kilometers + " kilometers");								// Output kilometers
	}
	
	/**
	 * This method shows centimeters
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/7/18
	 * @date_edited 11/7/18
	 * 
	 * @param meters
	 */
	
	public static void showCentimeters(double meters) {
		// Doubles
		double centimeters;
		
		// Calculation
		centimeters = meters * 100;																			// Convert centimeters
		
		// Output
		System.out.println(meters + " Meters = " + centimeters + " centimeters");							// Output centimeters
	}
	
	/**
	 * This method shows inches
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/7/18
	 * @date_edited 11/7/18
	 * 
	 * @param meters
	 */
	
	public static void showInches(double meters) {
		// Doubles
		double inches;
		
		// Calculation
		inches = meters / 39.3701;																			// Convert inches
		
		// Output
		System.out.println(meters + " Meters = " + inches + " inches");										// Output inches
	}
	
	/**
	 * This method shows feet
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/7/18
	 * @date_edited 11/7/18
	 * 
	 * @param meters
	 */
	
	public static void showFeet(double meters) {
		// Doubles
		double feet;								
		
		// Calculation
		feet = meters / 3.28084;																			// Convert feet
		
		// Output
		System.out.println(meters + " Meters = " + feet + " feet");											// Output feet
	}
	
	/**
	 * This method shows milimeters
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/7/18
	 * @date_edited 11/7/18
	 * 
	 * @param meters
	 */
	
	public static void showMilimeters(double meters) {
		// Doubles
		double milimeters;								
		
		// Calculation
		milimeters = meters * 1000;																		// Convert milimeters
		
		// Output
		System.out.println(meters + " Meters = " + milimeters + " milimeters");							// Output milimeters
	}
	
	/**
	 * This method shows nanometer
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/7/18
	 * @date_edited 11/7/18
	 * 
	 * @param meters
	 */
	
	public static void showNanometers(double meters) {
		// Doubles
		double nanometer;								
		
		// Calculation
		nanometer = meters * 1000000000;																// Convert nanometer
		
		// Output
		System.out.println(meters + " Meters = " + nanometer + " nanometers");							// Output nanometer
	}
	
	/**
	 * This method shows miles
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/7/18
	 * @date_edited 11/7/18
	 * 
	 * @param meters
	 */
	
	public static void showMiles(double meters) {
		// Doubles
		double miles;								
		
		// Calculation
		miles = meters * 0.000621371;																	// Convert miles
		
		// Output
		System.out.println(meters + " Meters = " + miles + " miles");									// Output miles
	}

}
