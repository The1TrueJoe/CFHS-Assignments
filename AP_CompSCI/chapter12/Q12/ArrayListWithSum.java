package Q12;

public class ArrayListWithSum extends Q09.ArrayListV2<Integer> implements Q12.ListWithSum {

	private static final long serialVersionUID = 1L;

	public double sum() {
		double sum = 0;
		
		for (int i = 0; i < this.size(); i++) {
			sum += this.get(i);
		}
		
		return sum;
	}

	
	
}
