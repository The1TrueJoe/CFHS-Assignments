package FRQ2018_3;

public class CodeWordChecker implements StringChecker {
	
	private int minBound;
	private int maxBound;
	private String excluded;
	
	public CodeWordChecker(int minBound, int maxBound, String excluded) {
		this.minBound = minBound;
		this.maxBound = maxBound;
		this.excluded = excluded;
	}
	
	public CodeWordChecker(String excluded) {
		minBound = 6;
		maxBound = 20;
		this.excluded = excluded;
	}
	
	public boolean isValid(String str) {
		if (str.length() < minBound || str.length() > maxBound) {
			return false;
		} else {
			if (str.contains(excluded)) {
				return false;
			} else {
				return true;
			}
		}
	}
	
// Main provided for testing.

  public static void main(String[] args) {
    StringChecker sc1 = new CodeWordChecker(5, 8, "$");
    String[] sc1Strings = {"happy", "happy$", "Code", "happyCode"};
    for (String str : sc1Strings)
      System.out.println(str + "\t\t" + sc1.isValid(str));

    StringChecker sc2 = new CodeWordChecker("pass");
    String[] sc2Strings = {"MyPass", "Mypassport", "happy", "1,000,000,000,000,000"};
    for (String str : sc2Strings)
      System.out.println(str + "\t" + sc2.isValid(str));
  }

}
