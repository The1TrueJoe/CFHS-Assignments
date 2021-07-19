package Lunch;

import java.util.Scanner;

public class LunchTime {

	public static String minutesUntilLunch(int hours, int minutes) {
		int hr = Math.abs(12 - hours);
		int min = Math.abs(60 - minutes);
		
		String smin = min + "";
		
		if (min == 60) { min = 0; hr++; }
		if (min < 10) { smin = "0" + min; }
		
		return hr + ":" + smin + " Remaining"; 
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter current time");
		String time = keyboard.nextLine();
		
		int i = time.indexOf(':');
		
		System.out.println(minutesUntilLunch(Integer.parseInt(time.substring(0,i)), Integer.parseInt(time.substring(i+1))));
		
		keyboard.close();
		
	}
	
}
 
