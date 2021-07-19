package Sec7;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		String[] dictionary = new String[25];
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter word");
		
		for (int i = 0; i < dictionary.length; i++) {
			dictionary[i] = keyboard.nextLine();
		}
		
		System.out.println("Enter new word: ");
		String word = keyboard.nextLine();
		
		System.out.println("Enter " + word + "'s index: ");
		int index = keyboard.nextInt();
		keyboard.close();
		
		dictionary = add(dictionary, word, index);
		
		for (int i = 0; i < dictionary.length; i++) {
			System.out.println(dictionary[i]);
		}
		
	}
	
	public static String[] add(String[] dictionary, String word, int index) {
		String[] temp = new String[dictionary.length];
		
		for (int i = 0; i < dictionary.length; i++) {
			if (index == i) {
				temp[i] = word;
				temp[i + 1] = dictionary[i];
				i++;
			} else {
				temp[i] = dictionary[i];
			}
		}
		
		return temp;
	}

}