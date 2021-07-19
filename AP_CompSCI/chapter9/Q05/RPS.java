package Q05;

import java.util.Random;

public class RPS {

	public static void main(String[] args) {
		char[] rps = {'r', 'r', 'r',
					  'p', 'p', 'p', 'p', 'p',
					  's', 's', 's', 's', 's', 's'};
		
		Random rand = new Random();
		
		System.out.println(rps[rand.nextInt(rps.length)]);
	}
	
}
