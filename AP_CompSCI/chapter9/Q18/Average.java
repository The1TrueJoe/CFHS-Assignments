package Q18;

public class Average {

	public static void main(String[] args) {
		
		int[] scores = {
				89, 63, 100, 98, 95, 101,
				90, 98, 97, 95, 93, 93, 78,
				89, 89, 86, 85, 84, 98, 64
		};
		
		System.out.println("Average: " + getAverage(scores) + ", Length: " + scores.length);
		
		int[][] sumsScore = {
				{89, 63, 100, 98, 95, 101},
				{90, 98, 97, 95, 93, 93, 78},
				{89, 89, 86, 85, 84, 98, 64}
		};
		
		int[] sums = getSums(sumsScore);
		
		for (int i = 0; i < sums.length; i++) {
			System.out.println("Row " + (i+1) + ")   Sum: " + sums[i]);
		}
		
	}
	
	public static double getAverage(int[] scores) {
		int total = 0;
		
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		
		return total / scores.length;
	}
	
	public static int[] getSums(int[][] scores) {
		int[] sums = new int[scores.length];
		
		for (int i = 0; i < scores.length; i++) {
			for (int x = 0; x < scores[i].length; x++) {
				sums[i] += scores[i][x];
			}
			
		}
		
		return sums;
		
	}

}
