package customTestScore;

import testScores.Score;

public class CustScore extends Score {

	public CustScore(int[] test) {
		super(test);
	}
	
	public int validInput(int in) {
		if (in > 100 || in < 0) {
			throw new IllegalArgumentException ("Must be less the %100 or positive");
		} else{
			return in;
		}
	}
		
}

