package FRQ2015_2;

import java.util.ArrayList;
import java.util.List;

public class MultipleGroups implements NumberGroup{

	private List<NumberGroup> groupList;  

	  public MultipleGroups()
	  {
	     groupList = new ArrayList<NumberGroup>();
	  }
	
	public boolean contains(int n) {
		for (int i = 0; i < groupList.size(); i++) {
			if (groupList.get(i).contains(n)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args)
	  {
	    MultipleGroups multiple = new MultipleGroups();
	    
	    multiple.groupList.add(new Range(5, 8));
	    multiple.groupList.add(new Range(10, 12));
	    multiple.groupList.add(new Range(1, 6));
	    
	    System.out.println(multiple.contains(2));
	    System.out.println(multiple.contains(9));
	    System.out.println(multiple.contains(6));
	  }
}
