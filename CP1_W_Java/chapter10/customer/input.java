package customer;

import javax.swing.JOptionPane;

public class input {

	private String userInput;
	
	public String name() {
		userInput = JOptionPane.showInputDialog("Enter name");
		
		return userInput;
	}
	
	public String address() {
		userInput = JOptionPane.showInputDialog("Enter address");
		
		return userInput;
	}
	
	public String phoneNumber() {
		userInput = JOptionPane.showInputDialog("Enter phone number");
		
		return userInput;
	}
	
	public String customerNumber() {
		userInput = JOptionPane.showInputDialog("Enter Customer Number");
		
		return userInput;
	}
	
	public boolean mailingList() {
		int num;
		
		num = JOptionPane.showConfirmDialog(null, "Do you want to be on the mailing list?");
		
		if (num == 2) {
			return true;
		} else { 
			return false;
		}
		
	}
	
}
