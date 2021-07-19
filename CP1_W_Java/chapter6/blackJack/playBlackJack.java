package blackJack;

import javax.swing.JOptionPane;

import chapterResources.Die;

public class playBlackJack {

	public static void main(String[] args) {
		
		final int SIDES = 6;
		
		Jack game = new Jack();
		
		Die compDie = new Die(SIDES);
		Die userDie = new Die(SIDES);
		
		do {
			compDie.roll();
			game.setComp(compDie.getValue());
			
			userDie.roll();
			game.setUser(userDie.getValue());
			
		} while (input.cont() == true && game.getUser() <= 21);
		
		JOptionPane.showMessageDialog(null, game.isWinner() + "\nUser: " + 
											game.getUser() + "\nComputer: " + game.getComp());

	}

}
