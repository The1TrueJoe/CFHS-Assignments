package FRQ;

public class GradeReport {

	public static void main(String[] args) {

		AverageGrade grade = new AverageGrade(100, 80, 60);
		LetterGrade letter = new LetterGrade(grade.getAverage());
		
		System.out.println(letter.getLetter() + ": " + grade.getAverage() + "%");

	}

}
