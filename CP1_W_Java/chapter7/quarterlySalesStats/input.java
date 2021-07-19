package quarterlySalesStats;

import javax.swing.JOptionPane;

public class input {

	public static String userInput;
	
	public static int number(int div, int q) {
		int number;
		
		div++;
		q++;
		
		userInput = JOptionPane.showInputDialog("Enter number for division " + div + " Q" + q);
		number = Integer.parseInt(userInput);
		
		return number;
	}
	
	public static int count = 0;
	
	public static int testIn() {
		count++;
		return count;
	}
	
}
