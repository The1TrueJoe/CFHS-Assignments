package circle;

import javax.swing.JOptionPane;

public class input {

	public static double radius() {
		double radius;
		String userInput;
		
		userInput = JOptionPane.showInputDialog("Enter Radius");
		radius = Double.parseDouble(userInput);
		
		return radius;
	}
	
}
