package retailItem;

import javax.swing.JOptionPane;

public class runRetailItem {

	public static void main(String[] args) {
		// Ints and Strings
		int x = 1;
		String output;
		
		// Item 1
		Item item1 = new Item();
		
		// Set item 1
		item1.setDescription("Jacket");
		item1.setUnits(12);
		item1.setPrice(59.95);
		
		// Item 2
		Item item2 = new Item();
		
		// Set item 2
		item2.setDescription("Jeans");
		item2.setUnits(12);
		item2.setPrice(34.95);
		
		// Item 3
		Item item3 = new Item();
		
		// Set item 3
		item3.setDescription("Shirt");
		item3.setUnits(20);
		item3.setPrice(24.95);
		
		// Output
		output = "Item   | Desc | Unit | Price \n";
		
		// Output
		output += ("Item " + x + " \t" + item1.getDescription() + " \t" + item1.getUnits() + "    " + item1.getPrice() + "\n");
		x++;
		output += ("Item " + x + " \t" + item2.getDescription() + "  \t" + item2.getUnits() + "     " + item2.getPrice() + "\n");
		x++;
		output += ("Item " + x + " \t" + item3.getDescription() + "    \t" + item3.getUnits() + "     " + item3.getPrice());
		
		// Output
		JOptionPane.showMessageDialog(null, output);
	}

}
