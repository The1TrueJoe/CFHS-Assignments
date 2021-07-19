package phoneBook;

public class PhoneBookEntry {
	// Feilds
	private String name;
	private String phoneNumber;
	
	// Constructors
	public PhoneBookEntry(String nme, String num) { name = nme; phoneNumber = num; }
	public PhoneBookEntry() { name = null; phoneNumber = null; }
	
	// Get info
	public String getName() { return name; }
	public String getPhoneNumber() { return phoneNumber; }
	
	// Set info
	public void setName(String nme) { name = nme; }
	public void setPhoneNumber(String num) { phoneNumber = num; }
	
}