package Q18;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter word");
		String str = keyboard.nextLine();
		keyboard.close();
		
		System.out.println(isPalindrome(str));

	}

	public static boolean isPalindrome(String str) {
		str = replace(str);
		
		String front = str.substring(0, (str.length() / 2) + 1);
		String back = "";
		
		for (int i = str.length(); i > (str.length() / 2); i--) {
			back += str.charAt(i - 1);
		}
		
		if (front.equalsIgnoreCase(back)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String replace(String str) {
		str = str.replace(" ", "");
		str = str.replace(",", "");
		str = str.replace("'", "");
		str = str.replace("!", "");
		str = str.replace(".", "");
		str = str.replace("?", "");
		str = str.replace(":", "");
		str = str.replace(";", "");
		
		return str;
	}
}