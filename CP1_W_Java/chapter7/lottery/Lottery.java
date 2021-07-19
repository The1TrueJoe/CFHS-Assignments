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

import java.util.Random;

public class Lottery {
	// Feilds
	public final int NUM = 5;
	public int matching;
	
	// Arrays
	public int[] lotteryNumbers = new int[NUM];
	public int[] userNumbers = new int[NUM];
	
	// Adds number
	public void addNum(int num, int inst) { userNumbers[inst] = num; }
	
	// Generates
	public void generateNumbers() {
		// Object
		Random rand = new Random();
		
		// Generates random
		for (int i = 0; i < lotteryNumbers.length; i++) {
			lotteryNumbers[i] = rand.nextInt(9);
		}
	}
	
	// Detects matching
	public void matching() {
		for (int i = 0; i < lotteryNumbers.length; i++) {
			for (int a = 0; a < lotteryNumbers.length; a++) {
				if (lotteryNumbers[i] == userNumbers[a]) {
					matching++;
				}
			}
		}
	}
	
	// Decides if winner
	public String winner() {
		// String
		String string;
		
		// Converts
		if (matching == 5) {
			string = "Grand Prize Winner";
		} else if (matching == 0) {
			string = "Loser";
		} else {
			string = "Winner";
		}
		
		// Adds string
		string += ", You are matching: " + matching;
		
		// Returns
		return string;
	}
	
	// Ouputs array
	public String outputArray() {
		// String
		String output = "Correct Numbers\n";
		
		// Outputs numbers
		for (int i = 0; i < lotteryNumbers.length; i++) {
			output += lotteryNumbers[i] + " ";
		}
		
		// User nums
		output += "\nUser Numbers\n";
		
		// Ouputs numbers
		for (int i = 0; i < userNumbers.length; i++) {
			output += userNumbers[i] + " ";
		}
		
		// Return
		return output;
	}
	
}
