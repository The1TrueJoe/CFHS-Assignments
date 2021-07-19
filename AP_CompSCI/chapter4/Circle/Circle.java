/**
 * Circle
 */


package Circle;

public class Circle {
	// Feild
	public int radius;
	
	// Constructor
	public Circle(int r) { radius = r; }
	
	// Get
	public double getArea() { return Math.PI * Math.pow(radius, 2); }
	public int getRadius() { return radius; }
	
}
