package Q11;

public class Bool {

	public static boolean eval(int a, int b, int c) {
		if (a != 0 && b != 0 && c != 0) {
			if ((double)a/b == (double)b/c) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int a = 1, b = 2, c = 8;
		
		if (eval(a, b, c)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
}
