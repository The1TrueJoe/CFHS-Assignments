package daysInAMonth;

import javax.swing.JOptionPane;

public class runDays {

	public static void main(String[] args) {
		
		Days days = new Days();
		
		days.setMonth(input.month());
		days.setYear(input.year());
		
		JOptionPane.showMessageDialog(null, "There are " + days.getNumOfDays() + " days in " + 
									days.getMonth() + " of " + days.getYear() + ".\n" + days.getYear() 
									+ " " + days.getLeap() + " a leap year.");

	}

}
