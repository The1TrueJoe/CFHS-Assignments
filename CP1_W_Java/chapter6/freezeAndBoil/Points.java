package freezeAndBoil;

public class Points {

	public double temperature;
	
	public final double ETHYLFREEZ = -173;
	public final double ETHYLBOIL = 172;
	
	public final double OXYFREEZ = -362;
	public final double OXYBOIL = -306;
	
	public final double H2OFREEZ = 32;
	public final double H20BOIL = 212;
	
	public Points(double temp) {
		temperature = temp;
	}
	
	public Points() {
		temperature = 0;
	}
	
	public void setTemp(double temp) {
		temperature = temp;
	}
	
	public double getTemp() {
		return temperature;
	}
	
	public boolean isEthylFreezing() {
		if (temperature <= ETHYLFREEZ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEthylBoiling() {
		if (temperature >= ETHYLFREEZ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isOxygenFreezing() {
		if (temperature <= OXYFREEZ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isOxygenBoiling() {
		if (temperature >= OXYBOIL) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isWaterFreezing() {
		if (temperature <= H2OFREEZ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isWaterBoiling() {
		if (temperature >= H20BOIL) {
			return true;
		} else {
			return false;
		}
	}
	
	public String IsIsNot(boolean bool) {
		if (bool == true) {
			return "is";
		} else {
			return "is not";
		}
	}
}
