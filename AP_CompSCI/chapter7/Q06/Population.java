package Q06;

import java.util.Scanner;

public class Population {

	public static void main(String[] args) {
		
		final double INITIAL_POPULATION = 123.8;
		final double GROWTH_RATE = 1.005;
		final int CURRENT_YEAR = 2014;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Target Population (M)");
		double target = keyboard.nextInt();
		keyboard.close();
		
		int year = CURRENT_YEAR;
		double population = INITIAL_POPULATION;
		
		while (population <= target) {
			population *= GROWTH_RATE;
			year++;
		}
		
		System.out.println("It will take " + (year-CURRENT_YEAR) + " year(s) to reach " + 
							target + "M from " + INITIAL_POPULATION + "M in " + year);
 
	}

}
