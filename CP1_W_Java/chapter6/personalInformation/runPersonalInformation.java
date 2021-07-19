/**
 * This program get information on a person
 * 
 * @author JosephTelaak
 * 
 * @date_edited 11/14/18
 * @date_created 11/15/18
 */

package personalInformation;

import javax.swing.JOptionPane;

public class runPersonalInformation {

	public static void main(String[] args) {
		// Person1
		PersonalInformation person1 = new PersonalInformation();
		
		// Sets
		person1.setName("Person A");
		person1.setAddress("246 MLK Dr");
		person1.setAge(31);
		person1.setPhoneNumber("999-999-9999");
		
		// Person 2
		PersonalInformation person2 = new PersonalInformation();
		
		// Sets
		person2.setName("Person B");
		person2.setAddress("123 Main Blvd");
		person2.setAge(12);
		person2.setPhoneNumber("888-888-8888");
		
		// Person 3
		PersonalInformation person3 = new PersonalInformation();

		// Sets 
		person3.setName("Person C");
		person3.setAddress("123 Main St");
		person3.setAge(21);
		person3.setPhoneNumber("777-777-7777");
		
		// Output
		JOptionPane.showMessageDialog(null, person1.getName() + ": \n" +
											" Address: " + person1.getAddress() + "\n" +
											" Age: " + person1.getAge() + "\n" +
											" Phone Number: " + person1.getPhoneNumber() + "\n" +
											"-----------------------------------" + "\n" +
											person2.getName() + ": \n" +
											" Address: " + person2.getAddress() + "\n" +
											" Age: " + person2.getAge() + "\n" +
											" Phone Number: " + person2.getPhoneNumber() + "\n" +
											"-----------------------------------" + "\n" +
											person3.getName() + ": \n" +
											" Address: " + person3.getAddress() + "\n" +
											" Age: " + person3.getAge() + "\n" +
											" Phone Number: " + person3.getPhoneNumber() + "\n" +
											"-----------------------------------");
	}

}
