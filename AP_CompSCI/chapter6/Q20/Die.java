package Q20;

import java.util.Random;

public class Die {
	
	private int sides;
	private int spots;
	
	public Random rand = new Random();
	
	public Die() {
		sides = 6;
	} 
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public void roll() {
		spots = (int)(sides * Math.random()) + 1;
	}
	
	public int getNumOfDots() {
		return spots;
	}

	public static void main(String[] args) {
		Die die = new Die(8);
		
		die.roll();
		System.out.println(die.getNumOfDots());
		
		die.roll();
		System.out.println(die.getNumOfDots());
	}
}
