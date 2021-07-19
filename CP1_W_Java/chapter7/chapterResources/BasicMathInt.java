package chapterResources;

public class BasicMathInt {
	
	public double getAverage(int[] array) {
		return getTotalInt(array) / array.length;
	}

	public double getTotalInt(int[] array) { 
		int total = 0;
		
		for (int index = 0; index < array.length; index ++) {
			total += array[index];
		}
		
		return total;
	}
	
	public double getDiffInt(int[] array, int[] array2) { 
		int dif = 0;
		
		for (int index = 0; (index < array.length) && (index < array2.length); index ++) {
			dif += (array[index] - array2[index]);
		}
		
		return dif;
	}
	
	public double getHighestInt(int[] array) {
		int highest = array[0];
		
		for (int index = 1; index < array.length; index ++) {
			if (array[index] > highest) {
				highest = array[index];
			}
		}
		
		return highest;
	}
	
	public double getLowestInt(int[] array) {
		int lowest = array[0];
		
		for (int index = 1; index < array.length; index ++) {
			if (array[index] < lowest) {
				lowest = array[index];
			}
		}
		
		return lowest;
	}
}
