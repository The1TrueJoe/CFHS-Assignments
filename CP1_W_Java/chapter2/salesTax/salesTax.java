/*
This program calculates sales tax

Joseph Telaak

8/30/18
 */


package salesTax;

import java.util.Scanner;																// Imports Scanner

public class salesTax {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		
		// Sets doubles
		final double STATE_RATE  = 0.04,
				     COUNTY_RATE = 0.02;
		
		double purchaseAmount,
		       stateTax,
		       countyTax,
		       totalSalesTax,
		       totalCost,
		       totalTaxRate;
		
		keyboard = new Scanner(System.in);												// Prepares Scanner
		
		// Get purchase amount
		System.out.println("Enter purchase amount:");									// Asks for purchase amount
		purchaseAmount = keyboard.nextDouble();											// Asks for purchase amount
		
		// Calculations
		stateTax      = purchaseAmount * STATE_RATE;									// Calculates state tax
		countyTax     = purchaseAmount * COUNTY_RATE;									// Calculates county tax
		totalTaxRate  = STATE_RATE     + COUNTY_RATE;									// Calculates total tax rate
		totalSalesTax = stateTax       + countyTax;										// Calculates total sales tax
		
		totalCost 	  = (totalTaxRate * purchaseAmount) + purchaseAmount;				// Calculates total cost
		
		// Output
		System.out.println("Your Purchase Price is $" + purchaseAmount + "\n");			// Prints purchase price
		System.out.println("\t State Tax $" + stateTax);								// Prints state tax
		System.out.println("\t County Tax $" + countyTax);								// Prints county tax
		System.out.println("\t Total Tax $" + totalSalesTax + "\n");					// Prints total sales tax
		System.out.println("Your Total Cost is $" + totalCost);							// Prints total cost

	}

}
