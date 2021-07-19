package Q05;

public abstract class Poem {

	public abstract int numLines();
	public abstract int getSyllables(int k);
	
	public void printRythm() {
		String out = "";
	
		for (int i = 0; i <= numLines() - 1; i++) {
			for (int x = 0; x < getSyllables(i); x++) {
				out += "ta-";
			}
			
			System.out.println("Line " + (i+1) + ": " + out.substring(0, out.length() - 1));
			out = "";
		}
	}
}
