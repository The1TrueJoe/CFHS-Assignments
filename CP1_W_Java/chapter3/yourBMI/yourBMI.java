/**
This program calculates your BMI

@author JosephTelaak

9/10/18
 */



package yourBMI;

import java.util.Scanner;

public class yourBMI {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		
		// Integers and strings
		final int num = 703;
		
		double BMI,
		       weight,
		       height;
		
		String rangeBMI;
		
		keyboard = new Scanner(System.in);
		
		// Weight
		System.out.println("What is your weight?");								// Asks for weight
		weight = keyboard.nextDouble();											// Scans for weight
		
		// Height
		System.out.println("What is your height? (In Inches)");					// Asks for height
		height = keyboard.nextDouble();											// Scans for height
		
		// Calculations
		BMI = (weight * num) / (Math.pow(height, 2));							// Calculates BMI
		
		// If, If Else, Else
		if (BMI >= 18.5 && BMI <= 25) {											// BMI is between 18.5 and 25
			rangeBMI = " optimal";												// Optimal Range
			
		} else if (BMI <= 18.5) {												// BMI is under 18.5
			rangeBMI = " underweight";											// Under weight
			
		} else if (BMI >= 25) {													// BMI is over 25
			rangeBMI = " overweight";											// Overweight
			
		} else {
			rangeBMI = " ERR";													// ERR
			
		}
		
		// Outputs
		System.out.println("\n\n\n");
		System.out.println("Your BMI is " + BMI + ", you are" + rangeBMI);
		
	}
}