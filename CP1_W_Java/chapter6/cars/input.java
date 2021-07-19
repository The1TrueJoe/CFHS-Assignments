package cars;

import javax.swing.JOptionPane;

public class input {

	/**
	 * Input year
	 * 
	 * @return
	 */
	
	public static int year() {
		// Ints and Strings
		int year;
		String userInput;
		
		// Input
		userInput = JOptionPane.showInputDialog("Enter Year");
		year = Integer.parseInt(userInput);
		
		// Return
		return year;
	}
	
	/**
	 * Input make
	 * 
	 * @return
	 */
	
	public static String make() {
		// String 
		String make;
		
		// Input
		make = JOptionPane.showInputDialog("Enter Make");
		
		// Return
		return make;
	}
	
	/**
	 * Input speed
	 * 
	 * @return
	 */
	
	public static int speed() {
		// Ints and Strings
		int speed;
		String userInput;
		
		// Int
		userInput = JOptionPane.showInputDialog("Enter Initial speed");
		speed = Integer.parseInt(userInput);
		
		// Return
		return speed;
	}
	
}
