package BMI;

import java.util.Scanner;

public class runBMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		BMI bmi = new BMI();
		
		System.out.println("Enter weight lbs");
		bmi.setWeight(input.nextDouble());
		
		System.out.println("Enter height inch");
		bmi.setHeight(input.nextDouble());
		
		input.close();
		
		System.out.println(bmi);

	}

}
