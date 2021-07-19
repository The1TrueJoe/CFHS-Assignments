package Q09;

import java.util.ArrayList;

public class ArrayListV2<E> extends ArrayList<E>{

	private static final long serialVersionUID = 1L;

	public String toString() {
		String str = "[";
		
		for (int i = 0; i < this.size(); i++) {
			str += this.get(i) + ", ";
		}

		return str.substring(0, str.length() - 2) + "]";
	}
	
	
}
