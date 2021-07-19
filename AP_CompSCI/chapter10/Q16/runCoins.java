package Q16;

import java.util.Scanner;

public class runCoins {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter change: ");
		int change = keyboard.nextInt();
		keyboard.close();
		
		Coins coins = new Coins(change);
		
		System.out.println(
				"Quarters: " + coins.getQuarters() + " \n" +
				"Nickels: " + coins.getNickels() + " \n" +
				"Dimes: " + coins.getDimes() + "\n" +
				"Pennies: " + coins.getPennies()
				);

	}

}
