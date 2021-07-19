/**
 * This program creates temperature table
 * 
 * @author JosephTelaak
 * 
 * 10/30/18
 */

package celsiusTemperatureTable;

public class celsiusTemperatureTable {

	public static void main(String[] args) {
		
		// Doubles
		double F = 0,
			   C = 0;
		
		// Print table
		for(; F <= 20; F++) {
			C = celcius(F, 0);										// Call method
			
			System.out.printf("%,.2f F is %,.2f C \n", F, C);		// Print table line
		}
	}

	/**
	 * @author JosephTelaak
	 * 
	 * @date_created 10/30/18
	 * @date_edited 10/31/18
	 * 
	 * @param F
	 * @param C
	 * @return
	 */
	
	public static double celcius(double F, double C) {
		// Calculations
		C = (5.0/9.0) * (F - 32);									// Convert
		
		// Return
		return C;													// Return
	}
	
}
