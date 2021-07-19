package phoneBook;

import java.util.ArrayList;

public class runPhoneBook {

	public static void main(String[] args) {
		// Arraylist
		ArrayList<PhoneBookEntry> entries = new ArrayList<PhoneBookEntry>();
		
		// Random Objects
		RandomNames name = new RandomNames();
		RandomNumbers num = new RandomNumbers();
		
		// Other methods
		entries.add(new PhoneBookEntry (name.getName() + " " + name.getLastName(), num.getNumber()));
		entries.remove(0);
		
		// Adds numbers
		for (int i = 0; i < 10; i++) {
			entries.add(i, new PhoneBookEntry (name.getName() + " " + name.getLastName(), num.getNumber()));
		}
		
		
		// Phonebook object
		PhoneBook phoneBook = new PhoneBook(entries);

		// Create header
		System.out.println("\tName:\t\t\tPhone Number:\n");
		
		// Output
		for (int i = 0; i < phoneBook.getEnteredSize(); i++) {
			System.out.println((i+1) + ". \t" + phoneBook.getName(i) + "\t\t" + phoneBook.getPhoneNumber(i));
		}
		
		// Search
		phoneBook.search();
	}

}
