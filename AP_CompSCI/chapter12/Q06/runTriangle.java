package Q06;

public class runTriangle {

	public static void main(String[] args) {
		Triangle right = new RightTriangle(12, 12, 12);
		Triangle iso = new IsoscelesTriangle(9, 40, 41);
		Triangle equal = new EquilateralTriangle(12);
		
		System.out.println("  Right Triangle: " + right.getRatio());
		System.out.println("  Isosceles Triangle: " + iso.getRatio());
		System.out.println("  Equilateral Triangle: " + equal.getRatio());
	}

}