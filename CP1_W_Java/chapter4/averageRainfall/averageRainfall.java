/**
This program stores rainfall data

@author  JosephTelaak

10/17/18
 */


package averageRainfall;

import javax.swing.JOptionPane;

public class averageRainfall {

	public static void main(String[] args) {
		
		// Ints, Doubles. and Strings
		int i = 1;
		
		double years,
		       totalMonths,
		       rainfall,
		       totalRain = 0,
		       averageRain;
		
		String userInput,
		       output = "",
		       output2 = "";
		
		// Years
		do {
			userInput = JOptionPane.showInputDialog("Enter Years");													// Get years
			years = (Double.parseDouble(userInput));																// Get years
			
			// Input Validation
			if (years < 1) {																						// INVALID
				JOptionPane.showMessageDialog(null, "INVALID");														// INVALID
				
			}
			
		} while (years <= 1 );																						// Check if valid
		
		// First calculation
		totalMonths = 12 * years;																					// totalMonths
		
		// Add to output
		output+= (String.format("%,.0f", totalMonths) + " Month(s) used \n" +										// Output additon
                  String.format("%,.0f", years)       + "   Year(s) used \n\n" 
                                                      + " Month   Year     Rainfall \n" 
                                                      + " ----------------------------------- \n"
                                                      );
        
		do {
			for (int a = 1; a <= 12; a++) {																			// Runs 12 times
				do {
					// Input
					userInput = JOptionPane.showInputDialog("Enter rainfall for Month " + (a) + " of Year " + i);	// Get rainfall
					rainfall = (Double.parseDouble(userInput));														// Get rainfall
					
					// Input validation
					if (rainfall <= 0) {																			// INVALID
						JOptionPane.showMessageDialog(null , "INVALID");											// INVALID
						
					}
					
				} while (rainfall <= 0);																			// Check if valid
				
				// Add to output
				output += (" " + (a) + "              " + years + "         " + rainfall + "\n");					// Output additon
				
				// Calculation
				totalRain += rainfall;																				// Get total rainf
			}
			
			// Counter
			i++;																									// Counter
			
		} while (i<=years);																							// Runs for years
		
		// Calculation
		averageRain = totalRain / (years * 12);																		// Calculates average
		
		// Add to beginning of output
		output2 +=  ( "Total Rain: "   + String.format("%,.0f", totalRain)   + "\n" 								// Create first output
				    + "Average Rain: " + String.format("%,.2f", averageRain) + "\n"
				    );
		
		// Output
		JOptionPane.showMessageDialog(null, output2 + "\n" + output);												// Final output

		
	}

}

