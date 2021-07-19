package depositAndWithdrawlFiles;

public class Savings {

	public double savings;
	public double interestRate;
	public int months;
	public double totalInterestEarned;
	
	public Savings(double svg, double inst, int mon) {
		savings = svg;
		interestRate = inst;
		months = mon;
		totalInterestEarned = 0;
		
	}
	
	public Savings(double svg) {
		savings = svg;
		interestRate = 0;
		months = 0;
		totalInterestEarned = 0;
		
	}
	
	public Savings() {
		savings = 0;
		interestRate = 0;
		months = 0;
		totalInterestEarned = 0;
		
	}
	
	public void setInterest(double inst) {
		interestRate = inst;
	}
	
	public void setMonths(int mon) {
		months = mon;
	}
	
	public double getInterest() {
		return interestRate;
	}
	
	public double getSavings() {
		return savings;
	}
	
	public double getMonths() {
		return months;
	}
	
	public void deposit(double dpst) {
		savings += dpst;
	}
	
	public void withdraw(double with) {
		savings -= with;
	}
	
	public void interest() {
		totalInterestEarned += (savings * interestRate);
		savings = (savings * interestRate) + savings;
	}
	
	public double getMonthly() {
		double monthly;
		
		monthly = interestRate / 12;
		
		return monthly;
	}
	
	public double interestTotal() {
		return totalInterestEarned;
	}
}
