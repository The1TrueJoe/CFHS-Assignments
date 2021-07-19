package quarterlySalesStats;

public class Sales {

	// Array
	public int[][] sales = new int[6][4];
	
	// Accessors and Mutators
	public void addNum(int div, int q, int amt) { sales[div][q] = amt; } 
	public int getDivSize() { return sales[1].length; }
	public int getQuarterSize() { return sales[2].length; }
	
	// List
	public String listFigures(int i) {
		// String
		String output = "";
		
		// Counter
		i--;
		
		// Add output
		for (int x = 0; x < sales[2].length; i++) {
			output += "Q" + x + ": " + sales[i][x];
		}
		
		// Return
		return output;
	}

	// SHow difference
	public int divisionDifference(int i, int q, int pq) {
		// Integer
		int difference;
		
		// Get difference
		difference = sales[i][pq] - sales[i][q];
		
		// Return
		return difference;
	}
	
	// Show company difference
	public int companyDifference(int q, int pq) {
		// Integers
		int difference,
			q1 = 0,
			q2 = 0;
		
		// Adds sales
		for (int x = 0; x < sales[2].length; x++) {
			q1 += sales[x][pq];
			q2 += sales[x][q];
		}
		
		// Calculates difference
		difference = q2 - q1;
		
		// Returns
		return difference;
	}
	
	// Shows total sales
	public int totalSales(int q) {
		// Integer
		int total = 0;
		
		// Add total
		for (int i = 0; i < sales[1].length; i++) {
			total += sales[i][q];
		}
		
		// Return
		return total;
	}
	
	// Get average
	public double avg(int i) {
		// Integer and Double
		int count = 0, total = 0;
		double avg;
		
		// Add total
		for (int x = 0; x < sales[1].length; x++) {
			total += sales[i][x];
			count++;
		}
		
		// Calculate average
		avg = total / count;
		
		// Return
		return avg;
	}
	
	public int highest(int i) {
		// Integer
		int highest = 0, 
			highestIndex = 0;
		
		// Add highest
		for (int x = 0; x < sales[2].length; x++) {
			if (sales[x][i] > highest) {
				// Get highest
				highest = sales[x][i];
				
				// Set index
				highestIndex = x;
			}
		}
		
		// Return 
		return highestIndex;
	}
	 
}
