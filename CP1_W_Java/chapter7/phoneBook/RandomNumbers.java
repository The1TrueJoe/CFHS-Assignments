package phoneBook;

import employee.RandomGen;

public class RandomNumbers extends RandomGen{
	// Generate number
	public String getNumber() { 
		// String
		String output = "";
		
		// Generate 3 digit segments
		for (int i = 0; i < 2; i++) {
			for (int x = 0; x < 3; x++) {
				output += generate();
			}
			
			// Add dash
			output += "-";
		}
		
		// Generate 4 digit segment
		for (int i = 0; i < 4; i++) {
			output += generate();
		}
		
		// Return
		return output;
	}
}
