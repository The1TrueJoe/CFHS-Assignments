/**
 * This program checks stored data to see if the number is larger
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/8/18
 * @date_edited 12/11/18
 * 
 * @version 2
 */

package largerThanN;

import java.util.Scanner;
import java.util.ArrayList;

public class Larger {
	
	// Arraylist
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	// Feild
	public int largest;
	
	/**
	 * Add number to list
	 * @param num
	 */
	public void addNum(int num) { list.add(num); }
	/**
	 * Gets largest
	 * @return largest
	 */
	public int getLargestNum() { return largest; }
	
	/**
	 * Returns all larger numbers
	 * 
	 * @param num
	 * @return output
	 */
	public String getAllLarger(int num) {
		// String
		String output = "";
		
		// get values
		for (int i = 0; i < list.size(); i++) {
			if (num < list.get(i)) {
				output += list.get(i) + "\n";
			}
		}
		
		// Return
		return output;
	}
	
	/**
	 * Gets all of the largest
	 * 
	 * @return highest
	 */
	public String getLargest() {
		// Int
		int highest = list.get(0);
		
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > highest) {
				highest = list.get(i);
			}
		}
		largest = highest;
		return "The highest is: " + highest;
	}
	
	public void getValues(int[] array) {
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		
		for (int i = 0; i < list.size(); i++) {
			// Input
			System.out.println("Enter a new value");
			num = keyboard.nextInt();
		}
		
		list.add(num);
		
		keyboard.close();
	}
}
