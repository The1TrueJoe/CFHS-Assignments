package Q05;

import java.util.Scanner;

public class CreditCardFormat {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Credit Card Number");
		String ccNumber = keyboard.nextLine();
		keyboard.close();
		
		String last4 = ccNumber.substring(ccNumber.length() - 4, ccNumber.length());
		String last5 = ccNumber.substring(ccNumber.length() - 6, ccNumber.length() - 5) + last4;

		System.out.println(last4 + " " + last5);
	}

}
