package FRQ2015_2;


public class Range implements NumberGroup{

	private int[] range;
	private int max, min;
	
	public Range(int min, int max) {
		this.max = max;
		this.min = min;
		
		range = new int[(max-min)+1];
		
		fill();
	}
	
	private void fill() {
		int x = 0;
		
		for (int i = min - 1; i < max; i++) {
			range[x] = i + 1;
			x++;
		}
	}
	
	public boolean contains(int n) {
		for (int i = 0; i < range.length; i++) {
			if (n == range[i]) {
				return true;
			}
		}
		
		return false;
	}
	
}
