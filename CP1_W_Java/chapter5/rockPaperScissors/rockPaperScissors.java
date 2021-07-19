package rockPaperScissors;

import java.util.Random;

import javax.swing.JOptionPane;

public class rockPaperScissors {

	public static void main(String[] args) {
	
		String computer, 
		       user;
		
		boolean win; // True -> User, False -> Computer
		
		Random rand = new Random();
		
		for (int i = 0; i <= 100; i++) {
			computer = computer(rand);
			user = user();
			
			win = isWin(computer, user);
			
			display(win, computer, user);
		}
		
		
		
	}
	
	public static boolean isWin(String computer, String user) {
		
		if (computer == "rock" && user.toLowerCase() == "scissors") {				// Lose
			return false;
		} else if (computer == "scissors" && user.toLowerCase() == "rock") {		// Win
			return true;
		} else if (computer == "paper" && user.toLowerCase() == "scissors") {		// Win
			return true;
		} else if (computer == "scissors" && user.toLowerCase() == "paper") {		// Lose
			return false;
		} else if (computer == "paper" && user.toLowerCase() == "rock") {			// Lose
			return false;
		} else if (computer == "rock" && user.toLowerCase() == "paper") {			// Win
			return true;
		} else if (computer == user.toLowerCase()){									// Tie
			return false;
		} else {
			return false;
		}
		
	}
	
	public static String computer(Random rand) {
		String computer;
		int num = rand.nextInt(3) + 1;
		
		if (num == 1){
			computer = "rock";
		} else if (num == 2) {
			computer = "paper";
		} else {
			computer = "scissors";
		}
		
		return computer;
	}
	
	public static String user() {
		String user;
		user = JOptionPane.showInputDialog("Enter Rock, Paper, Scissors");
				
		return user;
	}
	
	public static void display(boolean win, String computer, String user) {
		String winner;
		
		if (win == true) {
			winner = "user";
		} else if (win == false && computer.equals(user)) {
			winner = "tie";
		} else {
			winner = "computer";
		} 
		
		JOptionPane.showMessageDialog(null, "Winner is: " + winner + "\n" +
											"Computer: " + computer + "\n" +
											"User: " + user);
	}
}
