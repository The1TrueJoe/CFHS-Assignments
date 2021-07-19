package Q10;

public class Rectangle {

	public int height;
	public int width;
	
	public int getHeight() { return height; }
	public int getWidth() { return width; }
	
	public Rectangle(int height, int width) {
		if (width >= 0 && height >= 0) {
			this.width = width;
			this.height = height;
		} else {
			 throw new IllegalArgumentException(
			           "Rectangle Construction Error: cannot be negative number");
		}
	}
	
	public Rectangle(int a) {
		this(a,a);
	}
	
	public Rectangle() {
		height = 1;
		width = 1;
	}
	
	public boolean isSquare() {
		if (height == width) {
			return true;
		} else {
			return false;
		}
	}
	
	public void quadratize() {
		while (height != width) {
			if (height > width) {
				height -= width;
			} else {
				width -= height;
			}
		}
	}
	
	public String toString() {
		return "(" + height + " * " + width + ", " + isSquare() + ")";
	}
	
	
}
