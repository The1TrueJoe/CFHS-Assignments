package retailItem;

public class RetailItem {
	// Feilds
	private String description;
	private int unitsOnHand;
	private double price;
	
	// Constructor
	public RetailItem(String desc, int units, double pc) { description = desc; unitsOnHand = units; price = pc; }
	
	// Gets
	public String getDescription() {  return description; }
	public int getUnits() { return unitsOnHand; }
	public double getPrice() { return price; }
}
