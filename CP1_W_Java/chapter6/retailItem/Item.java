package retailItem;

public class Item {

	// Fields
	private String description;
	private int unitsOnHand;
	private double price;
	
	/**
	 * Constructor
	 * 
	 * @param desc
	 * @param qty
	 * @param pc
	 */
	
	public Item(String desc, int qty, double pc) {
		description = desc;
		unitsOnHand = qty;
		price = pc;
	}
	
	/**
	 * Constructor
	 */
	
	public Item() {
		description = "";
		unitsOnHand = 0;
		price = 0;
	}
	
	/**
	 * Set description
	 * 
	 * @param desc
	 */
	
	public void setDescription(String desc) {
		description = desc;
	}
	
	/**
	 * Set units
	 * 
	 * @param qty
	 */
	
	public void setUnits(int qty) {
		unitsOnHand = qty;
	}
	
	/**
	 * Set price
	 * 
	 * @param pc
	 */
	
	public void setPrice(double pc) {
		price = pc;
	}
	
	/**
	 * Get description
	 * 
	 * @return
	 */
	
	public String getDescription() {
		return description;
	}
	
	/**
	 * Get units
	 * 
	 * @return
	 */
	
	public int getUnits() {
		return unitsOnHand;
	}
	
	/**
	 * Get price
	 * 
	 * @return
	 */
	
	public double getPrice() {
		return price;
	}
	
}
