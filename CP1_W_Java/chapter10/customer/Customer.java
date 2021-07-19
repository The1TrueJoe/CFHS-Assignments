package customer;

public class Customer extends Person {
	
	public String customerNumber;
	public boolean mailingList;
	
	public Customer(String nme, String add, String num) {
		super(nme, add, num);
	}
	
	public Customer(String nme, String add, String num, String custNum) {
		super(nme, add, num);
		
		customerNumber = num;
	}
	
	public Customer(String nme, String add, String num, String custNum, boolean mail) {
		super(nme, add, num);
		
		customerNumber = num;
		mailingList = mail;
	}
	
	public Customer(String custNum, boolean mail) {
		super();
		
		customerNumber = custNum;
		mailingList = mail;
	}
	
	public Customer() {
		super();
		
		customerNumber = null;
		mailingList = true;
	}
	
	public void setCustomerNumber(String custNum) { customerNumber = custNum; }
	public void setMailingList(boolean mail) { mailingList = mail; }
	
	public String getCustomerNumber() { return customerNumber; }
	public boolean getMailingList() { return mailingList; }
	
}
