package freezeAndBoil;

import javax.swing.JOptionPane;

public class input {
	
	public static String userInput;

	public static double temp() {
		double temp;
		
		userInput = JOptionPane.showInputDialog("Enter Temp");
		
		temp = Double.parseDouble(userInput);
		
		return temp;
	}
	
}
