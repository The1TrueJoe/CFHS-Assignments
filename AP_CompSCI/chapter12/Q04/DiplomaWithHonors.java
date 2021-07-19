package Q04;

public class DiplomaWithHonors extends Diploma{

	public DiplomaWithHonors(String name, String mooc) {
		super(name, mooc);
	}
	
	public String toString() {
		return super.toString() + "\n*** with honors ***";
	}

}
