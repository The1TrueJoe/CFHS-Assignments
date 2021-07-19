package Q11;

public class CutOut {

	public static void main(String[] args) {
		
		String str = "Hi-ho, hi-ho";
		System.out.println(cutOut(str, "-ho"));

	}

	public static String cutOut(String str, String rm) {
		return str.substring(0, str.indexOf(rm)) + ", " + str.substring(str.indexOf(rm) + str.indexOf(','), str.length());
	}
}
