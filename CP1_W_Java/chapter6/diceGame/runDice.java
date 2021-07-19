package diceGame;

import javax.swing.JOptionPane;

import chapterResources.Die;

public class runDice {

	public final static int SIDES = 6;
	
	public static void main(String[] args) {
		
		int num;
		
		Die userDie = new Die(SIDES);
		Die compDie = new Die(SIDES);
		
		Dice game = new Dice(userDie, compDie);

		do {
			game.Roll(10);
			
			num = JOptionPane.showConfirmDialog(null, game.getWinner() + "\n" + 
														"User: " + game.getUserScore() + "\n" +
														"Computer: " + game.getCompScore() + "\n\n" +
														"Play Again?");
		} while (num == 0);
	}

}
