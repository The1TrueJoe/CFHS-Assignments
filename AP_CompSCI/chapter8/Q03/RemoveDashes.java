package Q03;

import java.util.Scanner;

public class RemoveDashes {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number");
		String str = keyboard.nextLine();
		keyboard.close();
		
		System.out.println(removeDashes(str));
		
	}

	public static String removeDashes(String str) {
		String temp = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) + "").equals("-")){
				temp += str.charAt(i);
			}
		}
		
		return temp;
	}
}
