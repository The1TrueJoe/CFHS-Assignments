package Q13;

public class LeapYear {
	
	public static boolean isLeapYear(int year) {
			if (year % 4 == 0 && year % 100 != 0) {
				return true;
			} else {
				return false;
			}
	}

	public static void main(String[] args) {
		if (isLeapYear(2004)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
