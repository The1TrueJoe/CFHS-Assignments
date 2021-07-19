package retailItem;

import employee.RandomGen;

public class RandomDesc extends RandomGen {
	
	private String[] items = {
			"Tablet", "Phone", "TV", "DVD", "CD"
	};
	
	public int getSize() { return items.length; }
	public String getDesc(int i) { return items[i]; }
}
