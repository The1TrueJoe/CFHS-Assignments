/*
This program will convert square feet into acres

Joseph Telaak

8/30/18
 */


package landCalc;

import javax.swing.JOptionPane;																								// Imports JOptionsPane

public class landCalc {

	public static void main(String[] args) {
		
		// Sets doubles and strings
		final double ACRE = 43560;
		
		double toCalculate, 
		       calculatedAcres;
		
		String userInput;
		
		// Get the amount of square feet to convert
		userInput = JOptionPane.showInputDialog("Enter the amount of square feet to convert");								// Asks for conversion amount
		toCalculate = (Double.parseDouble(userInput));																		// Asks for conversion amount
		
		// Calculations
		calculatedAcres = toCalculate / ACRE;																				// Calculates acres
		
		// Output
		JOptionPane.showMessageDialog(null, toCalculate + " square feet converts to: " + calculatedAcres + " acres.");      // Outputs converted number
		
	}

}
