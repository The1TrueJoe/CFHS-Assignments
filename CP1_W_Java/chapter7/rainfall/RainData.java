/**
 * This program stores rain data
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/4/18
 * @date_edited 12/6/18
 * 
 * @version 2
 */

package rainfall;

public class RainData {

	// Fields
	private double[] rain;
	
	/** @param r*/
	
	public RainData(double[] r) {
		// Array
		rain = new double[r.length];
		
		// Equal
		for (int index = 0; index < r.length; index++) {
			rain[index] = r[index];
		}
	}
	
	/** @return total */
	
	public double getTotal() { 
		// Total
		double total = 0;
		
		// Add to total
		for (int index = 0; index < rain.length; index ++) {
			total += rain[index];
		}
		
		// Return total
		return total;
	}
	
	/** @return average*/
	
	public double getAverage() {
		// Return average
		return getTotal() / rain.length;
	}
	
	/** @return Highest */
	
	public double getHighest() {
		// Highest
		double highest = rain[0];
		
		// Set highest
		for (int index = 1; index < rain.length; index ++) {
			if (rain[index] > highest) {
				highest = rain[index];
			}
		}
		
		// Return highest
		return highest;
	}
	
	/** @return */
	
	public double getLowest() {
		// Lowest
		double lowest = rain[0];
		
		// Set lowest
		for (int index = 1; index < rain.length; index ++) {
			if (rain[index] < lowest) {
				lowest = rain[index];
			}
		}
		
		// Return lowest
		return lowest;
	}
}
