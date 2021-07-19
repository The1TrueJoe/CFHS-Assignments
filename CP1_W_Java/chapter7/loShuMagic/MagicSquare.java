/**
 * This program checks if a 3x3 grid is magic
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/20/18
 * @date_edited 1/8/19
 */


package loShuMagic;

public class MagicSquare {
	// Array
	public int square[][];
	
	// Constructor
	public MagicSquare(int[][] arr) {
		square = arr;
	}
	
	// If magic
	public boolean magic() {
		// Check
		if (colTrue() && rowTrue() && diagTrue()) {
			// Return
			return true;
			
		} else {
			// Return
			return false;
		}
	}
	
	// Check if diagonal true
	public boolean diagTrue() {
		// Set integers
		int diagA = (square[0][2] + square[1][1] + square[2][0]);
		int diagB = (square[0][0] + square[1][1] + square[2][2]);
		
		// Check if true
		if (diagA != diagB) {
			// Return
			return false;
		} else {
			// Return
			return true;
		}
	}
	
	// Check if col works
	public boolean colTrue() {
		// Check if works
		if (getColTotal(0) == getColTotal(1) && getColTotal(1) == getColTotal(2)) {
			// Return
			return true;
			
		} else {
			// Return
			return false;
		}
	}
	
	// Check if row works
	public boolean rowTrue() {
		// Check if works
		if (getRowTotal(0) == getRowTotal(1) && getRowTotal(1) == getRowTotal(2)) {
			// Return
			return true;
		} else {
			// Return
			return false;
		}
	}
	
	// Get col total
	public int getColTotal(int x) {
		// Integer
		int total = 0;
		
		// Total
		for (int i = 0; i < square[0].length; i++) {
			total += square[x][i];
		}
		
		// Return
		return total;
	}
	
	// Get col total
	public int getRowTotal(int x) {
		// Integer
		int total = 0;
		
		// Total
		for (int i = 0; i < square.length; i++) {
			total += square[i][x];
		}
		
		// Return
		return total;
	}
}