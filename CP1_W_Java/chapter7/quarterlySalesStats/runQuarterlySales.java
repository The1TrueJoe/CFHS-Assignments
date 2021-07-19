package quarterlySalesStats;

public class runQuarterlySales {

	public static void main(String[] args) {
		// Object
		Sales sale = new Sales();
		
		// Values
		final int Division = sale.getDivSize();
		final int Quarter = sale.getQuarterSize();
		
		// Add number
		for (int x = 0; x < Division; x++) {
			for (int a = 0; a < Quarter; a++) {
				// Add number
				sale.addNum(x, a, input.testIn());}
		}
		
		// Output
		output out = new output(Quarter, Division, sale);
		
		// Output
		System.out.println(out.getOutput());
		
	}

}
