package Q09;

import java.util.Random;

import Q06.Fraction;
import Q10.Rectangle;

public class testArrayListV2Old {

	public static void main(String[] args) {

		ArrayListV2<String> strings = new ArrayListV2<String>();
		ArrayListV2<Integer> ints = new ArrayListV2<Integer>();
		ArrayListV2<Fraction> fraction = new ArrayListV2<Fraction>();
		ArrayListV2<Rectangle> rectangle = new ArrayListV2<Rectangle>();
		
		strings.add("A");
		strings.add("B");
		strings.add("C");
		strings.add("D");
		strings.add("E");
		strings.add("F");
		strings.add("G");
		strings.add("H");
		
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			ints.add(rand.nextInt(25) + 1);
		}
		
		for (int i = 0; i < 5; i++) {
			fraction.add(new Fraction(rand.nextInt(9) + 1, rand.nextInt(9) + 1));
		}
		
		for (int i = 0; i < 2; i++) {
			rectangle.add(new Rectangle(rand.nextInt(9) + 1, rand.nextInt(9) + 1));
		}
		
		System.out.println("Strings:\t" + strings);
		System.out.println("Integers:\t" + ints);
		System.out.println("Fractions:\t" + fraction);
		System.out.println("Rectangles:\t" + rectangle);

	}

}
