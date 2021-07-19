/**
 * This program calculates the area of a rectangle
 * 
 * @author JosephTelaak
 * 
 * @date_created 10/30
 * @date_edited 10/31
 */

package rectangleArea;

import java.util.Scanner;

public class rectangleArea {

	public static void main(String[] args) {
		
		// Doubles
		double length = 0,
		       width  = 0,
		       area   = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Get lengths 
		length = getLength(length, keyboard);
		width = getWidth(width, keyboard);
		
		// Caclulate ares
		area = getArea(length, width, area);
		
		// Show data
		displayData(length, width, area);

	}
	
	/**
	 * This method gets the length
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param length
	 * @param keyboard
	 * @return
	 */
	
	public static double getLength(double length, Scanner keyboard) {
		// Input
		System.out.println("What is the length of the rectangle");
		length = keyboard.nextDouble();
		
		// Return
		return length;
	}

	/**
	 * This method gets the width
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param width
	 * @param keyboard
	 * @return
	 */
	
	public static double getWidth(double width, Scanner keyboard) {
		// Input
		System.out.println("What is the width of the rectangle");
		width = keyboard.nextDouble();
		
		// Return
		return width;
	}
	
	/**
	 * This method gets the area
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param length
	 * @param width
	 * @param area
	 * @return
	 */
	
	public static double getArea(double length, double width, double area) {
		// Calculation
		area = length * width;
		
		// Return
		return area;
	}
	
	/**
	 * This method displays the data
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param length
	 * @param width
	 * @param area
	 */
	
	public static void displayData(double length, double width, double area) {
		// Output
		System.out.printf("Area: %,.0f, Length: %,.0f, Width: %,.0f", area, length, width);
		
	}
}
