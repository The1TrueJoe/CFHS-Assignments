package Q02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Text");
		String str = keyboard.nextLine();
		keyboard.close();
		
		System.out.println(isNotEmpty(str) + " " + hasCharacters(str));
	}
	
	public static boolean isNotEmpty(String str) {
		if (!str.isEmpty() && str.endsWith("*")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean hasCharacters(String str) {
		if (str.length() >= 2 && str.endsWith("**")) {
			return true;
		} else {
			return false;
		}
	}
}
