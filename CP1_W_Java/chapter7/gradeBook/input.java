package gradeBook;

import javax.swing.JOptionPane;

public class input {

	public static String userInput;
	
	public static String name() {
		userInput = JOptionPane.showInputDialog("Enter name");
		
		return userInput;
	}
	
	public static double grade(int i, String name) {
		double grade;
		i++;
		
		userInput = JOptionPane.showInputDialog("Enter grade " + i + " for " + name);
		grade = Double.parseDouble(userInput);
		
		return grade;
	}
	
}
