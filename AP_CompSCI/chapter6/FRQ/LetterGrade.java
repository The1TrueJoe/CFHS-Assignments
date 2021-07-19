package FRQ;

public class LetterGrade {

	public double average;
	
	public LetterGrade(double average) {
		this.average = average;
	}
	
	public String getLetter() {
		if(average < 0 || average > 100) {
			return "err";
		} else if (average >= 90 && average <= 99) {
			return "A";
		} else if (average >= 80 && average <= 89) {
			return "B";
		} else if (average >= 70 && average <= 79) {
			return "C";
		} else if (average >= 60 && average <= 69) {
			return "D";
		} else {
			return "F";
		}
	}
	
}
