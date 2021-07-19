package quarterlySalesStats;

public class output {

	public String output;
	
	public String getOutput() { return output; }
	
	public output(int Quarter, int Division, Sales sale) {
		output = ("\n\nHighest: \n");
		
		for (int x = 0; x < Division; x++) {
			output += ("Highest quarter in division " + (x+1) + " is Q" + (sale.highest(x)+1) + "\n");
		}
		
		output += ("\nAverage: \n");
		
		for (int x = 0; x < Division; x++) {
			output += ("Average sales in division " + (x+1) + " is " + sale.avg(x) + "\n");
		}
		
		output += ("\nTotal: \n");
		
		for (int x = 0; x < Quarter; x++) {
			output += ("Total sales in Quarter " + (x+1) + " is " + sale.totalSales(x) + "\n");
		}
		
		output += ("\nDifference: \n");
		
		
		for (int x = 0; x < Division; x++) {
			for (int a = 1; a < Quarter; a++) {
				output += ("Division " + (x+1) + " Quarter " + (a+1) + " vs. Quarter " + a + ": " + sale.divisionDifference(x, a, a-1) + "\n"); 
			}
		}
		
		output += ("\nCompany Difference: \n");
		
		for (int a = 1; a < Quarter; a++) {
			output += ("Quarter " + (a+1) + "  vs. Quarter " + a + ": " + sale.companyDifference(a, a-1) + "\n");
		}
		
	}
	
}
