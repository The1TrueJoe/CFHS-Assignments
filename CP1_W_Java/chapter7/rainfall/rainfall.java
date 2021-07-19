/**
 * This program acceses stored rain data
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/4/18
 * @date_edited 12/6/18
 * 
 * @version 2
 */

package rainfall;

import javax.swing.JOptionPane;

public class rainfall {

	public static void main(String[] args) {
		// Ints and arrays
		final int MONTHS = 12;
		double[] rainfall = new double[MONTHS];
		
		// Get all values
		getValues(rainfall);
		
		// Object
		RainData year = new RainData(rainfall);
		
		// Output
		JOptionPane.showMessageDialog(null, String.format(
				"The total rainfall was %,.0f\n" + 
				"The average rainfall was %,.2f\n" +
				"The highest rainfall was %,.0f\n" +
				"The lowest rainfall was %,.0f\n",
				year.getTotal(), year.getAverage(), 
				year.getHighest(), year.getLowest()
				)
				);
		

	}
	
	/**
	 * Get all vaules
	 * 
	 * @param array
	 */
	
	private static void getValues(double[] array) {
		// String
		String input;
		
		for (int i = 0; i < array.length; i++) {
			// Input
			input = JOptionPane.showInputDialog("Enter rainfall for month " + (i + 1) + ".");
			array[i] = Double.parseDouble(input);
		}
	}

}
