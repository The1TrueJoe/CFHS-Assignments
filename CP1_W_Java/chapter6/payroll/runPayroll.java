package payroll;

public class runPayroll {

	public static void main(String[] args) {
		// Payroll Object
		Payroll payroll = new Payroll();
		
		// Sets
		payroll.setName(input.name());
		payroll.setID(input.IDname());
		payroll.setPay(input.payRate());
		payroll.setHours(input.hours());
		
		// Output
		System.out.println("\n" + payroll.getName() + ": \n" +
						   		  payroll.getID() + "\n" + 
						   		  payroll.getPay() + "\n" +
						   		  payroll.getHours() + "\n\n" +
						   		  "Total Pay: " + payroll.getGrossPay());

	}

}
