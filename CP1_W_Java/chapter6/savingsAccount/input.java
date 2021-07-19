package savingsAccount;

import javax.swing.JOptionPane;

public class input {

	public static String userInput;
	
	public static double withdrawn(int i) {
		double withdrawn;
		
		userInput = JOptionPane.showInputDialog("Enter money withdrawn for month: " + i);
		withdrawn = Double.parseDouble(userInput);
		
		return withdrawn;
	}
	
	public static double deposit(int i) {
		double deposit;
		
		userInput = JOptionPane.showInputDialog("Enter money deposited for month: " + i);
		deposit = Double.parseDouble(userInput);
		
		return deposit;
	}
	
	public static int months() {
		int months;
		
		userInput = JOptionPane.showInputDialog("Enter Months");
		months = Integer.parseInt(userInput);
		
		return months;
	}
	
	public static double interest() {
		double interest;
		
		userInput = JOptionPane.showInputDialog("Enter interest rate");
		interest = Double.parseDouble(userInput);
		
		return interest;
	}
	
}
