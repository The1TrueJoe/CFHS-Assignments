package Q05;

public class Limerick extends Poem{

	public int numLines() { return 5; }

	public int getSyllables(int k) {
		int[] syllables = {9, 9, 6, 6, 9};
		
		return syllables[k];
	}
	
}
