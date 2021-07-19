package circle;

public class Circle {

	private double radius;
	
	/**
	 * 
	 * @param rad
	 */
	public Circle(double rad) {
		radius = rad;
	}
	
	/** 
	 * 
	 */
	
	public Circle() {
		radius = 0.0;
	}
	
	/** 
	 * 
	 * @param rad
	 */
	
	public void setRad(double rad) {
		radius = rad;
	}
	
	/** 
	 * 
	 * @return
	 */
	
	public double getRad() {
		return radius;
	}
	
	/** 
	 * 
	 * @return
	 */
	
	public double getArea() {
		double area;
		
		area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}
	
	/** 
	 * 
	 * @return
	 */
	
	public double getDiameter() {
		double diameter;
		
		diameter = radius * 2;
		
		return diameter;
	}
	
	/** 
	 * 
	 * @return
	 */
	
	public double getCircumference() {
		double circum;
		
		circum = 2 * Math.PI * radius;
		
		return circum;
	}
}