package Q06_OLD;

public class Fraction {

	public int numerator;
	public int denominator;
	
	public Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
	}
	
	public double getValue() { return numerator / denominator; }
	
	public int getNum() { return numerator; }
	public int getDenom() { return denominator; }
	
	public void setNum(int num) { numerator = num; }
	public void setDenom(int denom) { denominator = denom; }
	
	public String getFraction() { return numerator + "/" + denominator; }
	
	public Fraction reciprocal() {
		return new Fraction(denominator, numerator);
	}
	
	public void equalize(Fraction f2) {
		int multiplier = getLCF(denominator, f2.getDenom());
		
		setNum(numerator * multiplier);
		setDenom(denominator * multiplier);
	}
	
	public Fraction convertToFraction(double d) {
        String s = String.valueOf(d);
        int digitsDec = s.length() - 1 - s.indexOf('.');
        int denom = 1;
        for (int i = 0; i < digitsDec; i++) {
            d *= 10;    
            denom *= 10;
        }

        int num = (int) Math.round(d);
        
        return new Fraction(num, denom);
    }
	
	public static int getLCF(int a, int b) {
		while (a != b) {
			if (a < b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		
		return a;
	}
}
