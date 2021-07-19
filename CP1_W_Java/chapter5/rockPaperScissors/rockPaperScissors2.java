package rockPaperScissors;

import java.util.Random;

import javax.swing.JOptionPane;

public class rockPaperScissors2 {

	public static void main(String[] args) {
		// Strings
		String user,
		       computer,
		       winResult;
		
		Random rand = new Random();
		
		// Game
		do {
			
			// Input
			user = user();																// Gets user choice
			computer = computer(rand);													// Gets computer choice
			
			// Calculation
			winResult = isWin(user, computer);											// Gets win result
			
			// Display
			display(winResult, user, computer);											// Displays result
			
		} while (winResult.equalsIgnoreCase("TIE"));									// Do again when tie
	}
	
	/**
	 * This method gets the user choice
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/5/18
	 * @date_edited 11/7/18
	 * 
	 * @return 
	 */
	
	public static String user() {
		// String
		String user;														
		
		// Input
		user = JOptionPane.showInputDialog("Enter Rock, Paper, Scissors");				// Input
				
		// Return
		return user;																	// Return
	}
	
	/**
	 * This method gets the computer choice
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/5/18
	 * @date_edited 11/7/18
	 * 
	 * @param rand
	 * @return
	 */
	
	public static String computer(Random rand) {
		// Random
		int num = rand.nextInt(3) + 1;													// Computer choice
		
		// Convert to string
		if (num == 1){																	// 1 = rock
			return "rock";
		} else if (num == 2) {															// 2 = paper
			return "paper";
		} else {																		// 3 = scissor
			return "scissors";
		}

	}
	
	/**
	 * player smashes player
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/5/18
	 * @date_edited 11/7/18
	 * 
	 * @param player1
	 * @param player2
	 * @return
	 */
	
	public static boolean smashes(String player1, String player2) {
		// smashes
		if (player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("scissors")) {	// Player 1 wins
			return true;
		} else {																		// Player 2 wins
			return false;
		}
	}
	
	/**
	 * player cuts player
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/5/18
	 * @date_edited 11/7/18
	 * 
	 * @param player1
	 * @param player2
	 * @return
	 */
	
	public static boolean cuts(String player1, String player2) {
		if (player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("paper")) {// Player 1 wins
			return true;
		} else {																		// Player 2 wins
			return false;
		}
	}
	
	/**
	 * player wraps player
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/5/18
	 * @date_edited 11/7/18
	 * 
	 * @param player1
	 * @param player2
	 * @return
	 */
	
	public static boolean wraps(String player1, String player2) {
		if (player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("rock")) {	// Player 1 wins
			return true;
		} else {																		// Player 2 wins
			return false;
		}
	}
	
	/**
	 * This method checks if you win
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/5/18
	 * @date_edited 11/7/18
	 * 
	 * @param user
	 * @param computer
	 * @return
	 */
	
	public static String isWin(String user, String computer) {
		// Win
		if (smashes(user, computer)) {													// User smashes computer
			return "win";
		} else if (smashes(computer, user)) {											// Computer smashes user
			return "loss";
		} else if (cuts(user, computer)) {												// User cuts computer
			return "win";
		} else if (cuts(computer, user)) {												// Computer cuts user
			return "loss";
		} else if (wraps(user, computer)) {												// User wraps computer
			return "win";
		} else if (wraps(computer, user)) {												// Computer wraps user
			return "loss";
		} else {																		// tie
			return "TIE";
		}
		
		
	}
	
	/**
	 * This method displays the information
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 11/5/18
	 * @date_edited 11/7/18
	 * 
	 * @param winResult
	 * @param user
	 * @param computer
	 */
	
	private static void display(String winResult, String user, String computer) {
		// Output
		JOptionPane.showMessageDialog(null, winResult + "\nUser: " + user + "\nComputer: " + computer);
	}
}
