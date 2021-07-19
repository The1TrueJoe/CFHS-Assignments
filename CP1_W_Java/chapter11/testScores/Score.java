package testScores;

public class Score {

	public int[] testScores;
	
	public Score(int[] test) {
		testScores = test;
	}
	
	public int validInput(int in) {
		if (in > 100 || in < 0) {
			throw new IllegalArgumentException ("Must be less the %100 or positive");
		} else{
			return in;
		}
	}
	
	public double average() {
		int count = 0, total = 0;
		double average;
		
		for (int i = 0; i < testScores.length; i++) {
			total += testScores[i];
			count++;
		}
		
		average = total/count;
		
		return average;
	}
	
}
