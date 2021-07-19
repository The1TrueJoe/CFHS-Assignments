package employee;

public class EmployeeEntry {
	// Feilds
	public String Name;
	public String PhoneNumber;
	public String ID;
	public String Department;
	public String Position;
	
	// Constructor
	public EmployeeEntry(String nme, String num, String id, String dpt, String pos) {
		Name = nme; PhoneNumber = num; ID = id; Department = dpt; Position = pos;
	}
	
	// Constructor
	public EmployeeEntry() {
		Name = null; PhoneNumber = null; ID = null; Department = null; Position = null;
	}
	
	// Gets
	public String getName() { return Name; }
	public String getPhoneNumber() { return PhoneNumber; }
	public String getID() { return ID; }
	public String getDepartment() { return Department; }
	public String getPosition() { return Position; }
	
	
}
