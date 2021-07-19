package customTestScore;

import javax.swing.JOptionPane;

import testScores.testInput;

public class runCustScore {

	public static void main(String[] args) {
		
int[] array = new int[6];
		
		CustScore score = new CustScore(array);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = score.validInput(testInput.inputScore());
			
		}
		
		JOptionPane.showMessageDialog(null, "Average: " + score.average());

	}

}
