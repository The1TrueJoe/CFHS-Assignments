package customTestScore;

@SuppressWarnings("serial")
public class InvalidTestScoreException extends Exception{
	public InvalidTestScoreException() {
		super("Must be less the %100 or positive");
	}
	
	public InvalidTestScoreException(int score) {
		super(score + " must be less the %100 or positive");
	}
	
	public InvalidTestScoreException(String str) {
		super(str);
	}
}
