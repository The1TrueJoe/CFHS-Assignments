package depositAndWithdrawlFiles;

import java.io.IOException;

import javax.swing.JOptionPane;

public class runFileSavings {
	
	public static String path = "H:\\Eclipse Workspace\\ProgrammingChallenges\\chapter6\\depositAndWithdrawlFiles\\";

	public static void main(String[] args) throws IOException {

		Savings save = new Savings(500);
		
		fileInput deposit = new fileInput(path + "Deposits.txt");
		fileInput withdraw = new fileInput(path + "Withdrawls.txt");
		
		save.setInterest(input.interest());
		
		deposit.fileRead();
		withdraw.fileRead();
		
		save.deposit(deposit.getTotal());
		save.withdraw(withdraw.getTotal());
		
		save.interest();
		
		JOptionPane.showMessageDialog(null, "Total saved: " + save.getSavings() + "\n" + 
											"Interest: " + save.interestTotal() + "\n" +
											"Deposit(s) " + deposit.getCount() + "\n" +
											"Withdrawl(s) " + withdraw.getCount());

	}

}
