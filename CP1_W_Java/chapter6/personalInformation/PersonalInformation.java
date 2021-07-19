package personalInformation;

public class PersonalInformation {

	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	/**
	 * Constructor
	 * 
	 * @param nme
	 * @param add
	 * @param ag
	 * @param ph
	 */
	
	public PersonalInformation(String nme, String add, int ag, String ph) {
		name = nme;
		address = add;
		age = ag;
		phoneNumber = ph;
	}
	
	/**
	 * Constructor
	 */
	
	public PersonalInformation() {
		name = "";
		address = "";
		age = 0;
		phoneNumber = "";
	}
	
	/**
	 * Set name
	 * 
	 * @param nme
	 */
	
	public void setName(String nme) {
		name = nme;
	}
	
	/**
	 * Set address
	 * 
	 * @param add
	 */
	
	public void setAddress(String add) {
		address = add;
	}
	
	/**
	 * Set age
	 * 
	 * @param ag
	 */
	
	public void setAge(int ag) {
		age = ag;
	}
	
	/**
	 * Set phone number
	 * 
	 * @param ph
	 */
	
	public void setPhoneNumber(String ph) {
		phoneNumber = ph;
	}
	
	/**
	 * Get name
	 * 
	 * @return
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * Get address
	 * 
	 * @return
	 */
	
	public String getAddress() {
		return address;
	}
	
	/**
	 * Get age
	 * 
	 * @return
	 */
	
	public int getAge() {
		return age;
	}
	
	/**
	 * Get phone number
	 * 
	 * @return
	 */
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
}
