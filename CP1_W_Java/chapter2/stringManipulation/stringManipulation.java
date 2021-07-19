/**
This program manipulates a string and gives the character count, the first character, it put in all caps, and put in all lower case.

@author JosephTelaak

9/4/18
 */


package stringManipulation;

import javax.swing.JOptionPane;

public class stringManipulation {

	public static void main(String[] args) {
		
		// Strings, Chars, and Integers
		String userInput,
			   allUp,
		       allLow;
		
		char   firstChar; 
		
		int    charCount;
		
		// Input
		userInput = JOptionPane.showInputDialog("What is your favorite city?");										// Asks for your favorite city
		
		// Calculations
		charCount = userInput.length();																				// Gets character count
		allUp     = userInput.toUpperCase();																		// Puts it into upper case
		allLow    = userInput.toLowerCase();																		// Puts it into lower case
		firstChar = userInput.charAt(0);																			// Gets first character
		
		// Output
		JOptionPane.showMessageDialog(null, "Your favorite city is " + userInput + "\n" + 
		                                    "\n" +
											userInput + " contains " + charCount + " characters" + "\n" +
											userInput + " in all caps is " + allUp + "\n" +
											userInput + " in all lowercase is " + allLow + "\n" +
											userInput + "'s first character is " + firstChar
											);
		
	}

}
