
package evenOddCounter;

import java.util.Random;

import javax.swing.JOptionPane;

public class evenOddCounter {

	public static void main(String[] args) {
		
		// Doubles
		double even = 0,
		       odd = 0;
		
		int number;
		
		Random rand = new Random();
		
		// Add to numbers
		for (int i = 1; i <= 100; i++) {
			
			number = rand.nextInt();									// Get random number
			
			if (isEven(number) == true) {								// Even
				even++;													// Add to even
			} else if (isEven(number) == false) {						// Odd
				odd++;													// Add to odd
			}
		}
		
		// Output
		JOptionPane.showMessageDialog(null, String.format("Even: %,.0f \nOdd: %,.0f", even, odd));

	}
	
	/**
	 * This method detects if a number is even or odd
	 * 
	 * @author JosephTelaak
     * 
     * @date_created 10/30/18 
     * @date_edited 10/31/18
	 * 
	 * @param number
	 * @return
	 */
	
	public static boolean isEven(int number) {
		// Even or odd
		if ((number % 2) == 0) {										// Even
			return true;												// Return
		} else {														// Odd
			return false;												// Return
		}
	}
}
