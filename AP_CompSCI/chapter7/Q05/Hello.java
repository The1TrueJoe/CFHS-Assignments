package Q05;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a positive integer");
		int n = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("Enter text");
		String text = keyboard.nextLine();
		keyboard.close();
		
		display(n, text);
		
	}
	
	public static void display(int n, String text) {
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ") " + text);
		}
	}

}
