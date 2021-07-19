package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
	// ArrayList
	private ArrayList<EmployeeEntry> employeeList = new ArrayList<EmployeeEntry>();
	
	// Scanner
	private Scanner keyboard = new Scanner(System.in);
	
	// Constructors
	public EmployeeList() { }
	public EmployeeList(ArrayList<EmployeeEntry> entries) { employeeList = entries; }
	
	// Return entered size
	public int getEnteredSize() { return employeeList.size(); }
		
	// Get info
	public String getName(int x) { EmployeeEntry book = employeeList.get(x); return book.getName(); }
	public String getPhoneNumber(int x) { EmployeeEntry book = employeeList.get(x); return book.getPhoneNumber(); }
	public String getIDNumber(int x) { EmployeeEntry book = employeeList.get(x); return book.getID(); }
	public String getDepartment(int x) {EmployeeEntry book = employeeList.get(x); return book.getDepartment(); }
	public String getPosition(int x) {EmployeeEntry book = employeeList.get(x); return book.getPosition(); }
	
	public void search() {
		// String and char
		String output = "\tName: \t\t PhoneNumber: \t\t ID: \t\t Department: \t\t Position:"; 
		char letter;
		
		// Input
		System.out.println("\n\nEnter search letter (position)");
		letter = (keyboard.nextLine()).charAt(0);
		
		// Check if match
		for (int i = 0; i < employeeList.size(); i++) {
			if (getPosition(i).charAt(0) == letter) {
				output += ((i+1) + ". \t" + getName(i) + "   \t " + getPhoneNumber(i)
								 + "   \t " + getIDNumber(i) + "   \t " + getDepartment(i)
								 + "   \t " + getPosition(i));
			}
		}
		
		// Output
		System.out.println(output);
	}
} 
