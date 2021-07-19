/**
This program detects if a date is magic

@author JosephTelaak

9/7/18
 */


package magicDates;

import javax.swing.JOptionPane;

public class magicDates {

	public static void main(String[] args) {

		// Ints and Strings
		int    month,
		       day,
		       year;
		
		String userInput,
		       date;
		
		// Month
		userInput = JOptionPane.showInputDialog("Enter Month");							// Asks for month
		month = (Integer.parseInt(userInput));											// Scans for month
		
		// Day
		userInput = JOptionPane.showInputDialog("Enter Day");							// Asks for day
		day = (Integer.parseInt(userInput));											// Scans for day
		
		// Year
		userInput = JOptionPane.showInputDialog("Enter Year");							// Asks for year
		year = (Integer.parseInt(userInput));											// Scans for year
		
		date = month + "/" + day + "/" + year;											// Creates "date" string
		
		if (month * day == year) {
			
			JOptionPane.showMessageDialog(null, date + " is magic!!");					// Is magic
			
		} else if (month * day != year){
			
			JOptionPane.showMessageDialog(null, date + " is not magic.");				// Is not magic
			
		} else {
			
			JOptionPane.showMessageDialog(null, "INVALID");								// Invalid
			
		}
			
	}

}
