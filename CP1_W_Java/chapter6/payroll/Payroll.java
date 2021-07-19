package payroll;

public class Payroll {

	private String name;
	private int IDnumber;
	private double payRate;
	private int hours;
	
	/**
	 * Constructor
	 * 
	 * @param nme
	 * @param ID
	 * @param pay
	 * @param hr
	 * @param gspay
	 */
	
	public Payroll(String nme, int ID, double pay, int hr, double gspay) {
		name = nme;
		IDnumber = ID;
		payRate = pay;
		hours = hr;
	}
	
	/**
	 * Constructor
	 */
	
	public Payroll() {
		name = "";
		IDnumber = 0;
		payRate = 0;
		hours = 0;
	}
	
	/**
	 * Sets name
	 * 
	 * @param nme
	 */
	
	public void setName(String nme) {
		name = nme;
	}
	
	/**
	 * Sets ID
	 * 
	 * @param ID
	 */
	
	public void setID(int ID) {
		IDnumber = ID;
	}
	
	/**
	 * Sets pay
	 * 
	 * @param pay
	 */
	
	public void setPay(double pay) {
		payRate = pay;
	}
	
	/**
	 * Sets hours
	 * 
	 * @param hr
	 */
	
	public void setHours(int hr) {
		hours = hr;
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
	
	public int getID() {
		return IDnumber;
	}
	
	/**
	 * Gets pay
	 * 
	 * @return
	 */
	
	public double getPay() {
		return payRate;
	}
	
	/**
	 * Gets hours
	 * 
	 * @return
	 */
	
	public int getHours() {
		return hours;
	}
	
	/**
	 * Gets gross pay
	 * 
	 * @return
	 */
	
	public double getGrossPay() {
		return payRate * hours;
	}
}
