/**
 * This program checks if a 3x3 grid is magic
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/20/18
 * @date_edited 1/8/19
 */


package loShuMagic;

public class runSquare {

	public static void main(String[] args) {
		// Integer array
		int square[][] = {{4, 9, 2},
					      {3 ,5, 7},
					      {8, 1, 5}};
		
		// Object
		MagicSquare LoShu = new MagicSquare(square);
		
		for (int row = 0; row < square.length; row++) {
			for (int col = 0; col < square[row].length; col++) {
				System.out.print(square[row][col] + " ");
			}
			
			System.out.println();
		}
		
		// Check
		if (LoShu.magic()) {
			// Output
			System.out.println("\nThe square is magic");
			
		} else {
			// Output
			System.out.println("\nThe square is not magic");
			
		}

	}

}
