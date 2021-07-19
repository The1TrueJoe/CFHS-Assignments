package Q15;

import java.util.ArrayList;

public class testMoney {

	public static void main(String[] args) {

		ArrayList<Money> bank = new ArrayList<Money>();
		
		bank.add(new Bill(5));
		bank.add(new Bill(1));
		bank.add(new Quarter());
		bank.add(new Quarter());
		bank.add(new Dime());
		bank.add(new Nickel());

		double total = 0;
		
		for(Money item : bank) {
			total += item.getAmount();
		}
		
		System.out.printf("The piggy bank holds $%.2f\n", total);
		System.out.println("\n" + bank);
		
	}

}
