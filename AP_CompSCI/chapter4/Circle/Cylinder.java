/**
 * Cylinder
 */


package Circle;

public class Cylinder extends Circle{
	// Feild
	private int height;
	
	// Constructor
	public Cylinder(int h, int r) {
		super(r);
		height = h;
	}
	
	// Get volume
	public double getVolume() { return getArea() * height; }
	
}
