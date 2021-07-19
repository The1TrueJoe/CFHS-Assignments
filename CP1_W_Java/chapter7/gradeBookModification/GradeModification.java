package gradeBookModification;

import gradeBook.Grades;

public class GradeModification extends Grades{

	public void dropLowest(int x) {
		double lowest = 0;
		int lowestIndex = 0;
		
		for (int i = 0; i < scores[2].length; i++) {
			if (scores[x][i] <= lowest) {
				lowest = scores[x][i];
				lowestIndex = i;
			}
		}
		
		scores[x][lowestIndex] = 999;
	}
	
	public double getAvg(int student) {
		double total = 0, count = 0;
		
		for (int i = 0; i < scores[student].length; i++) {
			if (scores[student][i] != 999) {
				total += scores[student][i];
				
				count++;
			}
		}
		
		return total / count;
	}
	
}
