package Q15;

public class Coin implements Money{

	public double value;
	
	public Coin(double d) { this.value = d; }
	
	public String toString() { return (int)(value * 100) + "¢"; }
	public double getAmount() { return value; }
	
}