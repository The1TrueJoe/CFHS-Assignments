package depositAndWithdrawlFiles;

import javax.swing.JOptionPane;

public class input {

	public static String userInput;
	
	public static double interest() {
		double interest;
		
		userInput = JOptionPane.showInputDialog("Enter Interest Rate");
		interest = Double.parseDouble(userInput);
		
		return interest;
	}
	
}
