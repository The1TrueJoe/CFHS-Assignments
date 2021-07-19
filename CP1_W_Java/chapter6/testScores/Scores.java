package testScores;

public class Scores {

	// Fields
	private double score1;
	private double score2;
	private double score3;
	
	private double avgScore;
	
	/**
	 * Constructor
	 * 
	 * @param sc1
	 * @param sc2
	 * @param sc3
	 */
	
	public Scores(double sc1, double sc2, double sc3) {
		score1 = sc1;
		score2 = sc2;
		score3 = sc3;
		
		avgScore = 0;
	}
	
	/**
	 * Constructor
	 */
	
	public Scores() {
		score1 = 0;
		score2 = 0;
		score3 = 0;
		
		avgScore  = 0;
	}
	
	/**
	 * Sets score
	 * 
	 * @param sc1
	 */
	
	public void setScore1(double sc1) { 
		score1 = sc1;
	}
	
	/**
	 * Sets score
	 * 
	 * @param sc2
	 */
	
	public void setScore2(double sc2) { 
		score2 = sc2; 
	}
	
	/**
	 * Sets score
	 * 
	 * @param sc3
	 */
	
	public void setScore3(double sc3) { 
		score3 = sc3; 
	}
	
	/**
	 * Gets score
	 * 
	 * @return
	 */
	
	public double getScore1() {
		return score1;
	}
	
	/**
	 * Gets score
	 * 
	 * @return
	 */
	
	public double getScore2() {
		return score2;
	}
	
	/**
	 * Gets score
	 * 
	 * @return
	 */
	
	public double getScore3() {
		return score3;
	}
	
	/**
	 * Gets average
	 * 
	 * @return
	 */
	
	public double getAvg() {
		avgScore = (score1 + score2 + score3) / 3;
		
		return avgScore;
	}
	
}
