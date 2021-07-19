package FRQ_12;

public abstract class Devise {

	public int aValue, bValue, result; 
	
	public void setA(int a) { aValue = a; } 
	public void setB(int b) { bValue = b; } 
	
	public abstract void process();
	
	public int getResult() { return result; }
}
