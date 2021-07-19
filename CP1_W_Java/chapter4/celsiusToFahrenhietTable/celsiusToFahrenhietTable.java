/**
This converts temperature

@author JosephTelaak

10/17/18
 */


package celsiusToFahrenhietTable;

import javax.swing.JOptionPane;

public class celsiusToFahrenhietTable {

	public static void main(String[] args) {
		
		// Double and String
		double fahrenheit;
		
		String output = "";

		for (double C = 0; C <= 20; C++) {											// Runs 20 timea
			
			// Calculations
			fahrenheit = (9.0/5.0) * C + 32;										// C to F
			
			// Output additiom
			output += C + " Celsius, " + fahrenheit + " Fahrenheit \n";				// Output add
			
		}
		
		// Output
	    JOptionPane.showMessageDialog(null, output);
		
	}

}
