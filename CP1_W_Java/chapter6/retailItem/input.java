package retailItem;

import javax.swing.JOptionPane;

public class input {
	
	private static String userInput;

	public static String description() {
		String description;
		
		description = JOptionPane.showInputDialog("Enter Description");
		
		return description;
	}
	
	public static int unitsOnHand() {
		int units;
		
		userInput = JOptionPane.showInputDialog("Enter qty");
		units = Integer.parseInt(userInput);
		
		return units;
	}
	
	public static double price() {
		double price;
		
		userInput = JOptionPane.showInputDialog("Enter price");
		price = Double.parseDouble(userInput);
		
		return price;
	}
}
