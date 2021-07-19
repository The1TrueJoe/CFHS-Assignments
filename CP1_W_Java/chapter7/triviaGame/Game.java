package triviaGame;

import java.io.FileNotFoundException;

public class Game {

	public Question[] question;
	public inputQA input;
	
	public int qCount;
	
	public Game(int count) throws FileNotFoundException {
		input = new inputQA();
		
		qCount = count;
		
		question = new Question[qCount];
	}
	
	public void addData() {
		for (int i = 0; i < qCount; i++) {
			Question QuestionX = new Question(input.getQuestion(),
											  input.getAnswer(1), input.getAnswer(2),
											  input.getAnswer(3), input.getAnswer(4),
											  input.getCorrect());
			
			question[i] = QuestionX;
			
			input.addData();
		}
	}
}
