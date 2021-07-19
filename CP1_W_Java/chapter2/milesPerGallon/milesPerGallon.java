/*
This program calculates miles-per-gallon (MPG)

Joseph Telaak

8/30/18
 */


package milesPerGallon;

import javax.swing.JOptionPane;																// Imports JOptionPane

public class milesPerGallon {

	public static void main(String[] args) {
		
		// Sets doubles and string
		double MPG,
		       milesDriven,
		       gallonsUsed;
		
		String userInput;
		
		// Gets miles driven
		userInput = JOptionPane.showInputDialog("How many miles have you driven?");			// Asks for miles driven
		milesDriven = Double.parseDouble(userInput);										// Asks for miles driven
		
		// Gets gallons used
		userInput = JOptionPane.showInputDialog("How many gallons have you used?");			// Asks for gallons used
		gallonsUsed = Double.parseDouble(userInput);										// Asks for gallons used
		
		// Calculations
		MPG = milesDriven / gallonsUsed;													// Calculates MPG
		
		// Output
		JOptionPane.showMessageDialog(null, MPG + " miles-per-gallon (MPG)");				// Outputs MPG

	}

}
