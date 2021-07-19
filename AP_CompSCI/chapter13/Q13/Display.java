package Q13;

public class Display {

	public static void main(String[] args) {
		
		display(2019);
		
	}
	
	public static void display(int x) {
		if (x >= 10) {
			display(x/10);
			System.out.println(x % 10);
		}
	}

}
