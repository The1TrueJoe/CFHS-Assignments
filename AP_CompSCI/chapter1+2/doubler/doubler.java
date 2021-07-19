package doubler;

import java.util.Scanner;

public class doubler {

	public static void main(String[] args) {
		int n;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number");
		n = keyboard.nextInt();
		
		System.out.println("2 * " + n + " = " + (n+n));
		
		keyboard.close();

	}

}