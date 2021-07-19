package preferredCustomer;

import customer.Customer;

public class PreferredCustomer extends Customer {

	public int purchases;
	public double discountLevel;
	
	public PreferredCustomer(int purch, double level) {
		purchases = purch;
		discountLevel = level;
	}
	
	
	public void calcDiscount() {
		if (purchases >= 500 && purchases <= 999) {
			discountLevel = .05;
		} else if (purchases >= 1000 && purchases <= 1499) {
			discountLevel = .06;
		} else if (purchases >= 1500 && purchases <= 1999) {
			discountLevel = .07;
		} else if (purchases >= 2000) {
			discountLevel = .1;
		} else {
			discountLevel = 0;
		}
	}
	
	public void setPurchases(int purch) { purchases = purch; }
	public void setDiscount(double level) { discountLevel = level; }
}
