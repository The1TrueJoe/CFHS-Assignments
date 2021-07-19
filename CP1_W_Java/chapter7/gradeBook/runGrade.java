package gradeBook;

import javax.swing.JOptionPane;

public class runGrade {

	public static void main(String[] args) {
		Grades grade = new Grades();

		String output = "";
		
		final int STUDENTS = grade.getStudents();
		final int GRADES = grade.getGradesPer();
		
		for (int i = 0; i < STUDENTS; i++) {
			grade.setName(i, input.name());
			
			for (int a = 0; a < GRADES; a++) {
				grade.addGrades(i, a, input.grade(a, grade.getName(i)));
			}
		}
		
		for (int i = 0; i < STUDENTS; i++) {
			grade.convertToChar(i);
			
			output += grade.getName(i) + " Avg: " + grade.getAvg(i) + " Letter: " + grade.getLetter(i) + "\n";
		}
		
		JOptionPane.showMessageDialog(null, output);
		
	}

}
