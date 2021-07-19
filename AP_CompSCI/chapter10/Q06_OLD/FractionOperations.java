package Q06_OLD;

public class FractionOperations {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(10, 2);
		Fraction f2 = new Fraction(12, 4);
		
		System.out.println("Fraction 1: " + f1.getNum() + "/" + f1.getDenom());
		System.out.println("Fraction 2: " + f2.getNum() + "/" + f2.getDenom());
		
		System.out.println("Divide: " + divide(f1, f2).getNum() + "/" + divide(f1, f2).getDenom() +
						   "\nSubtract: " + subtract(f1, f2).getNum() + "/" + subtract(f1, f2).getDenom());
	}
	
	public static Fraction divide(Fraction f1, Fraction f2) {
		f2 = f2.reciprocal();
		
		if (f1.getDenom() == 0 || f1.getNum() == 0 || f2.getDenom() == 0 || f2.getNum() == 0) {
			throw new IllegalArgumentException();
		}
		
		return new Fraction(f1.getNum() * f2.getNum(), f1.getDenom() * f2.getDenom());
	}
	
	public static Fraction subtract(Fraction f1, Fraction f2) {
		if (f1.getDenom() < f1.getNum()) {
			f1.equalize(f2);
		} else {
			f2.equalize(f1);
		}
		
		return new Fraction(f2.getNum()*-1 + f1.getNum()*-1, f1.getDenom()*-1);
	}

}
