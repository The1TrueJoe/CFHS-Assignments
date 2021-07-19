package Q01;

public class Multiplier {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		System.out.println(a + " * " + b + " = " + multiply(a, b));
		

	}
	
	public static int multiply(int a, int b) {
		if (a == 0) {
			return 0;
		} else {
			return multiply(a - 1, b) + b;
		}
	}

}
