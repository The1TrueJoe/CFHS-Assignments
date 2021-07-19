package cookieCalories;

import java.util.Scanner;

public class cookieCalories {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		
		final double caloriesPerServing  = 300,
				     servingsPerBag      = 10,
				     cookiesPerServing   = 4;
		
		double cookiesAte,
		       caloriesConsumed,
		       servingsEaten,
		       bagsEaten;
		
		String textOut;
		
		keyboard = new Scanner(System.in);
		
		System.out.println("How many cookies did you eat?");
		cookiesAte = keyboard.nextDouble();
		
		String lessThan10 = "You ate " + cookiesAte + " cookies";
		String moreThan10 = lessThan10 + ". That is too much";
		
		servingsEaten = cookiesAte / cookiesPerServing;
		bagsEaten = servingsEaten / servingsPerBag;
		caloriesConsumed = cookiesAte * caloriesPerServing;
		
		if (cookiesAte >= 10) {
			textOut = moreThan10;
		} else {
			textOut = lessThan10;
		}
		
		System.out.println(
				textOut + "\n" +
				"You ate " + servingsEaten + " servings" + "\n" + 
				"You ate " + bagsEaten + " bags" + "\n" + 
				"You consumed " + caloriesConsumed + " calories"
				);

	}

}