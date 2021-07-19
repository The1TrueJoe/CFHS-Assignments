package month;

public class Month {

	public int monthNumber;
	public Month month;
	
	public Month() {
		monthNumber = 1;
	}

	public Month(String name) {
		if (name.equalsIgnoreCase("Januray")) {
			monthNumber = 1;
		} else if (name.equalsIgnoreCase("Febuary")) {
			monthNumber = 2;
		} else if (name.equalsIgnoreCase("Febuary")) {
			monthNumber = 3;
		} else if (name.equalsIgnoreCase("Febuary")) {
			monthNumber = 4;
		} else if (name.equalsIgnoreCase("Febuary")) {
			monthNumber = 5;
		} else if (name.equalsIgnoreCase("Febuary")) {
			monthNumber = 6;
		} else if (name.equalsIgnoreCase("Febuary")) {
			monthNumber = 7;
		} else if (name.equalsIgnoreCase("Febuary")) {
			monthNumber = 8;
		} else if (name.equalsIgnoreCase("Febuary")) {
			monthNumber = 9;
		} else if (name.equalsIgnoreCase("Febuary")) {
			monthNumber = 10;
		} else if (name.equalsIgnoreCase("Febuary")) {
			monthNumber = 11;
		} else {
			monthNumber = 12;
		}
	}
	
	public int getMonthNumber() { return monthNumber; }
	
	public Month(int num) {
		if (num < 1 || num > 12) {
			monthNumber = 1;
		} else {
			monthNumber = num;
		}
	}
	
	public void setMonthNumber(int num) { 
		if (num < 1 || num > 12) {
			monthNumber = 1;
		} else {
			monthNumber = num;
		}
	}
	
	public String getMonthName() {
		if (monthNumber == 1) {
			return "January";
		} else if (monthNumber == 2) {
			return "Febuary";
		} else if (monthNumber == 3) {
			return "March";
		} else if (monthNumber == 4) {
			return "April";
		} else if (monthNumber == 5) {
			return "May";
		} else if (monthNumber == 6) {
			return "June";
		} else if (monthNumber == 7) {
			return "July";
		} else if (monthNumber == 8) {
			return "August";
		} else if (monthNumber == 9) {
			return "September";
		} else if (monthNumber == 10) {
			return "October";
		} else if (monthNumber == 11) {
			return "November";
		} else {
			return "December";
		}
	}
	
	public String toString() {
		return getMonthName();
	}
	
	public boolean equals(Month month1) {
		if (month.getMonthNumber() == month1.getMonthNumber()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean greaterThan(Month month1) {
		if (month.getMonthNumber() > month1.getMonthNumber()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean lessThan(Month month1) {
		if (month.getMonthNumber() < month1.getMonthNumber()) {
			return true;
		} else {
			return false;
		}
	}
}
