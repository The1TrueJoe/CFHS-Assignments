package Q09;

import java.util.Scanner;

public class Pythagorean {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter M: ");
		int m = keyboard.nextInt();
		
		System.out.println("Enter N: ");
		int n = keyboard.nextInt();
		keyboard.close();
		
		int[] triple = makePythagorean(m, n);
		
		System.out.println(triple[0] + "^2 + " + triple[1] + "^2 = " + triple[2] + "^2");
	}
	
	public static int[] makePythagorean(int m, int n) {
		if (m < n) {
			int temp = n;
			n = m;
			m = temp;
		}
		
		double a = Math.pow(m, 2) - Math.pow(n, 2);
		double b = 2 * m * n;
		double c = Math.pow(m, 2) + Math.pow(n, 2);
		
		int triple[] = {(int)a, (int)b, (int)c};
		
		return triple;
	}

}
