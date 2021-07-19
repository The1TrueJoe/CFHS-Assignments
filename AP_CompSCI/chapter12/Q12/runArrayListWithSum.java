package Q12;

public class runArrayListWithSum {

	public static void main(String[] args) {

		ArrayListWithSum list = new ArrayListWithSum();
		
		for (int i = 0; i < 10; i++) {
			list.add(i + 1);
		}
		
		System.out.println(list);
		System.out.println("Sum: " + list.sum());

	}

}
