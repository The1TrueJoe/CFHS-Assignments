package Q15;

public class Bill implements Money{

	public int value;
	
	public Bill(int value) { this.value = value; }
	
	public String toString() { return "$" + value; }
	public double getAmount() { return value; }
	
}
