package cars;

import javax.swing.JOptionPane;

public class runCars {

	public static void main(String[] args) {
		// String
		String output = "";
		
		// Onject
		Cars car = new Cars();
		
		// Sets
		car.setYear(input.year());
		car.setMake(input.make());
		
		// Output
		output += ("The car is a " + car.getYear() + " " + car.getMake() + 
					" with an initial speed of " + car.getSpeed() + "\n");
		
		output += ("Speed: " + car.getSpeed() + "\n");
		
		// Accelerate
		for (int i = 0; i <= 5; i++) {
			// Accelerate
			car.accelerate();
			
			// Output
			output += ("Speed: " + car.getSpeed() + "\n");
		}
		
		for (int i = 0; i <= 5; i++) {
			// Brake
			car.brake();
			
			// Output
			output += ("Speed: " + car.getSpeed() + "\n");
		}
		
		// Output
		JOptionPane.showMessageDialog(null, output);

	}
	
}
