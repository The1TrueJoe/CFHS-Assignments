package FRQ_11;

import java.util.ArrayList;

public class Names {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		String[] namesArray = {
				"Paul", "Paul", "David", "David",
				"Annie", "Bob", "Annie", "David",
				"David"
		};
		
		for (String name : namesArray) {
			names.add(name);
		}
		
		System.out.println("Names:");
		System.out.println(names);
		
		addThirdOccurence(names);
		
		System.out.println("Names(Modified): ");
		System.out.println(names);
	}
	
	public static void addThirdOccurence(ArrayList<String> names) {
		int size = names.size();
		
		for (int i = size-1; i > 0; i--) {
			if (names.get(i).equals(names.get(i-1))) {
				names.add(i, names.get(i));
			}
		}
	}
}
