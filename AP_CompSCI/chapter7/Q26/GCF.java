package Q26;

import java.util.Scanner;

public class GCF {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		int a = keyboard.nextInt();
		
		System.out.println("Enter Number 2: ");
		int b = keyboard.nextInt();
		keyboard.close();
		
		System.out.println("GCF: " + getGCF(a, b));

	}

	public static int getGCF(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		
		return a;
	}
}
