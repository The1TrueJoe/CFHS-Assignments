/**
This program calculates weight from mass

@author JosephTelaak

10/2/18
 */

package massAndWeight;

import javax.swing.JOptionPane;

public class massAndWeight {

	public static void main(String[] args) {
		
		// Doubles and strings
		final double NUM = 9.8;
		
		double Weight,
		       Mass;
		
		String UserInput,
		       ObjDesc;
		
		// Input
		UserInput = JOptionPane.showInputDialog("What is the object's mass");
		Mass = (Double.parseDouble(UserInput));
		
		// Calculations
		Weight = Mass * NUM;										// Weight from mass
		
		// Picking output description
		if (Weight > 1000) {										// Heavy
			ObjDesc = "Heavy";										// Heavy
			
		} else if (Weight < 10) {									// Light
			ObjDesc = "Light";										// Light
			
		} else {													// Other
			ObjDesc = " " + Weight;									// Other
			
		}
		
		// Output
		JOptionPane.showMessageDialog(null, "The object's weight is " + Weight + " Newtons" + "\n" +
		                                    "              This object is " + ObjDesc
		                                    );
	}
}
