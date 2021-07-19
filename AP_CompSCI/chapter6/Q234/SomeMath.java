package Q234;

public class SomeMath {

	public static int max(int x, int y) {
		if (x > y) {
			return x;
		} else if (y > x) {
			return y;
		} else {
			return x;
		}
	}
	
	public static int max(int x, int y, int z) {
		if (x > y) {
			if (z > x) {
				return z;
			} else {
				return x;
			}
		} else if (y > x){
			if (z >  y) {
				return z;
			} else {
				return y;
			}
		} else if (z > x || z > y){
			return z;
		} else {
			if (x == y) {
				return x;
			} else if (y == z) {
				return y;
			} else {
				return z;
			}
		}
	}
	
	public static int max3(int x, int y, int z) {
		return Math.max(x, Math.max(y, z));
	}
	
	
	public static boolean perfectSquare(int x) {
		double n = Math.round(Math.sqrt(x));
		
		if (n == Math.sqrt(x)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int x = 9, y = 10, z =15;
		
		System.out.println(max(x, y));
		System.out.println(max(x, y, z));
		System.out.println(max3(x, y, z));
		
		if (perfectSquare(9)) {
			System.out.println("Perfect square");
		} else {
			System.out.println("Not a perfect square");
		}
	}
}
