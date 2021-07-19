/**
This program applies a discount to the price of a software based on a chart. 

@author JosephTelaak

10/4/18

******** Example Input ********

---- Input ----

Input software QTY
"45"

---- Expected Output ----

Your total cost after discount is $3118.5

Discount is 30.0%
Raw Price is $4455.0

 */



package softwareSales;

import javax.swing.JOptionPane;

public class softwareSales {

	public static void main(String[] args) {
		
		// Integers, Doubles, and Strings
		final int PURCHASEPRICE = 99;
		
		Double QTY,
			   discount,
			   cost,
			   rawPrice;
		
		String userInput;
		
		// Input
		userInput = JOptionPane.showInputDialog("Input software QTY");		// Get software QTY
		QTY = Double.parseDouble(userInput);								// Get software QTY
		
		// Initial Calculations
		rawPrice = QTY * PURCHASEPRICE;
		
		// Decision Structures
		if (QTY >= 10 && QTY <= 19) {							// Between 10 and 19
			discount = .2;										// Discount 20%
			cost = rawPrice - (rawPrice * discount);			// Cost Calculation
			
		} else if (QTY >= 20 && QTY <= 49) {					// Between 20 and 49
			discount = .3;										// Discount 30%
			cost = rawPrice - (rawPrice * discount);			// Cost Calculation
			
		} else if (QTY >= 50 && QTY <= 99) {					// Between 50 and 99
			discount = .4;										// Discount 40%
			cost = rawPrice - (rawPrice * discount);			// Cost Calculation
			
		} else if (QTY >= 100) {								// Over 100
			discount = .5;										// Discount 50%
			cost = rawPrice - (rawPrice * discount);			// Cost calculation
			
		} else if (QTY <= 9 && QTY >= 0) {						// Under 10
			cost = rawPrice;									// Cost Calculation
			discount = 0.0;										// No Discount
			
		} else {												// Error
			discount = 0.0;										// No Discount
			cost = 0.0;
			
			JOptionPane.showMessageDialog(null, "ERROR");		// Error 
			System.exit(0);										// End Program before final output
		}
		
		// Final Output
		JOptionPane.showMessageDialog(null, "Your total cost after discount is $" + cost + "\n\n" +
									  "Discount is " + discount * 100 + "%" + "\n" +
									  "Raw Price is $" + rawPrice);
		
	}	// End main
} 		// End class