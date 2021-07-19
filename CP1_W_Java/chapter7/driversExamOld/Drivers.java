package driversExamOld;

import javax.swing.JOptionPane;

public class Drivers {

	public int questionsCorrect;
	public int questionsIncorrect;
	public double percentage;
	public final int TOTAL = 20;
	
	public int[] incorrectAnswers;
	public String[] studentAnswer = new String[TOTAL];
	public String[] correct = {
			"B", "D", "A", "A", "C",
			"A", "B", "A", "C", "D",
			"B", "C", "D", "A", "D",
			"C", "C", "B", "D", "A"
	};
	
	public double getPercentage() { percentage = (questionsCorrect) / 20; return percentage; }
	public int getTotalCorrect() { return questionsCorrect; }
	public int getTotalIncorrect() { return questionsIncorrect; }
	
	public boolean isPassed() {
		if (questionsCorrect >= 15) {
			return true;
			
		} else {
			return false;
			
		}
	}
	
	public void scanForIncorrect() {
		for (int i = 0; i < correct.length; i++) {
			if (studentAnswer[i].equalsIgnoreCase(correct[i])) {
				questionsCorrect ++;
				
			} else {
				questionsIncorrect++;	
				incorrectAnswers[i] = i;
			}
		}
		
	}
	
	public String getAllIncorrect() {
		String output = "You missed question(s)\n";
		
		for (int i = 0; i < incorrectAnswers.length; i++) {
			if (incorrectAnswers[i] != 0) {
				output += incorrectAnswers[i] + "\n";
				
			}
			
		}
		
		return output;
	}
	
	public void input() {
		String userInput;
	
		for (int i = 0; i < (correct.length); i++) {
			do {
				userInput = JOptionPane.showInputDialog("Enter A, B, C, or D");
				
				if (!(validResponse(userInput))) {
					JOptionPane.showMessageDialog(null, "Invalid, Enter A, B, C, or D");
					
				} else {
					if (validResponse(userInput)) {
						studentAnswer[i] = userInput;
						
					}
				}
				
			} while (!(validResponse(userInput)));
			
		}

	}
	
	public boolean validResponse(String userInput) {
		if (userInput.equalsIgnoreCase("A") ||
			userInput.equalsIgnoreCase("B") ||
			userInput.equalsIgnoreCase("C") ||
			userInput.equalsIgnoreCase("D") ) {
			
			return true;
			
		} else {
			return false;
			
		}
	}
}
