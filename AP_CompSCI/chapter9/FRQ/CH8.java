package FRQ;

public class CH8 {

	public static void main(String[] args) {

		String str = "testing";
		String suffix = "s";
		
		System.out.println(endsWith(str, suffix));
		
	}
	
	public static boolean endsWith(String str, String suffix) {
		if (suffix.equals(" ")) {
			return true;
		} else if (suffix.length() > str.length()) {
			return false;
		} else if (str.substring(str.length() - suffix.length(), str.length()).equalsIgnoreCase(suffix)) {
			return true;
		} else {
			return false;
		}
	}

}
