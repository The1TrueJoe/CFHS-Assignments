package Q10;

import java.util.Random;

public class RandLetters{

	public static Random rand = new Random();
	
	public static String[] letter = {"A", "B", "C", "D", "E"};
	
	public static String getLetter() { return letter[rand.nextInt(letter.length)]; }
	
}
