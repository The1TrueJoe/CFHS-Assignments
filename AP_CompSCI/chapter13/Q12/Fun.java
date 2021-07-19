package Q12;

public class Fun {

	public static void main(String[] args) {
		
		System.out.println(someFun(5));
		
	}
	
	public static long someFun(int n) {
		if (n <= 0) {
			return 2;
		} else {
			return someFun(n-1) * someFun(n-1);
		}
	}

}
