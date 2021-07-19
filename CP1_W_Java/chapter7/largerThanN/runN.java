/**
 * This program checks stored data to see if the number is larger
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/8/18
 * @date_edited 12/11/18
 * 
 * @version 2
 */

package largerThanN;

import java.util.Scanner;

public class runN {

	public static void main(String[] args) {
		// Objects
		Scanner keyboard = new Scanner(System.in);
		Larger large = new Larger();
		
		// Integers
		int num;
		int n;
		
		// Input
		do {
			// Input
			System.out.println("Enter a number (Exit with -99)");
			num = keyboard.nextInt();
			
			// Add valid number
			if (num != -99) {
				// Add number
				large.addNum(num);
				
			}
			
			// Check for exit value
		} while (num != -99);
		
		// Input
		System.out.println("Enter a number to find all larger numbers");
		n = keyboard.nextInt();
		
		// Output
		System.out.println(large.getLargest());
		System.out.println(large.getAllLarger(n));
		
		// Close keyboard
		keyboard.close();
	}
	
	

	
}
