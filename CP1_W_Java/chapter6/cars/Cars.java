package cars;

public class Cars {

	// Feilds
	private int yearModel;
	private String make;
	private int speed;
	
	/**
	 * Constructor
	 * 
	 * @param year
	 * @param mke
	 * @param spd
	 */
	
	public Cars(int year, String mke, int spd) {
		yearModel = year;
		make = mke;
		speed = spd;
	}
	
	/**
	 * Constructor
	 */
	
	public Cars() {
		yearModel = 0;
		make = "";
		speed = 0;
	}
	
	/**
	 * set year
	 * 
	 * @param year
	 */
	
	public void setYear(int year) {
		yearModel = year;
	}
	
	/**
	 * set make
	 * 
	 * @param mke
	 */
	
	public void setMake(String mke) {
		make = mke;
	}
	
	/**
	 * set speed
	 * 
	 * @param spd
	 */
	
	public void setSpeed(int spd) {
		speed = spd;
	}
	
	/**
	 * get year
	 * 
	 * @return
	 */
	
	public int getYear() {
		return yearModel;
	}
	
	/**
	 * get make
	 * 
	 * @return
	 */
	
	public String getMake() {
		return make;
	}
	
	/**
	 * get speed
	 * 
	 * @return
	 */
	
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * accelerate
	 * 
	 * @return
	 */
	
	public int accelerate() {
		speed = speed + 5;
		return speed;
	}
	
	/**
	 * brake
	 * 
	 * @return
	 */
	
	public int brake() {
		speed = speed - 5;
		return speed;
	}
}
