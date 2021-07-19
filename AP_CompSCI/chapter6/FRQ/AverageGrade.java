package FRQ;

public class AverageGrade {

	public double g1, g2, g3;
	
	public AverageGrade(double g1, double g2, double g3) {
		this.g1 = g1;
		this.g2 = g2;
		this.g3 = g3;
	}
	
	public double getAverage() {
		return Math.round((g1 + g2 + g3) / 3);
	}
	
}
