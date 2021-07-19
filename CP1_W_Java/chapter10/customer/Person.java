package customer;

public class Person {

	public String name;
	public String address;
	public String phoneNumber;
	
	public Person(String nme, String add, String num) {
		name = nme;
		address = add;
		phoneNumber = num;
		
	}
	
	public Person() {
		name = null;
		address = null;
		phoneNumber = null;
	}
	
	public void setName(String nme) { name = nme; }
	public void setAddress(String add) { address = add; }
	public void setPhoneNumber(String num) { phoneNumber = num; } 
	
	public String getName() { return name; }
	public String getAddress() { return address; }
	public String getNumber() { return phoneNumber; }
}
