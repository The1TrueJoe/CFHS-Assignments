package phoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
	// Arraylist
	private ArrayList<PhoneBookEntry> phoneBook = new ArrayList<PhoneBookEntry>();
	
	// Scanner
	private Scanner keyboard = new Scanner(System.in);
	
	// Random Objects
	private RandomNames name;
	private RandomNumbers num;
	
	// Constructors
	public PhoneBook() { }
	public PhoneBook(RandomNames nme, RandomNumbers number) { name = nme; num = number; }
	public PhoneBook(ArrayList<PhoneBookEntry> entries) { phoneBook = entries; }
	
	// Adds info
	public void addInfo(int x, PhoneBookEntry book) { phoneBook.add(x, book); }
	public void addInfo(int x, String name, String phoneNumber) { phoneBook.add(x, new PhoneBookEntry (name, phoneNumber));}
	public void addInfo(int x) { phoneBook.add(x, new PhoneBookEntry (name.getName(), num.getNumber())); }
	
	// Return entered size
	public int getEnteredSize() { return phoneBook.size(); }
	
	// Get info
	public String getName(int x) { PhoneBookEntry book = phoneBook.get(x); return book.getName(); }
	public String getPhoneNumber(int x) { PhoneBookEntry book = phoneBook.get(x); return book.getPhoneNumber(); }
	
	// Search
	public void search() {
		// String and char
		String output = "\tName: \t\t Phone Number:\n"; 
		char letter;
		
		// Input
		System.out.println("\n\nEnter search letter");
		letter = (keyboard.nextLine()).charAt(0);
		
		// Check if match
		for (int i = 0; i < phoneBook.size(); i++) {
			if (getName(i).charAt(0) == letter) {
				output += ((i+1) + ". \t" + getName(i) + "   \t " + getPhoneNumber(i) + "\n");
			}
		}
		
		// Output
		System.out.println(output);
	}
}
