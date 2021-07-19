/**
This is a dice game

@author JosephTelaak

10/18/18
 */



package diceGame;

import javax.swing.JOptionPane;
import java.util.Random;

public class diceGame {

	public static void main(String[] args) {
		
		// Ints
		int userCount = 0,
		    userRoll,
		    compCount = 0,
		    compRoll;
		
		Random random = new Random();
		
		// Game
		for (int i = 0; i <= 10; i++) {															// 10 Games
			
			// Randoms
			userRoll = random.nextInt(6) + 1;													// User
			compRoll = random.nextInt(6) + 1;													// Computer
			
			// Winners
			if (compRoll < userRoll) {															// User won
				userCount++;																	// Add point
				
			} else if (compRoll > userRoll) {													// Computer won
				compCount++;																	// Add point
				
			} else {																			// Tie
				compCount++;																	// Add point
				userCount++;																	// Add point
				
			}
			
		}
		
		//  Display winner
		if (compCount < userCount) {															// User won
			JOptionPane.showMessageDialog(null, "USER won with " + userCount + "\n" +
		                                        "COMPUTER lost with " + compCount
		                                        );
			
		} else if (compCount > userCount) {														// Computer won
			JOptionPane.showMessageDialog(null, "COMPUTER won with " + compCount + "\n" + 
		                                        "USER lost with " + userCount
		                                        );
			
		} else {																				// Tie
			JOptionPane.showMessageDialog(null, "TIE");
			
		}

	}

}
