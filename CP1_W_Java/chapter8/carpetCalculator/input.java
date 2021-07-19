package carpetCalculator;

import java.util.Scanner;

public class input {
	
	public Scanner keyboard;
	
	public input(Scanner key) {
		keyboard = key;
	}

	public double width() {
		double width;
		
		System.out.println("Enter width");
		width = keyboard.nextDouble();
		
		return width;
	
	}
	
	public double length() {
		double length;
		
		System.out.println("Enter length");
		length = keyboard.nextDouble();
		
		return length;
	
	}
}
