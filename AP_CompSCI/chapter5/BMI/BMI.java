package BMI;

public class BMI {

	private double weight;
	private double height;
	
	public BMI() { weight = 0.0; height = 0.0; }
	
	public void setWeight(double weight) { this.weight = weight / 2.205; }
	public void setHeight(double height) { this.height = height / 39.37; }
	
	public double getWeight() { return weight; }
	public double getHeight() { return height; }
	
	public double getBMI() { return weight / (height * height); }
	
	public String toString() { return String.format("BMI: %.2f\n\nHeight: %.2fM\nWeight: %.2fKg", 
													getBMI(), getHeight(), getWeight());}
}
