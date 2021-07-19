/**
 * This class stores methods that are used to collect information
 * 
 * @author JosephTelaak
 *  
 * @date_edited 11/14/18
 * @date_created 11/13/18
 *    
 */

package employee;

import javax.swing.JOptionPane;

public class input {

	/**
	 * This method gets the name
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_edited 11/14/18
	 * @date_created 11/13/18
	 * 
	 * @return
	 */
	
	public static String name() {
		// String
		String name;
	
		// Input
		name = JOptionPane.showInputDialog("Enter name");

		// Return
		return name;
	}
	
	/**
	 * This method gets the ID
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_edited 11/14/18
	 * @date_created 11/13/18
	 * 
	 * @return
	 */
	
	public static int ID() {
		// Ints and strings
		int ID;
		String input;
		
		// Input
		input = JOptionPane.showInputDialog("Enter ID");
		ID = Integer.parseInt(input);

		// Return
		return ID;
	}
	
	/**
	 * This method gets the Department
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_edited 11/14/18
	 * @date_created 11/13/18
	 * 
	 * @return
	 */
	
	public static String department() {
		// String
		String department;
		
		// Input
		department = JOptionPane.showInputDialog("Enter department");
		
		// Return
		return department;
	}
	
	/**
	 * This method gets the position
	 * 
	 * @author JosephTelaak
	 * 
	 * @date_edited 11/14/18
	 * @date_created 11/13/18
	 * 
	 * @return
	 */
	
	public static String position() {
		// String
		String position;
		
		// Input
		position = JOptionPane.showInputDialog("Enter Position");
		
		// Return
		return position;
	}
	
}
