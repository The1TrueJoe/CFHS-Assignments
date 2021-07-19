package Q15;

public class Grade {

	public static String grade(int grade) {
		if (grade < 90) {
			if (grade < 80) {
				if (grade < 70) {
					if (grade < 60) {
						return "F";
					} else {
						return "D";
					}
				} else {
					return "C";
				}
			} else {
				return "B";
			}
		} else {
			return "A";
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(grade(99));

	}

}
