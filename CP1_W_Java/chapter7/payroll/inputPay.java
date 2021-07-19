package payroll;

import javax.swing.JOptionPane;

public class inputPay {

	public static String userInput;
	
	public static int ID(String preOut, String preOut2) {
		int ID;
		String out = "",
			   out2 = "";
		
		if (preOut != null) { out = preOut; }
		if (preOut != null) { out2 = preOut2; }
		
		userInput = JOptionPane.showInputDialog("Enter ID " + out2 + "\n" + out);
		ID = Integer.parseInt(userInput);
		
		return ID;
	}
	
	public static int hours(int ID) {
		int hours;
		
		do {
			userInput = JOptionPane.showInputDialog("Enter hours for " + ID);
			hours = Integer.parseInt(userInput);
			
			if (hours < 0) {
				JOptionPane.showMessageDialog(null, "Invalid, enter hours as a positive number");
				
			}
			
		} while (hours < 0);
		
		return hours;
	}
	
	public static double payRate(int ID) {
		double payRate;
		
		do {
			userInput = JOptionPane.showInputDialog("Enter Pay Rate for " + ID);
			payRate = Double.parseDouble(userInput);
			
			if (payRate < 6) {
				JOptionPane.showMessageDialog(null, "Invalid, enter pay rate above 6");
				
			}
			
		} while (payRate < 6);
		
		return payRate;
	}
	
}
