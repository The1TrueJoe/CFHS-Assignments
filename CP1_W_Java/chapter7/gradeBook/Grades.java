package gradeBook;

public class Grades {

	public int STUDENTS = 5;
	public int GRADES = 4;
	
	public String[] names = new String[STUDENTS];
	public String[] letter = new String[STUDENTS];
	public double[][] scores = new double[STUDENTS][GRADES];
	
	public void addGrades(int student, int col, double grade) { scores[student][col] = grade; }
	public void setName(int student, String name) { names[student] = name; }
	
	public double getGrade(int student, int col) { return scores[student][col]; }
	public String getLetter(int student) { return letter[student]; }
	public String getName(int student) { return names[student]; }
	public int getStudents() { return STUDENTS; }
	public int getGradesPer() { return GRADES; }
	
	
	public double getAvg(int student) {
		double total = 0, count = 0;
		
		for (int i = 0; i < scores[student].length; i++) {
			total += scores[student][i];
				
			count++;
		}
		
		return total / count;
	}
	
	public void convertToChar(int student) {
		double avg = getAvg(student);
		
		if (avg >= 90) {
			letter[student] = "A";
		} else if (avg >= 80 && avg <= 89) {
			letter[student] = "B";
		} else if (avg >= 70 && avg <= 79) {
			letter[student] = "C";
		} else if (avg >= 60 && avg <= 69) {
			letter[student] = "D";
		} else {
			letter[student] = "F";
		}
	}
	
	public void testIn() {
		int i = 0;
		
		setName(i, "Bill");
		for (int a = 0; a < GRADES; a++) {
			addGrades(i, a, 90);
		}
		
		i++;
		
		setName(i, "Bob");
		for (int a = 0; a < GRADES; a++) {
			addGrades(i, a, 80);
		}
		
		i++;
		
		setName(i, "Bi");
		for (int a = 0; a < GRADES; a++) {
			addGrades(i, a, 70);
		}
		
		i++;
		
		setName(i, "ill");
		for (int a = 0; a < GRADES; a++) {
			addGrades(i, a, 60);
		}
		
		i++;
		
		setName(i, "l");
		for (int a = 0; a < GRADES; a++) {
			addGrades(i, a, 50);
		}
		
	}
}
