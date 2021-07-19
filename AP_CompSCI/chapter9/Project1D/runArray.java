package Project1D;

public class runArray {

	public static int[] array, array2;
	
	public static void main(String[] args) {
		array = getArray(100);
		array2 = getArray(array.length);
		
		array[1] = 99;
		array2[1] = 55;
		
		String biggest = getBiggest();
		String smallest = getSmallest();
		
		System.out.println("Sum: " + getSum());
		System.out.println("Biggest: " + biggest.substring(biggest.indexOf(",") + 1, biggest.length())
						    + " Index: " + biggest.substring(0, biggest.indexOf(",")));
		System.out.println("Smallest: " + smallest.substring(smallest.indexOf(",") + 1, smallest.length())
			    			+ " Index: " + smallest.substring(0, smallest.indexOf(",")));
		System.out.println("Index of 99: " + findTarget(99));
		System.out.println("Compare: " + compare(array, array2));
		
		System.out.println("\nSwap Element 1: \nOriginal: " + array[1] + ", " + array2[1]);
		swap();
		System.out.print("New: " + array[1] + ", " + array2[1]);
	}
	
	public static int[] getArray(int n) {
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = i;
		}
		
		return array;
	}
	
	public static int getSum() {
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}
	
	public static String getBiggest() {
		int index = 0;
		int biggest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > biggest) {
				index = i;
				biggest = array[i];
			}
		}
		
		return index + "," + biggest;
	}
	
	public static String getSmallest() {
		int index = 0;
		int smallest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				index = i;
				smallest = array[i];
			}
		}
		
		return index + "," + smallest;
	}
	
	public static int findTarget(int x) {
		for (int i = 0; i < array.length; i++) {
			if (x == array[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static boolean compare(int[] array1, int[] array2) {
		boolean compare = false;
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[i]) {
				compare = true;
			} else {
				return false;
			}
		}
		
		return compare;
	}
	
	public static void swap() {
		int[] temp = array;
		array = array2;
		array2 = temp;
	}

}
