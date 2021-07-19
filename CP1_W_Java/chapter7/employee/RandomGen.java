package employee;

import java.util.Random;

public class RandomGen {
	public Random rand = new Random();
	
	public int generate() { return rand.nextInt(10); }
	public int generate(int x) { return rand.nextInt(x); }
	public int select(int x) { return rand.nextInt(x); }
}
