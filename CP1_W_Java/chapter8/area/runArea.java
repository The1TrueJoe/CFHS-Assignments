package area;

import java.util.Scanner;

public class runArea {

	public static void main(String[] args) {
		Area area = new Area();
		Scanner keyboard = new Scanner(System.in);
		
		int num,
		    num2,
		    option;
		
		System.out.println(
				"Pick Option Below\n" +
				"1) Circle\n" +
				"2) Rectangle\n" +
				"3) Cylinder"
				);
		option = keyboard.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Enter Radius");
			num = keyboard.nextInt();
			
			System.out.println(area.area(num));
			break;
		case 2:
			System.out.println("Enter Length");
			num = keyboard.nextInt();
			
			System.out.println("Enter Width");
			num2 = keyboard.nextInt();
			
			System.out.println(area.area(num, num2));
			break;
		case 3: 
			System.out.println("Enter Radius");
			num = keyboard.nextInt();
			
			System.out.println("Enter Height");
			num2 = keyboard.nextInt();
			
			System.out.println(area.area(num, num2, 0));
			break;
		}
		
		keyboard.close();
	}

}
