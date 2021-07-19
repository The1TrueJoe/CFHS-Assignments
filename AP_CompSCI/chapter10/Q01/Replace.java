package Q01;

public class Replace {

	public static void main(String[] args) {
		
		String a = "tes";
		char b = 't';
		
		a = replace(a, b);
		
		System.out.println(a);
		
	}
	
	public static String replace(String a, char b) {
		
		return a + b;
		
	}

}
