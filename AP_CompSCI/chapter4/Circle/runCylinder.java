/**
 * Gets volume of a cylinder
 * 
 * @author josephtelaak
 * 
 * @date_created 2/5/19
 * @date_edited 2/6/19
 */



package Circle;

import java.util.Scanner;

public class runCylinder {

	public static void main(String[] args) {
		// Ints
		int radius;
		int height;
		
		// Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Radius
		System.out.println("Enter radius");
		radius = keyboard.nextInt();
		
		// Height
		System.out.println("Enter height");
		height = keyboard.nextInt();
		
		// Cylinder
		Cylinder c = new Cylinder(height, radius);
		
		// Output
		System.out.println("Volume: " + c.getVolume());
		
		// Close
		keyboard.close();


	}

}
