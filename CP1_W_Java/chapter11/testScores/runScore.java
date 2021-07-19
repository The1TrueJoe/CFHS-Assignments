package testScores;

import javax.swing.JOptionPane;

public class runScore {

	public static void main(String[] args) {
		int[] array = new int[6];
		
		Score score = new Score(array);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = score.validInput(testInput.inputScore());
			
		}
		
		JOptionPane.showMessageDialog(null, "Average: " + score.average());
	}

}
