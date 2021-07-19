package FRQ2014_4;

public class Trio implements MenuItem{

	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;
	
	public Trio(Sandwich sandwich, Salad salad, Drink drink) {
		this.sandwich = sandwich;
		this.salad = salad;
		this.drink = drink;
	}
	
	public double getPrice() {
		return (sandwich.getPrice() + salad.getPrice() + drink.getPrice()) -
					Math.min(sandwich.getPrice(), Math.min(salad.getPrice(), drink.getPrice()));
	}
	
	public String getName() {
		return "Trio";
	}
	
	public String toString() {
		return sandwich + " / " + salad + " / " + drink + " " + getName() + " $" + getPrice();
	}
}
