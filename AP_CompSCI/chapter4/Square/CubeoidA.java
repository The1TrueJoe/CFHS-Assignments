/**
 * Cubeoid
 */

package Square;

public class CubeoidA extends Rectangle{
	// Feild
	public int height;
	
	// Contructor
	public CubeoidA(int length, int width, int height) {
		super(length, width);
		this.height = height;
	}
	
	// Get volume
	public int getVolume() { return getArea() *  height; }
	
}
