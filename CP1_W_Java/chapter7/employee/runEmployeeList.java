package employee;

import java.util.ArrayList;

import phoneBook.RandomNames;
import phoneBook.RandomNumbers;

public class runEmployeeList {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<EmployeeEntry> employeeList = new ArrayList<EmployeeEntry>();
		
		// Random Objects
		RandomNames name = new RandomNames();
		RandomNumbers num = new RandomNumbers();
		RandomID id = new RandomID();
		RandomDPT dpt = new RandomDPT();
		RandomPOS pos = new RandomPOS();
		
		// Add
		for (int i = 0; i < 1000; i++) {
			String dept = dpt.getDepartment();
			employeeList.add(i, new EmployeeEntry(name.getName() + " " + name.getLastName(), num.getNumber(),
												  id.getID(5), dept, pos.getPos(dept)));
		}
		
		// Phonebook object
		EmployeeList list = new EmployeeList(employeeList);
		
		// Create header
		System.out.println("\tName:\t\t\tPhoneNumber:\tID:\tDepartment:\t\tPosition:");
				
		// Output
		for (int i = 0; i < list.getEnteredSize(); i++) {
			System.out.println((i+1) + "\t" + list.getName(i) + "\t\t" + list.getPhoneNumber(i)
					 + "\t" + list.getIDNumber(i) + "\t" + list.getDepartment(i)
					 + "\t\t " + list.getPosition(i));
		}
				
		// Search
		list.search();

	}

}
