package diceGame;

import chapterResources.Die;

public class Dice {

	public Die userDie;
	public Die compDie;
	
	public int userScore;
	public int compScore;
	
	public boolean winner;
	
	public Dice(Die user, Die comp) {
		userDie = user;
		compDie = comp;
		
		userScore = 0;
		compScore = 0;
	}

	public void Roll(int runs) {
		for (int i = 0; i <= runs; i++) {
			userDie.roll();
			userScore += userDie.getValue();
			
			compDie.roll();
			compScore += compDie.getValue();
		}
	}
	
	public int getUserScore() {
		return userScore;
	}
	
	public int getCompScore() {
		return compScore;
	}
	
	public String getWinner() {
		if (userScore > compScore) {
			winner = true;
			return "User wins";
		} else if (userScore < compScore) {
			winner = false;
			return "Computer wins";
		} else 
			return "Tie";
	}

}
