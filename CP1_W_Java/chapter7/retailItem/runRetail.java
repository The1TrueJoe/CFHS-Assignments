package retailItem;

import java.util.ArrayList;

public class runRetail {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<RetailItem> entered = new ArrayList<RetailItem>();
		
		// Random Objects
		RandomQTY qty = new RandomQTY();
		RandomPrice price = new RandomPrice();
		RandomDesc desc = new RandomDesc();
		
		// Add
		for (int i = 0; i < desc.getSize(); i++) {
			entered.add(i, new RetailItem(desc.getDesc(i), qty.getQTY(), price.getPrice()));
		}
		
		// Object
		RetailInventory inventory = new RetailInventory(entered);
		
		// Output
		System.out.println("\tName:\t\tQty:\t\tPrice:");
		
		for (int i = 0; i < inventory.getEnteredSize(); i++) {
			if(inventory.getPrice(i) <= 20) {
				System.out.println(
						(i+1) + ". \t" + inventory.getDescription(i) + "\t\t" + inventory.getUnits(i)
						+ "\t\t" + String.format("$%,.2f",inventory.getPrice(i))
						);
			}
		}
	}

}
