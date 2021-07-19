package employee;

public class RandomID extends RandomGen {

	public String getID(int length) {
		String output = "";
		
		for (int i = 0; i < length; i++) {
			output += generate();
		}
		
		return output;
	}
	
}
