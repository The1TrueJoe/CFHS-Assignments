package retailItem;

import java.util.ArrayList;

public class RetailInventory {
	// ArrayList
	public ArrayList<RetailItem> items= new ArrayList<RetailItem>();
	
	// Apply array
	public RetailInventory(ArrayList<RetailItem> entered) { items = entered; }
	
	// Return entered size
	public int getEnteredSize() { return items.size(); }
	
	// Gets
	public String getDescription(int x) { RetailItem item = items.get(x); return item.getDescription(); }
	public int getUnits(int x) { RetailItem item = items.get(x); return item.getUnits(); }
	public double getPrice(int x) { RetailItem item = items.get(x); return item.getPrice(); }
	
}
