package favorite;

import java.util.Scanner;

public class favorite {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String movie;
		
		System.out.println("What is the best movie?");
		movie = keyboard.nextLine();
		
		System.out.println(movie + " is terrible \n" + 
						   "Just kidding " + movie + " is awesome");

		keyboard.close();
	}

}