package savingsAccount;

import javax.swing.JOptionPane;

public class runSavings {

	public static void main(String[] args) {
	
		// Object
		Savings save = new Savings();
		
		// Input information
		save.setInterest(input.interest());
		save.setMonths(input.months());
		

		for (; save.getMonths() >= save.i; save.i++) {
			// Input
			save.deposit(input.deposit(save.i));
			save.withdraw(input.withdrawn(save.i));
			
			// Apply interest
			save.interest();
		}

		// Output
		JOptionPane.showMessageDialog(null, "You saved: " + save.getSavings() + "\n" +
											"Total Withdrawn: " + save.withdrawnTotal() + "\n" +
											"Total Deposited: " + save.depositTotal() + "\n" +
											"Total Interest: " + save.interestTotal() + "\n" +
											"Interest Rate: " + save.getInterest());
		
	}

}
