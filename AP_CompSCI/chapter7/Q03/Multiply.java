package Q03;

import java.util.Scanner;

public class Multiply {
	
	public static int multiply(int num, int multiplier) {
		int result = 0;
		
		for (int i = 0; i < multiplier; i++) {
			result += num;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = keyboard.nextInt();
		
		System.out.println("Enter Multiplier");
		int multiplier = keyboard.nextInt();
		
		System.out.println(num + " * " + multiplier + " = " + multiply(num, multiplier));
		
		keyboard.close();
	}

}
