package Triangle;

public class Triangle {

	public int a, b, c, s;
	
	public Triangle(int a, int b, int c) {
		this.a = a;  this.b = b; this.c = c;
	}
	
	public double getArea() {
		s = (a+b+c)/2;
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
	
	public String toString() { return "Area: " + getArea() + "\nS1: " + a + " S2: " + a + " S3: " + a + " S: " + s; }
	
}
