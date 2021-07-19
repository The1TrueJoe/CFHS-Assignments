package chargeAccountModification;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class runValid {
	
	public static String fileName = "H:\\Eclipse Workspace\\ProgrammingChallenges\\chapter7\\chargeAccountModification\\Accounts";

	public static void main(String[] args) throws FileNotFoundException {
		int number;
		
		Scanner keyboard = new Scanner(System.in);
		AccountValid account = new AccountValid(fileName);
		
		account.readData();
		
		System.out.println("Enter account number to validate");
		number = keyboard.nextInt();
		
		System.out.println("Account " + account.valid(account.isValid(number)));

		keyboard.close();
	}

}
