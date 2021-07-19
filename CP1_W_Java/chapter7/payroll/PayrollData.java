/**
 * This program stores payroll data
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/15/18
 * @date_edited 12/17/18
 * 
 * @version 1
 */

package payroll;

public class PayrollData {

	// Size
	public final int EMPLOYEES = 6;
	
	// Arrays
	public int[] ID = new int[EMPLOYEES];
	public int[] Hours = new int[EMPLOYEES];
	public double[] payRate = new double[EMPLOYEES];
	public double[] wages = new double[EMPLOYEES];
	
	// Sets
	
	/**
	 * 
	 * @param id
	 * @param index
	 */
	public void setID(int id, int index) { ID[index] = id; } 
	/**
	 * 
	 * @param hour
	 * @param index
	 */
	public void setHours(int hour, int index) { Hours[index] = hour; }
	/**
	 * 
	 * @param rate
	 * @param index
	 */
	public void setPayRate(double rate, int index) { payRate[index] = rate; }
	/**
	 * 
	 * @param index
	 */
	public void setWages(int index) { wages[index] = Hours[index] * payRate[index]; }
	
	// Gets
	
	/**
	 * 
	 * @return
	 */
	public int getEmployees() { return EMPLOYEES; }
	/**
	 * 
	 * @param index
	 * @return
	 */
	public int getID(int index) { return ID[index]; }
	/**
	 * 
	 * @param index
	 * @return
	 */
	public int getHours(int index) { return Hours[index]; }
	/**
	 * 
	 * @param index
	 * @return
	 */
	public double getPayRate(int index) { return payRate[index]; }
	/**
	 * 
	 * @param index
	 * @return
	 */
	public double getWages(int index) { return wages[index]; }
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public double getPayForID(int id) { 
		int x = 0;
		for (int i = 0; i < EMPLOYEES; i++) {
			if (ID[i] == id) {
				x = i;
				break;
			} 
		}
		
		return payRate[x];
		
	}
}
