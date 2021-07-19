package chargeAccountModification;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountValid {

	public final int ACCOUNTS = 18;
	public int number;
	public int[] account = new int [ACCOUNTS];
	
	public String fileName;
	
	public AccountValid(String name) {
		fileName = name;
	}
	
	public void readData() throws FileNotFoundException {
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		
		int count = 0;
		
		while (inputFile.hasNextInt()) {
			account[count] = inputFile.nextInt();
			
			count++;
		}
		
		inputFile.close();
	}
	
	public int getAccountNumber() { return number; }
	
	public boolean isValid(int accountNumber) {
		for (int i = 0; i < ACCOUNTS; i++) {
			if (account[i] == accountNumber) {
				number = account[i];
				return true;
			}
		}
		number = 0;
		return false;
	}
	
	public String valid(boolean valid) {
		if (valid == true) {
			return "is valid";
		} else {
			return "is not valid";
		}
	}
}
