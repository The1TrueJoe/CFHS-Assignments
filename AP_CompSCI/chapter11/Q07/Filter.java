package Q07;

import java.util.ArrayList;
import java.util.Random;

public class Filter {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			list1.add(rand.nextInt(10) + 1);
		}
		
		for (int i = 0; i < 5; i++) {
			list2.add(rand.nextInt(10) + 1);
		}
		
		System.out.println("List 1:   " + list1);
		System.out.println("List 2:   " + list2);
		
		System.out.println("Filtered: " + removeDuplicates(list1, list2));

	}
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for (int i = 0; i < list1.size(); i++) {
			for (int x = 0; x < list2.size(); x++) {
				if (list1.get(i) == list2.get(x)) {
					list1.remove(i);
				}
			}
		}
		
		return list1;
	}

}
