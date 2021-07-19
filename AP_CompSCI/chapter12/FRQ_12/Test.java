package FRQ_12;

public class Test {

	public void test(Devise device) {

		device.setA(2);
		device.setB(5);
		device.process();

		System.out.println(device.getResult());
}

	public static void main(String[] args) {
		Test t = new Test();

		t.test(new Adder());
		t.test(new Multiplier());
	}
}