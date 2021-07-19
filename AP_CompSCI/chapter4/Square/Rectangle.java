/**
 * Rectangle
 */


package Square;

public class Rectangle {
	// Feild
	public int length;
	public int width;
	
	// Constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	// Get area
	public int getArea() { return length * width; }
	
}
