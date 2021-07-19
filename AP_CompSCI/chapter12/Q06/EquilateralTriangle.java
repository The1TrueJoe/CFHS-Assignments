package Q06;

public class EquilateralTriangle extends Triangle {

	public int side;
	
	public EquilateralTriangle(int side) {
		super(side);
	}

	public int getPerimeter() {
		return A + B + C;
	}

	public double getArea() {
		int s = (A + B + C)/2;
		return Math.sqrt(s * (s-A) * (s-B) * (s-C));
	}

}
