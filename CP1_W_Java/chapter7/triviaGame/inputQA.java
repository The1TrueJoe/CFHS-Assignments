package triviaGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class inputQA {
	
	public String question;
	
	public String answer1;
	public String answer2;
	public String answer3;
	public String answer4;
	
	public int correctAnswer;
	
	public String path;
	
	public String questionFile;
	public String answerFile;
	public String correctFile;
	
	File qFile;
	File aFile;
	File cFile;
	
	Scanner qInputFile;
	Scanner aInputFile;
	Scanner cInputFile;
	
	public inputQA() throws FileNotFoundException {	
		path = ("");
		
		questionFile = ("Questions");
		answerFile = ("Answers");
		
		qFile = new File(questionFile);
		aFile = new File(answerFile);
		cFile = new File(correctFile);
		
		qInputFile = new Scanner(qFile);
		aInputFile = new Scanner(aFile);
		cInputFile = new Scanner(cFile);
		
		addData();
	}
	
	public void addData() {
		question = qInputFile.nextLine();
		
		answer1 = aInputFile.nextLine();
		answer2 = aInputFile.nextLine();
		answer3 = aInputFile.nextLine();
		answer4 = aInputFile.nextLine();
		
		correctAnswer = cInputFile.nextInt();
	}
	
	public int getCorrect() {
		return correctAnswer;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getAnswer(int num) {
		if (num == 1) {
			return answer1;
		} else if (num == 2) {
			return answer2;
		} else if (num == 3) {
			return answer3;
		} else if (num == 4) {
			return answer4;
		} else {
			return null;
		}
	}
	
	
}
