/**
 * This program compares lottery numbers
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/11/18
 * @date_edited 12/12/18
 * 
 * @version 1
 */

package lottery;

import java.util.Scanner;

public class runLottery {

	public static void main(String[] args) {
		// Objects
		Lottery lotto = new Lottery();
		Scanner keyboard = new Scanner(System.in);
		
		// Generate numbers
		lotto.generateNumbers();
		
		// Integer
		int number;
		
		// Input
		for (int i = 0; i < 5; i++) {
			// Input
			System.out.println("Enter number");
			number = keyboard.nextInt();
			
			// Adds number
			lotto.addNum(number, i);
		}
		
		// Scans for matching
		lotto.matching();
		
		// Output
		System.out.println(lotto.winner() + "\n" + lotto.outputArray());

		// Close
		keyboard.close();
	}

}
