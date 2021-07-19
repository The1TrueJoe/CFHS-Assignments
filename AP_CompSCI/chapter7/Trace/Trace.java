package Trace;

public class Trace {

	public static void main(String[] args) {
		
		for (int i = 1;  i < 15; i = i + 3) {
			System.out.println(i);
		}
		
		System.out.println("\n\n");
		
		for (int i = 11;  i > -2; i = i -2) {
			System.out.println(i);
		}

		System.out.println("\n\n");
		
		for (int i = 20;  i < 40; i = i + 3) {
			System.out.println(i);
		}

		System.out.println("\n\n");
		
		for (int i = 30;  i > 0; i = i -4) {
			System.out.println(i);
		}
		
		System.out.println("\n\n");
		
		int total = 0;
		
		for(int i = 1; i < 15; i++) {
			total = total + i;
			System.out.println(total);
		}
		
		System.out.println(total);

	}

}
