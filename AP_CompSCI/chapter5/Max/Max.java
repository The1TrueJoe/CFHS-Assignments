package Max;

public class Max {

	public int n1,n2,n3;
	
	public Max(int n1, int n2, int n3) {
		this.n1=n1; this.n2=n2; this.n3=n3;
	}
	
	public int getMax() { return Math.max(n1, Math.max(n2, n3)); }
	
	public String toString() { return "Max: " + getMax() + "\nN1: " + n1 + " N2: " + n2 + " N3: " + n3; }
}
