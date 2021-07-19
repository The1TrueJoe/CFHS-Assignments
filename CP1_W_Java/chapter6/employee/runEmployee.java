/**
 * This program gets and sets the information
 * 
 * @author JosephTelaak
 * 
 * @date_created 11/13/18
 * @date_edited 11/14/18
 */

package employee;

import javax.swing.JOptionPane;

public class runEmployee {

	public static void main(String[] args) {
		// String
		String output = "";
		
		// Person 1
		Employee person1 = new Employee();
		
		// Sets
		person1.setName("Susan Myers");
		person1.setID(47899);
		person1.setDPT("Accounting");
		person1.setPos("Vice President");
		
		// Person 2
		Employee person2 = new Employee();

		// Sets
		person2.setName("Mark Jones");
		person2.setID(39119);
		person2.setDPT("IT");
		person2.setPos("Programmer");
		
		// Person 3
		Employee person3 = new Employee();

		// Sets
		person3.setName("Joy Rogers");
		person3.setID(81774);
		person3.setDPT("Manufacturing");
		person3.setPos("Engineer");
		
		// Output format
		output += 		  ("Name | ID Number | Department | Positon \n");
		
		output += 		  ("\t" + person1.getName() + 
						   "\t  " + person1.getID() + 
						   "\t  " + person1.getDPT() + 
						   "\t  " + person1.getPos() + "\n");
		output += 		  ("\t" + person2.getName() + 
						   "\t  " + person2.getID() + 
						   "\t  " + person2.getDPT() + 
						   "\t  " + person2.getPos() + "\n");
		output += 		  ("\t" + person3.getName() + 
						   "\t  " + person3.getID() + 
						   "\t  " + person3.getDPT() + 
						   "\t  " + person3.getPos() + "\n");
		
		// Output
		JOptionPane.showMessageDialog(null, output);
	}

}
