package Q05;

public class Haiku extends Poem{

	public int numLines() { return 3; }

	public int getSyllables(int k) {
		int[] syllables = {5, 7, 5};
		
		return syllables[k];
	}

}
