package carpetCalculator;

import java.util.Scanner;

public class runCarpet {

	public static void main(String[] args) {
		final int COST = 8;
		
		Scanner keyboard = new Scanner(System.in);
		input input = new input(keyboard);
		
		RoomDimension dim = new RoomDimension(input.length(), input.width());
		RoomCarpet carpet = new RoomCarpet(dim, COST);
		
		System.out.println(carpet.toString());
	}

}
