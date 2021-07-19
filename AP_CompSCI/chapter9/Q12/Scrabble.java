package Q12;

import java.util.Scanner;

public class Scrabble {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter word");
		String word = keyboard.nextLine();
		keyboard.close();
		
		System.out.println("Score: " + computeScore(word));
		
	}

	public static int computeScore(String word) {
		int total = 0;
		
		int[] values = { 
				1, 3, 4, 2, 1, 4, 
				2, 4, 1, 8, 5, 1, 
				3, 1, 1, 3, 10, 1, 
				1, 1, 1, 4, 4, 8, 4, 
				10
		};
		
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int i = 0; i < word.length(); i++) {
			for (int x = 0; x < letters.length(); x++) {
				while ((letters.charAt(x) + "").equalsIgnoreCase(word.charAt(i) + "")) {
					total += values[x];
					break;
				}
			}
		}
		
		return total;
	}
}