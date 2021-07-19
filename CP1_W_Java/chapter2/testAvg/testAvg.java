/**
This program will average the score of three equally weighted tests

@author JosephTelaak

8/31/18
 */


package testAvg;

import javax.swing.JOptionPane;																	// Imports JOptionsPane

class testAvg {

	public static void main(String[] args) {
		
		// Doubles and string
		double scoreOne,
		       scoreTwo,
		       scoreThree,
		       averageScore;
		
		String userInput;
		
		// Gets the first score
		userInput = JOptionPane.showInputDialog("Score 1");										// Asks for score 1
		scoreOne = Double.parseDouble(userInput);												// Asks for score 1
		
		// Gets the second score
		userInput = JOptionPane.showInputDialog("Score 2");										// Asks for score 2
		scoreTwo = Double.parseDouble(userInput);												// Asks for score 2
		
		// Gets the third score
		userInput = JOptionPane.showInputDialog("Score 3");										// Asks for score 3
		scoreThree = Double.parseDouble(userInput);												// Asks for score 3
		
		// Calculations
		averageScore =(scoreOne + scoreTwo + scoreThree) / 3;									// Calculates average score
		
		// Output
		JOptionPane.showMessageDialog(null, "Your average score is " + averageScore + "%");		// Outputs average score

	}

}
