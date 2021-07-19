package Balloon;

import java.awt.Color;

public class BalloonTester {

	public static void main(String[] args) {
		int x = 50, y = 100, z = 30;
		
		Balloon greenie = new Balloon(x, y, z, Color.GREEN);
		
		System.out.println("x = " + greenie.getX());
		System.out.println("y = " + greenie.getY());
		System.out.println("radius = " + greenie.getRadius());
		
		greenie.move(60, 110);
		
		System.out.println("x = " + greenie.getX());
		System.out.println("y = " + greenie.getY());
		
		boolean onBorder = greenie.isOnBorder(81, 131);
		
		System.out.println("(81,131) is on border: " + onBorder);
	}
	
}
