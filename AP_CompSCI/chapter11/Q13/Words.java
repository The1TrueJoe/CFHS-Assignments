package Q13;

import java.util.ArrayList;

public class Words {
	
	public static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {
		ArrayList<String> nouns = new ArrayList<String>();
		
		for (int i = 0; i < words.length; i++) {
			nouns.add(words[i]);
		}
		
		ArrayList<ArrayList<String>> buckets = organize(nouns);
		System.out.println(buckets + "\n\n");
		
		for (int i = 0; i < letters.length(); i++) {
			System.out.println(letters.substring(i, i + 1).toUpperCase() + ":");
			System.out.println("  " + buckets.get(i));
		}

	}
	
	public static ArrayList<ArrayList<String>> organize(ArrayList<String> nouns) {
		ArrayList<ArrayList<String>> buckets = new ArrayList<ArrayList<String>>();
		ArrayList<String> list;
		
		for (int i = 0; i < letters.length(); i++) {
			list = new ArrayList<String>();
			
			for (int x = 0; x < nouns.size(); x++) {
				if (((nouns.get(x)).charAt(0) + "").equalsIgnoreCase(letters.charAt(i) + "")) {
					list.add(nouns.get(x));
				}
			}
			
			buckets.add(list);
		}
		
		return buckets;
	}
	
	public static String[] words = {
		"Apple", "Aligator", "Aloe Vera",
		"Burger", "Backpack", "Ball", "Basket", "Book", "Box", "Board",
		"Candy", "Cat", "Cookie", "Cake", "Coke", "Castle",
		"Dog", "Dinosaur", "Diaper", "Diablo",
		"Eraser", "Egg", "Electricty", "Energy",
		"Fence", "Face", "Factory", "Flag",
		"Goat", "Game",
		"House", "Hat", "Helicopter", "Hydrogen",
		"Iodine", "Ice", "Icicle",
		"Joey", "Jacket", "Jackal", "Jello", "Jalepeno",
		"Kit-Kat", "Kangaroo", "Keyboard",
		"Lawn", "Lion", "Loser", "Latern", "Log",
		"Money", "Monkey", "Mouse", "Monitor", "Monomial",
		"Noun", "Number",
		"Orange", "Octopus",
		"Pencil", "Projector", "Person", "Polynomial",
		"Queen", 
		"Robot",
		"Screen", "Speaker", "School",
		"Television", "Table", 
		"Ulcer", "Universe",
		"Vacation", "Video", "Venus", "Vessel",
		"Word", "Window", "War",
		"Xanthamide", "Xenomorph",
		"Yeast", 
		"Zoo"
	};

}
