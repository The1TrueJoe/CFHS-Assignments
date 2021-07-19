package driversExam;

import javax.swing.JOptionPane;

public class runExam {

	public static Exam test = new Exam();
	
	public static void main(String[] args) {
		// String
		String pass;
		
		// Input
		input();
		
		// Check for incorrec
		test.checkForIncorrect();
		
		// Convert to string
		if (test.passing()) {
			// Convert
			pass = "are passing";
		} else {
			// Convert
			pass = "are not passing";
		}
		
		// Output
		JOptionPane.showMessageDialog(null, 
				"You got " + test.getPercentage() + "%" +
				"\nYou " + pass +
				"\nQuestions Correct: " + test.getTotalCorrect() +
				"\nQuestions Incorrect: " + test.getTotalIncorrect() +
				"\n\n" + test.incorrect());
		
	}
	
	/**
	 * Input values
	 */
	
	public static void input() {
		// String
		String userInput;
		
		for (int i = 0; i < 20; i++) {
			do {
				// Input
				userInput = JOptionPane.showInputDialog("Enter A, B, C, or D");
				
				// Valid response
				if (!(test.validResponse(userInput))) {
					// Output
					JOptionPane.showMessageDialog(null, "Invalid, Enter A, B, C, or D");
					
				} else {
					// Valid
					if (test.validResponse(userInput)) {
						// Add answer
						test.addAnswer(userInput, i);
						
					}
				}
				
			} while (!(test.validResponse(userInput)));
		}
	}

}
