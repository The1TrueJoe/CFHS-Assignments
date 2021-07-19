package area;

public class Area {

	public double area(double r) {
		double area;
		
		area = Math.PI * (r * r);
		
		return area;
	}
	
	public int area(int l, int w) {
		int area;
		
		area = l * w;
		
		return area;
	}
	
	public double area(double r, double h, int x) {
		double area;
		
		area = Math.PI * (r * r) * h;
		
		return area;
	}
	
}
