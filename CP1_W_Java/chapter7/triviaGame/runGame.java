package triviaGame;

import java.io.FileNotFoundException;

public class runGame {

	public static void main(String[] args) throws FileNotFoundException {
		final int gameCount = 10;
		
		@SuppressWarnings("unused")
		Game game = new Game(gameCount);
		
		for (int i = 0; i < gameCount; i++) {
			System.out.println(
					"Question " + (i+1) + "\n"
					);
		}
		
	}

}
