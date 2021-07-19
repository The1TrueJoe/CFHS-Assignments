package FRQ_10;

public class LicensePlateMachine {

	static int count = 100000;
	
	public int getPlate() {
		count++;
		
		return count;
	}
	
}
