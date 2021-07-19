package personalInformation;

import javax.swing.JOptionPane;

public class input {

	/**
	 * Name
	 * 
	 * @return
	 */
	
	public static String name() {
		// String
		String name;
		
		// Input
		name = JOptionPane.showInputDialog("Enter name");
		
		// Return
		return name;
	}
	
	/**
	 * Address
	 * 
	 * @return
	 */
	
	public static String address() {
		// String
		String address;
		
		// Input
		address = JOptionPane.showInputDialog("Enter address");
		
		// Return
		return address;
	}
	
	/**
	 * Age
	 * 
	 * @return
	 */
	
	public static int age() {
		// Ints and Strings
		int age;
		String userInput;
		
		// Input
		userInput = JOptionPane.showInputDialog("Enter age");
		age = Integer.parseInt(userInput);
		
		// Return
		return age;
		
	}
	
	/**
	 * Phone number
	 * 
	 * @return
	 */
	
	public static String phoneNumber() {
		// String
		String phoneNumber;
		
		// Input
		phoneNumber = JOptionPane.showInputDialog("Enter phone number");
		
		// Return
		return phoneNumber;
	}
	
}
