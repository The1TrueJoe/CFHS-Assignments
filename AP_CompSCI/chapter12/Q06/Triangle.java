package Q06;

public abstract class Triangle {

	public int A;
	public int B;
	public int C;
	
	public Triangle(int A, int B, int C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}

	public Triangle(int side) {
		A = side;
		B = side;
		C = side;
	}
	
	public double getRatio() {
		return getArea()/getPerimeter();
	}

	public abstract int getPerimeter();
	public abstract double getArea();
	
	
}
