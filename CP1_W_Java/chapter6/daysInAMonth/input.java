package daysInAMonth;

import javax.swing.JOptionPane;

public class input {

	public static int month() {
		int month;
		String userInput;
		
		userInput = JOptionPane.showInputDialog("Enter month (1-12)");
		month = Integer.parseInt(userInput);
		
		return month;
	}
	
	public static int year() {
		int year;
		String userInput;
		
		userInput = JOptionPane.showInputDialog("Enter year");
		year = Integer.parseInt(userInput);
		
		return year;
	}
	
}
