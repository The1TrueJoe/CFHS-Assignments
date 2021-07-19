package circle;

import javax.swing.JOptionPane;

public class runCircle {

	public static void main(String[] args) {
		// Object
		Circle circle = new Circle();
		
		// Get radius
		circle.setRad(input.radius());
		
		// Output
		JOptionPane.showMessageDialog(null, "Circle with radius " + circle.getRad() + "\n" +
											" Area: " + circle.getArea() + "\n" +
											" Diameter: " + circle.getDiameter() + "\n" +
											" Circumference: " + circle.getCircumference());

	}

}