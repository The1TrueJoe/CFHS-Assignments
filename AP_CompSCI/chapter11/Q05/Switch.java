package Q05;

import java.util.ArrayList;

public class Switch {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("A");
		strings.add("B");
		strings.add("C");
		strings.add("D");
		strings.add("E");
		strings.add("F");
		strings.add("G");
		strings.add("H");

		System.out.println(flip(strings));
	}
	
	public static ArrayList<String> flip(ArrayList<String> strings) {
		ArrayList<String> temp = new ArrayList<String>();
		
		for (int i = strings.size(); i > 0; i--) {
			temp.add(strings.get(i - 1));
		}
		
		return temp;
	}

}
