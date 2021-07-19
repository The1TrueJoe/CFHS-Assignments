package Project2D;

public class runArray {

	public static void main(String[] args) {
		
		String[][] numbersString = {{"1", "54", "34"},
					  	   			{"4", "56", "65"},
					  	   			{"78", "67", "45"}};
		
		double[][] numbersDouble = {{1, 54, 34},
			  	   		   			{4, 56, 65},
			  	   		   			{78, 67, 45}};
		
		int[][] numbersInt = {{1, 54, 34},
			  	   		   	  {4, 56, 65},
			  	   		   	  {78, 67, 45}};
		
		printNames(numbersString);
		printMax(numbersDouble);
		printMin(numbersInt);
		findTarget(numbersInt, 67);
		
	}
	
	public static void printNames(String[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int x = 0; x < numbers[i].length; x++) {
				System.out.print(numbers[i][x] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void printMax(double[][] numbers) {
		double max = numbers[0][0];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int x = 0; x < numbers[i].length; x++) {
				if (numbers[i][x] > max) {
					max = numbers[i][x];
				}
			}
		}
		
		System.out.println("Max: " + max);
	}
	
	public static void printMin(int[][] numbers) {
		double min = numbers[0][0];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int x = 0; x < numbers[i].length; x++) {
				if (numbers[i][x] < min) {
					min = numbers[i][x];
				}
			}
		}
		
		System.out.println("Min: " + min);
	}

	public static void findTarget(int[][] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			for (int x = 0; x < numbers[i].length; x++) {
				if (numbers[i][x] == target) {
					System.out.println("Target " + target + " found at " + i + ", " + x);
				}
			}
		}
	}
}