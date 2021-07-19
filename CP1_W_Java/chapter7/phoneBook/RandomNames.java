package phoneBook;

import employee.RandomGen;

public class RandomNames extends RandomGen{
	// Array of names
	public String[] names = {
			"James", "David", "Chris", "George", "Ronald",
			"John", "Richard", "Daniel", "Kenneth",	"Anthony",
			"Robert", "Charles", "Paul", "Steven", "Kevin", 
			"Michael", "Joseph", "Mark", "Edward", "Jason", 
			"William", "Thomas", "Donald", "Brian", "Jeff"};
	
	// Array of last names
	public String[] lastName = {
			"Smith", "Johnson", "Williams", "Brown", "Jones",
			"Garcia", "Miller", "Davis", "Rodrig", "Martinez",
			"Paul", "Lopez", "Gonz.", "Wilson", "Anderson",
			"Thomas", "Taylor", "Moore", "Jackson", "Martin", 
			"Lee", "Perez", "Thomp.", "White", "Harris"};
	
	// Output names
	public String getName() { return names[select(names.length)]; }
	public String getLastName() { return lastName[select(lastName.length)]; }
}
