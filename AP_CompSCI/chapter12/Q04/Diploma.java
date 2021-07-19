package Q04;

public class Diploma {

	private String name;
	private String mooc;
	
	public Diploma(String name, String mooc) {
		this.name = name;
		this.mooc = mooc;
	}
	
	public String toString() {
		return "This certifies that " + name + "\nhas completed a MOOC in " + mooc;
	}
	
}
