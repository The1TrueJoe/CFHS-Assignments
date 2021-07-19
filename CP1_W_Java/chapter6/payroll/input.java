package payroll;

import java.util.Scanner;

public class input {

	private static Scanner keyboard = new Scanner(System.in);
	
	/**
	 * Gets name of employee 
	 * @return
	 */
	
	static String name() {
		String name;
		
		System.out.println("Enter name");
		name = keyboard.nextLine();
		
		return name;
	}
	
	/**
	 * Gets ID of employee
	 * @return
	 */
	
	static int IDname() {
		int ID;
		
		System.out.println("Enter ID");
		ID = keyboard.nextInt();
		
		return ID;
	}
	
	/**
	 * Gets pay rate
	 * @return
	 */
	
	static double payRate() {
		double payRate;
		
		System.out.println("Enter pay rate");
		payRate = keyboard.nextDouble();
		
		return payRate;
	}
	
	/**
	 * Gets hours
	 * @return
	 */
	
	static int hours() {
		int hours;
		
		System.out.println("Enter hours");
		hours = keyboard.nextInt();
		
		return hours;
	}
	
}
