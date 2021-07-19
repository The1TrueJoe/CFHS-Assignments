package chapterResources;

import java.util.Random;

public class Die {

	private int sides;
	private int value;
	
	private Random rand = new Random();
	
	public Die(int numSides) {
		sides = numSides;
	}
	
	public void roll() {
		value = rand.nextInt(sides) + 1;
	}
	
	public int getSides() {
		return sides;
	}
	
	public int getValue() {
		return value;
	}
	
}
