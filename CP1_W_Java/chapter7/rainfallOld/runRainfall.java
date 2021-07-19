package rainfallOld;



public class runRainfall {

	public static void main(String[] args) {
		
		Rainfall rain = new Rainfall();

		for (int i = 0; i < (rain.getMonths() - 1); i++ ) {
			rain.addRain(input.rain());
		}
		
		for (int i = 0; i < rain.getMonths(); i++ ) {
			System.out.println("Rain for " + rain.getMonthName(i) + ": " + rain.getRain(i));
		}
		
		System.out.println("Month with most: " + rain.getMonthMost());
		System.out.println("Month with least: " + rain.getMonthLeast());

	}

}
