/**
This program will average the score of three equally weighted tests

@author JosephTelaak

9/10/18
 */


package testScoresAndGrades;

import javax.swing.JOptionPane;																	// Imports JOptionsPane

class testScoresAndGrades {

	public static void main(String[] args) {
		
		// Doubles and string
		double scoreOne,
		       scoreTwo,
		       scoreThree,
		       averageScore;
		
		String userInput,
		       grade;
		
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
		
		if (averageScore <= 59) {																// Below 59
			grade = "F";																		// F
			
		} else if (averageScore >= 60 && averageScore <= 69) {									// Between 60 and 69
			grade = "D";																		// D
			
		} else if (averageScore >= 70 && averageScore <= 79) {									// Between 70 and 79
			grade = "C";																		// C
			
		} else if (averageScore >= 80 && averageScore <= 89) {									// Between 80 and 89
			grade = "B";																		// B
			
		} else if (averageScore >= 90 && averageScore <= 100) {									// Between 90 and 100
			grade = "A";																		// A
			
		} else {
			grade = "NOT VALID";																// ERR
		}
		
		// Output
		JOptionPane.showMessageDialog(null, "Your average score is " + averageScore + "%"		// Outputs average score
									 + ", and that is a(n) " + "'" + grade + "'");				// Outputs grade letter

	}

}
