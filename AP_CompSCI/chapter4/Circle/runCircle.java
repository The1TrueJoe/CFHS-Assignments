/**
 * Gets area of a circle
 * 
 * @author josephtelaak
 * 
 * @date_created 2/5/19
 * @date_edited 2/6/19
 * 
 */


package Circle;

import java.util.Scanner;

public class runCircle {

	public static void main(String[] args) {
		// Int
		int radius;
		
		// Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Radius
		System.out.println("Enter radius");
		radius = keyboard.nextInt();
		
		// Ciricle
		Circle c = new Circle(radius);
		
		// Output
		System.out.println("Area: " + c.getArea());
		
		// Close
		keyboard.close();

	}

}
