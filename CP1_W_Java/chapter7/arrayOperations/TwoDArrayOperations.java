/**
 * This program performs basic opperations on a 2D array
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/20/18
 * @date_edited 1/8/19
 */


package arrayOperations;

public class TwoDArrayOperations{
	
	// Array
	public int[][] testArray;
	
	// Feild
	public int total = 0;
	
	public final int row = 6;
	public final int col = 4;
	public final int size = row * col;
	
	// Constructor
	public TwoDArrayOperations(int[][] i) {		
		testArray = i;
	}
	
	// Gets size
	public int getSize() {
		// Return
		return size;
	}
	
	// Get row size
	public int getRowSize() {
		return row;
	}
	
	// Get col size
	public int getColSize() {
		return col;
	}
	
	public int getTotal() {	
		// Total
		for (int x = 0; x < row; x++) {
			for (int i = 0; i < col; i++) {
				total += testArray[x][i];
			}
		}
		
		// Return
		return total;
	}
	
	public double getAverage() {
		return total / size;
	}
	
	// Get row total
	public int getRowTotal(int i) { 
		// Integer
		int total = 0;
		
		// Total
		for (int x = 0; x < col; x++) {
			total += testArray[i][x];
		}
		
		// Return
		return total;
	}
	
	public int getColTotal(int i) { 
		// Integer
		int total = 0;
		
		// Total
		for (int x = 0; x < row; x++) {
			total += testArray[x][i];
		}
		
		// Return
		return total;
	}
	
	// Get highest
	public int getHighest(int x) {
		// Integer
		int highest = 0;
		
		// Highest
		for (int i = 0; i < col; i++) {
			if (highest < testArray[x][i]) {
				highest = testArray[x][i];
			}
		}
		
		// Return
		return highest;
	}
	
	public int getLowest(int x) {
		// Integer
		int lowest = testArray[x][0];
		
		// Lowest
		for (int i = 0; i < col; i++) {
			if (lowest > testArray[x][i]) {
				lowest = testArray[x][i];
			}
		}

		
		// Return
		return lowest;
	}
}
