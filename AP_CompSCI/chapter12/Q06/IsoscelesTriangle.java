package Q06;

public class IsoscelesTriangle extends Triangle {

	public IsoscelesTriangle(int A, int B, int C) {
		super(A, B, C);
	}

	public int getPerimeter() {
		return A + B + C;
	}

	public double getArea(){
		int s = (A + B + C)/2;
		return Math.sqrt(s * (s-A) * (s-B) * (s-C));
	}

}
