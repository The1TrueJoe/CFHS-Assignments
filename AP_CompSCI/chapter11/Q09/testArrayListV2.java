package Q09;

import java.util.Random;

import Q06.Fraction;
import Q10.Rectangle;

public class testArrayListV2 {

	public static void main(String[] args) {
		ArrayListV2<Object> list = new ArrayListV2<Object>();
		
		Random rand = new Random();
		
		list.add("A");
		list.add(rand.nextInt(25) + 1);
		list.add(new Fraction(rand.nextInt(9) + 1, rand.nextInt(9) + 1));
		list.add(new Rectangle(rand.nextInt(9) + 1, rand.nextInt(9) + 1));
		
		System.out.println(list);

	}

}
