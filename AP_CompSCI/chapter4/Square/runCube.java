/**
 * Gets area of a cube
 * 
 * @author josephtelaak
 * 
 * @date_created 2/5/19
 * @date_edited 2/6/19
 */



package Square;

import java.util.Scanner;

public class runCube {

	public static void main(String[] args) {
		// Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Integer
		int length, width, height;
		
		// Length
		System.out.println("Enter Length");
		length = keyboard.nextInt();
		
		// Width
		System.out.println("Enter Width");
		width = keyboard.nextInt();
		
		// Height
		System.out.println("Enter Height");
		height = keyboard.nextInt();
		
		// Cubes
		CubeoidA cube = new CubeoidA(length, width, height);
		CubeoidB cubeB = new CubeoidB(length, width, height);
		
		// Output
		System.out.println("Volume: " + cube.getVolume());
		System.out.println("Volume: " + cubeB.getVolume());
		
		// Close
		keyboard.close();
	}

}
