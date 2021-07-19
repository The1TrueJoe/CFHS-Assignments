package Q06;

public class Star {

	public static void main(String[] args) {
		
		printStars(5);
	}
	
	public static void printStars(int n) {
		if (n > 0) {
			printTriangle(n);
			printStars(n-1);
		} 
	}
	
	public static void printTriangle(int n) {
		if (n > 0) {
			System.out.print("*");
			printTriangle(n-1);
		} else {
			System.out.println();
		}
	}

}
