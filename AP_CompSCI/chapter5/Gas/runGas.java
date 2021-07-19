package Gas;

import java.util.Scanner;

public class runGas {

	public static void main(String[] args) {
		
		Gas gas = new Gas();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter miles");
		gas.setMiles(input.nextInt());
		
		System.out.println("Enter gallons");
		gas.setGall(input.nextDouble());
		
		input.close();
		
		System.out.println(gas);

	}

}
