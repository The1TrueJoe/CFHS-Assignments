package savingsAccount;

public class Savings {

	// Feilds
	public double savings;
	public double interestRate;
	public int months;
	
	public double totalWithdrawn;
	public double totalDeposited;
	public double totalInterestEarned;
	
	public int i = 1;
	
	// Constructor
	public Savings(double svg, double inst, int mon) {
		savings = svg;
		interestRate = inst;
		months = mon;
		totalWithdrawn = 0;
		totalDeposited = 0;
		totalInterestEarned = 0;
	}
	
	// Constructor
	public Savings() {
		savings = 0;
		interestRate = 0;
		months = 0;
		totalWithdrawn = 0;
		totalDeposited = 0;
		totalInterestEarned = 0;
	}
	
	// Sets
	public void setInterest(double inst) { interestRate = inst; }
	public void setMonths(int mon) { months = mon; }
	
	// Gets
	public double getInterest() { return interestRate; }
	public double getSavings() { return savings; }
	public double getMonths() { return months; }
	
	// Actions
	public double depositTotal() { return totalDeposited; }
	public double withdrawnTotal() { return totalWithdrawn; }
	public double interestTotal() { return totalInterestEarned; }
	
	// Deposit
	public void deposit(double dpst) {
		totalDeposited += dpst;
		savings += dpst;
	}
	
	// Withdraw
	public void withdraw(double with) {
		totalWithdrawn += with;
		savings -= with;
	}
	
	// APply interest
	public void interest() {
		totalInterestEarned += (savings * interestRate);
		savings = (savings * interestRate) + savings;
	}
	
	// Get monthly
	public double getMonthly() {
		// Double
		double monthly;
		
		// Interest rate
		monthly = interestRate / 12;
		
		// Return
		return monthly;
	}
}
