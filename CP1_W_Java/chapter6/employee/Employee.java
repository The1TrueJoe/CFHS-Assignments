package employee;

public class Employee {
	// Feilds
	private String name;
	private int idNumber;
	private String department;
	private String position;

	/**
	 * Constructor
	 * 
	 * @param nme
	 * @param id
	 * @param dpt
	 * @param pos
	 */
	public Employee(String nme, int id, String dpt, String pos) {
		name = nme;
		idNumber = id;
		department = dpt;
		position = pos;
	}
	
	/**
	 * Constructor
	 * 
	 * @param dpt
	 * @param pos
	 */
	
	public Employee(String dpt, String pos) {
		department = " ";
		position = " ";
	}
	
	/**
	 * Constructor
	 */
	
	public Employee() {
		name = " ";
		idNumber = 0;
		department = " ";
		position = " ";
	}
	
	/**
	 * Set name
	 * 
	 * @param nme
	 */
	
	public void setName(String nme) {
		name = nme;
	}
	
	/**
	 * Set ID
	 * 
	 * @param id
	 */
	
	public void setID(int id) {
		idNumber = id;
	}
	
	/**
	 * Set department
	 * 
	 * @param dpt
	 */
	
	public void setDPT(String dpt) {
		department = dpt;
	}
	
	/**
	 * Sets position
	 * 
	 * @param pos
	 */
	
	public void setPos(String pos) {
		position = pos;
	}
	
	/**
	 * Gets name
	 * 
	 * @return
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * Gets ID
	 * 
	 * @return
	 */
	
	public double getID() {
		return idNumber;
	}
	
	/**
	 * Gets department
	 * 
	 * @return
	 */
	
	public String getDPT() {
		return department;
	}
	
	/**
	 * get position
	 * 
	 * @return
	 */
	
	public String getPos() {
		return position;
	}
}