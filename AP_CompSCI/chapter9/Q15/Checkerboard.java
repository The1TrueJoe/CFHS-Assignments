package Q15;

import java.awt.Color;

public class Checkerboard {

	public static void main(String[] args) {		
		Color[][]board = new Color[3][4];
		fillCheckerboard(board);
		
	}

	public static void fillCheckerboard(Color[][] board) {
		board[0][0] = Color.WHITE;
		for (int i = 0; i < board.length; i++) {
			for (int x = 0; x < board[i].length; x++) {
				if ((i + x) % 2 == 0) {
					board[i][x] = Color.BLACK;
				} else if ((i + x) % 2 != 0) {
					board[i][x] = Color.WHITE;
				}
			} 
		}
		for (int i = 0; i < board.length; i++) {
			for (int x = 0; x < board[i].length; x++) {
				if (board[i][x] == Color.BLACK) {
					System.out.print("x ");
				} else if (board[i][x] == Color.WHITE) {
					System.out.print("o ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println(" ");
		}
		
	}
}