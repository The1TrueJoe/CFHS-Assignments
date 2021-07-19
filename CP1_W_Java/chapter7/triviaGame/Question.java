package triviaGame;

public class Question {

	public String question;
	
	public String answer1;
	public String answer2;
	public String answer3;
	public String answer4;
	
	public int correctAnswer;
	
	public Question(String q, String a1, String a2, String a3, String a4, int correct) {
		question = q;
		
		answer1 = a1;
		answer1 = a2;
		answer1 = a3;
		answer1 = a4; 
		
		correctAnswer = correct;
	}
	
}
