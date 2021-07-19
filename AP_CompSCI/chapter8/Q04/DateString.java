package Q04;

import java.util.Scanner;

public class DateString {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter date");
		String str = keyboard.nextLine();
		keyboard.close();
		
		System.out.println(dateStr(str));
	}
	
	public static String dateStr(String str) {
		if (!(str.charAt(0) + "").equals("0")) {
			if ((str.charAt(1) + "").equals("/") || (str.charAt(1) + "").equals("-")) {
				str = "0" + str;
			} 	
		}
		
		if (!(str.charAt(3) + "").equals("0")) {
			if ((str.charAt(4) + "").equals("/") || (str.charAt(4) + "").equals("-")) {
				str = str.substring(0, 3) + "0" + str.substring(3, str.length());
			} 
		}
		
		str = str.substring(3, 6) + str.substring(0, 3) + str.substring(6, str.length());
		
		return str.replace('/', '-');
	}
	
}
