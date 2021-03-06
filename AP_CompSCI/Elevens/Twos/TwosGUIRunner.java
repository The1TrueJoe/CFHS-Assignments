package Twos;

import Activity09.Board;

/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class TwosGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new TwosBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
