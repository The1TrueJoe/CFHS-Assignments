package Gas;

public class Gas {

	private int miles;
	private double gallons;
	
	public Gas() { miles = 0; gallons = 0.0; }
	
	public void setMiles(int miles) { this.miles = miles; }
	public void setGall(double gallons) { this.gallons = gallons; }
	
	public int getMiles() { return miles; }
	public double getGallons() { return gallons; }
	
	public double getMPG() { return miles/gallons; }
	
	public String toString() { return String.format("MPG : %.1f", getMPG()) + "\nMiles: " + getMiles() + "\nGallons: " + getGallons(); }
	
}
