package Q16;

public class Coins {

	public int quarters;
	public int nickels;
	public int dimes;
	public int pennies;
	
	public Coins(int cents) {
		quarters = cents / 25; 
		cents -= quarters * 25;
		
		dimes = cents / 10;
		cents -= dimes * 10;
		
		nickels = cents / 5;
		cents -= nickels * 5;
		
		pennies = cents;
	}
	
	public int getQuarters() { return quarters; }
	public int getNickels() { return nickels; }
	public int getDimes() { return dimes; }
	public int getPennies() { return pennies; }
	
	
	
}
