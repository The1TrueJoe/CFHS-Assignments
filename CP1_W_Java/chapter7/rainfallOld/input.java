package rainfallOld;

import java.util.Scanner;

public class input {

	public static Scanner keyboard = new Scanner(System.in);
	
	public static double rain() {
		double rain;
		
		System.out.println("Enter rainfall for month ");
		rain = keyboard.nextDouble();
		
		return rain;
	}
	
}
