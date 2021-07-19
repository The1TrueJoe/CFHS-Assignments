package conversionProgram;

import java.util.Scanner;

public class writeOut {

	public static void main(String[] args) {
		int zeros;
		
		String num = null;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter zeros");
		zeros = keyboard.nextInt();
		
		for (int i = 1; i >= zeros; i++) {
			num += "0";
		}
		
		System.out.println(num);
		
		
	}

}
