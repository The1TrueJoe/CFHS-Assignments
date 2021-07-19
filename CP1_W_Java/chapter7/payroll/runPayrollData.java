/**
 * This program accesses stored payroll data
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/15/18
 * @date_edited 12/17/18
 * 
 * @version 1
 */

package payroll;

import javax.swing.JOptionPane;

public class runPayrollData {

	public static void main(String[] args) {
		// Strings and ints
		String output;
		int cont;
		
		// Object
		PayrollData pay =  new PayrollData();
		
		// Final
		final int EMPLOYEES = pay.getEmployees();

		// Input
		for (int i = 0; i < EMPLOYEES; i++) {
			pay.setID(inputPay.ID(null, null), i);
			pay.setHours(inputPay.hours(pay.getID(i)), i);
			pay.setPayRate(inputPay.payRate(pay.getID(i)), i);
			pay.setWages(i);
		}
		
		// Output
		output = "ID | Hours | Pay Rate\n";
		
		// Output
		for (int i = 0; i < EMPLOYEES; i++) { 
			output += ( pay.getID(i) + "        " + pay.getHours(i) + "            " + pay.getPayRate(i) + "\n");
		}
		
		// Output
		JOptionPane.showMessageDialog(null, output);
		
		
		
		do {
			int ID = inputPay.ID(output, " to check pay ");
			
			JOptionPane.showMessageDialog(null, "The wages for " + ID + "are $" + pay.getWages(ID));
			
			cont = JOptionPane.showConfirmDialog(null, "Would you like to access another ID");
		} while (cont == 2);
		
	}

}
