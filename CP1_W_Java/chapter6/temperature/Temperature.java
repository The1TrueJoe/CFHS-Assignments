package temperature;

public class Temperature {

	private double fahrenheit;
	
	public Temperature(double ftemp) {
		fahrenheit = ftemp;
	}
	
	public Temperature() {
		fahrenheit = 0.0;
	}
	
	public void setTemp(double ftemp) {
		fahrenheit = ftemp;
	}
	
	public double getTemp() {
		return fahrenheit;
	}
	
	public double getCelcius() {
		double celcius;
		
		celcius = (5.0/9.0) * (fahrenheit - 32);
		
		return celcius;
	}
	
	public double getKelvin() {
		double kelvin;
		
		kelvin = ((5.0/9.0) * (fahrenheit - 32) + 273);
		
		return kelvin;
	}
	
}
