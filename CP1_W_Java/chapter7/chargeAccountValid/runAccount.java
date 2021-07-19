/**
 * This program acceses stored vaid charge accounts
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/5/18
 * @date_edited 12/8/18
 * 
 * @ver 2
 */

package chargeAccountValid;

import java.util.Scanner;

public class runAccount {

	public static void main(String[] args) {
		// Ints
		int number;
		
		// Objects
		Scanner keyboard = new Scanner(System.in);
		ValidAccount account = new ValidAccount();
		
		// Input
		System.out.println("Enter account number to validate");
		number = keyboard.nextInt();
		
		// Output
		System.out.println("Account " + account.valid(account.isValid(number)));

		// Close
		keyboard.close();
	}

}
