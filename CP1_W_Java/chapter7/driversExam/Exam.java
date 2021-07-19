package driversExam;

public class Exam {

	// Finals
	public final int TOTAL = 20;
	public final int PASS = 15;
	
	// Feilds
	public int questionsCorrect = 0;
	public int questionsIncorrect = 0;
	public double percentage;
	
	// Arrays
	public String[] studentAnswer = new String[TOTAL];
	public String[] correct = {
			"B", "D", "A", "A", "C",
			"A", "B", "A", "C", "D",
			"B", "C", "D", "A", "D",
			"C", "C", "B", "D", "A"
	};
	
	/** 
	 * 
	 * @return percentage
	 */
	public double getPercentage() {return 100 * ((questionsCorrect) / 20); }
	
	/**
	 * 
	 * @return correct questions
	 */
	public int getTotalCorrect() { return questionsCorrect; }
	
	/**
	 * 
	 * @return incorrect questions
	 */
	public int getTotalIncorrect() { return questionsIncorrect; }
	
	/**
	 * Adds answer 
	 * 
	 * @param ans
	 * @param inst
	 */
	public void addAnswer(String ans, int inst) { studentAnswer[inst] = ans; }
	
	/**
	 * Checks for incorrect
	 */
	public void checkForIncorrect() {
		for (int i = 0; i < TOTAL; i ++) {
			
			// Check
			if (studentAnswer[i].equalsIgnoreCase(correct[i])) {
				// Correct
				questionsCorrect++;
				
			} else {
				// Incorrect
				questionsIncorrect++;
				
			}
		}
	}
	
	/**
	 * 
	 * Creates incorrect array @return output
	 */
	public String incorrect() {
		// Array
		int[] incorrectAnswers = new int[questionsIncorrect];
		
		// Int
		int j = 0;
		
		// Check
		if (questionsCorrect > 0) {
			for (int i = 0; i < studentAnswer.length; i++) {
				
				// Check
				if (!(studentAnswer[i].equalsIgnoreCase(correct[i]))) {
					// Add array
					incorrectAnswers[j] = (i + 1);
					
					// Counter
					j++;
				}
			}
		}

		// String
		String output = "You missed the following question(s)\n";
		
		// Build output
		for (int a = 0; a < incorrectAnswers.length; a++) {
			if (incorrectAnswers[a] != 0) {
				// Output
				output += incorrectAnswers[a] + "\n";
			}
		}
		
		// Return
		return output;
		
	}
	
	/**
	 * 
	 * Checks if passsing @return pass
	 */
	public boolean passing() {
		// Check
		if (questionsCorrect >= PASS) {
			// Return 
			return true;
			
		} else {
			// Return
			return false;
			
		}
	}
	
	/**
	 * 
	 * Checks if valid response @param userInput
	 * @return repsonse
	 */
	
	public boolean validResponse(String userInput) {
		// Valid
		if (userInput.equalsIgnoreCase("A") ||
				userInput.equalsIgnoreCase("B") ||
				userInput.equalsIgnoreCase("C") ||
				userInput.equalsIgnoreCase("D") ) {
				
				// Return
				return true;
				
			} else {
				// Return
				return false;
				
			}
	}
}
