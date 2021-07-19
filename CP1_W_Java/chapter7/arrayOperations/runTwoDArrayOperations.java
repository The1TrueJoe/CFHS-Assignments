/**
 * This program performs basic opperations on a 2D array
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/20/18
 * @date_edited 1/8/19
 */

package arrayOperations;

public class runTwoDArrayOperations {

	public static void main(String[] args) {
		// Array
		int[][] array = {{10,2,45,3},
			   			{8,2,55,6},
			   			{6,2,60,9},
			   			{4,2,70,12},
			   			{2,2,35,15},
			   			{0,2,100,18}};
		
		// Object
		TwoDArrayOperations opps = new TwoDArrayOperations(array);
		
		// Output
		System.out.println(
				"Size: " + opps.getSize() +
				"\nTotal: " + opps.getTotal() +
				"\nAverage: " + opps.getAverage() + 
				"\n\nRow Totals\n");
		
		// Output
		for (int i = 0; i < opps.getRowSize(); i++) {
			System.out.println("Row" + (i+1) + " = " + opps.getRowTotal(i));
		}
		
		// Output
		System.out.println("\nCol Totals\n");
		
		// Output
		for (int i = 0; i < opps.getColSize(); i++) {
			System.out.println("Col" + (i+1) + " = " + opps.getColTotal(i));
		}
		
		// Output
		System.out.println("\nRow Highest\n");
		
		for (int i = 0; i < opps.getRowSize(); i++) {
			System.out.println("The highest for row " + (i+1) + " is " + opps.getHighest(i));
		}
		
		// Output
		System.out.println("\nRow Lowest\n");
		
		for (int i = 0; i < opps.getRowSize(); i++) {
			System.out.println("The lowest for row " + (i+1) + " is " + opps.getLowest(i));
		}
	}

}

