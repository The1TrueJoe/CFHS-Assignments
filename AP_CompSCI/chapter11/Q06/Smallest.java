package Q06;

import java.util.ArrayList;
import java.util.Random;

public class Smallest {

	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();

		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			ints.add(rand.nextInt(100));
		}
		
		System.out.println("Before: " + ints);
		System.out.println("After:  " + removeSmallest(ints));
	}
	
	public static ArrayList<Integer> removeSmallest(ArrayList<Integer> ints) {
		Integer smallest = ints.get(0);
		int smallestIndex = 0;
		
		for (int i = 0; i < ints.size(); i++) {
			if (smallest.compareTo(ints.get(i)) > 0) {
				smallest = ints.get(i);
				smallestIndex = i;
			}
		}
		
		ints.remove(smallestIndex);
		
		return ints;
	}

}
