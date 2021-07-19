package temperature;

import javax.swing.JOptionPane;

public class input {

	public static double fahrenheit() {
		double fahrenheit;
		String userInput;
		
		userInput = JOptionPane.showInputDialog("Enter temp");
		fahrenheit = Double.parseDouble(userInput);
		
		return fahrenheit;
		
	}
	
}
