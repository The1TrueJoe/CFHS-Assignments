/**
 * Cubeoid
 */


package Square;

public class CubeoidB{
	// Feild
	public int height;
	private Rectangle rect;
	
	// Constructor
	public CubeoidB(int length, int width, int height) {
		rect = new Rectangle(length, width);
		this.height = height;
	}
	
	// Get volume
	public int getVolume() { return rect.getArea() *  height; }
	
}
