package chapterResources;

public class BasicMathDouble {

	public double getAverage(double[] array) {
		return getTotalDouble(array) / array.length;
	}
	
	public double getTotalDouble(double[] array) { 
		double total = 0;
		
		for (int index = 0; index < array.length; index ++) {
			total += array[index];
		}
		
		return total;
	}
	
	public double getDiffDouble(double[] array, double[] array2) { 
		double dif = 0;
		
		for (int index = 0; (index < array.length) && (index < array2.length); index ++) {
			dif += (array[index] - array2[index]);
		}
		
		return dif;
	}
	
	public double getHighestDouble(double[] array) {
		double highest = array[0];
		
		for (int index = 1; index < array.length; index ++) {
			if (array[index] > highest) {
				highest = array[index];
			}
		}
		
		return highest;
	}
	
	public double getLowestDouble(double[] array) {
		double lowest = array[0];
		
		for (int index = 1; index < array.length; index ++) {
			if (array[index] < lowest) {
				lowest = array[index];
			}
		}
		
		return lowest;
	}
}
