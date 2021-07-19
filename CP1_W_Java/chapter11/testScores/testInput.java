package testScores;

import javax.swing.JOptionPane;

public class testInput {

	public static String userInput;
	
	public static int inputScore() {
		int score;
		
		userInput = JOptionPane.showInputDialog("Enter test score");
		score = Integer.parseInt(userInput);
		
		return score;
	}
	
}
