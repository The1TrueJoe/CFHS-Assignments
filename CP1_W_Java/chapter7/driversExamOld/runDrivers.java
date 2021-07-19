package driversExamOld;

import javax.swing.JOptionPane;

public class runDrivers {

	public static Drivers driver = new Drivers();
	
	public static void main(String[] args) {
		
		String passed;
		
		driver.input();
		driver.scanForIncorrect();

		if (driver.isPassed()) {
			passed = "have passed";
		} else {
			passed = "have not passed";
		}
		
		JOptionPane.showMessageDialog(null, "You " + passed + " at " + driver.getPercentage() + "% or \n" +
						   					"Questions right: " + driver.getTotalCorrect() + "\n" +
						   					"Questions wrong: " + driver.getTotalIncorrect() + "\n" +
						   					driver.getAllIncorrect());
	}

}
