package arrayOperations;

public class ArrayOperations {

	public int[] testArray;
	public int size = 0;
	
	public ArrayOperations(int[] i) {
		getSize(i);
		
		testArray = new int[size];
		
		for (int x = 0; x < testArray.length; x++) {
			testArray[x] = i[x];
		}
	}
	
	public ArrayOperations() {
		
	}
	
	public void getSize(int[] i) {
		for (int x = 0; x < i.length; x++) {
			size++;
		}
		
	}
	
	public int getTotal() {
		int total = 0;
		
		for (int i = 0; i < testArray.length; i++) {
			total += testArray[i];
		}
		
		return total;
	}
	
	public double getAverage() {
		int total = 0, count = 0;
		
		for (int i = 0; i < testArray.length; i++) {
			total += testArray[i];
			count++;
		}
		
		return total / count;
	}
	
	public int getHighest() {
		int highest = 0;
		
		for (int i = 0; i < testArray.length; i++) {
			if (highest < testArray[i]) {
				highest = testArray[i];
			}
		}
		
		return highest;
	}
	
	public int getLowest() {
		int lowest = 10*100000;
		
		for (int i = 0; i < testArray.length; i++) {
			if (lowest > testArray[i]) {
				lowest = testArray[i];
			}
		}
		
		return lowest;
	}
	
}
