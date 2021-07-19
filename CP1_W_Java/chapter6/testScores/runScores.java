/**
 * This program averages three scores
 * 
 * @author JosephTelaak
 * 
 * @date_edited 11/27/18
 */

package testScores;

public class runScores {

	public static void main(String[] args) {
		// Object
		Scores score = new Scores();									// Creates score object
		
		// Scores
		score.setScore1(input.getScores());								// Sets score
		score.setScore2(input.getScores());								// Sets score
		score.setScore3(input.getScores());								// Sets score
		
		// Output
		System.out.println("Scores: \n" +
						   "Score 1: " + score.getScore1() + "\n" +
						   "Score 2: " + score.getScore2() + "\n" +
						   "Score 3: " + score.getScore3() + "\n" +
						   "Average Score: " + score.getAvg());

	}

}
