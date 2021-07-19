package employee;

public class RandomDPT extends RandomGen {
	public String dpt;
	
	public String[] department = {
		"Engineering", "Software", "Utilities", "Technology", "Managment", "Human Resources", "Finance"
		};
	
	public String getDepartment() { dpt = department[select(department.length)]; return dpt; }
}
