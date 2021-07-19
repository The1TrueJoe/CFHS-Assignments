package Q10;

import java.util.ArrayList;

public class Filter {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			list.add(RandLetters.getLetter());
		}
		
		System.out.println("List:\t\t" + list);
		
		System.out.println("Filtered:\t" + removeDuplicates(list));
		
	}
	
	public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
		for (int i = list.size() - 1; i > 0; i--) {
			if (list.get(i).equals(list.get(i - 1))) {
				list.remove(list.get(i - 1));
			}
		}
		
		return list;
	}

}
