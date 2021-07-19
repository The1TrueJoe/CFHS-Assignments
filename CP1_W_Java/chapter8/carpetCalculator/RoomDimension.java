package carpetCalculator;

public class RoomDimension {

	public double length;
	public double width;
	
	public RoomDimension(double len, double wid) {
		length = len;
		width = wid;
	}
	
	public double getArea() { return length * width; }
	
	public String toString() {
		return "Length: " + length + "\n" + "Width: " + width;
	}
}
