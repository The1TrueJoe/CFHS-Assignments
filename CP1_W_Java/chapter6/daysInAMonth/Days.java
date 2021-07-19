package daysInAMonth;

public class Days {

	private int month;
	private int year;
	private String name;
	private String leap;
	
	public Days(int mon, int y) {
		month = mon;
		year = y;
	}
	
	public Days() {
		month = 0;
		year = 0;
	}
	
	public void setMonth(int mon) {
		month = mon;
	}
	
	public void setYear(int y) {
		year = y;
	}
	
	public String getMonth() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getNumOfDays() {
		switch (month) {
		case 1:
			name = "January";
			return 31;
		case 2:
			name = "Febuary";
			if (leap() == true) {
				return 29;
			} else {
				return 28;
			}
		case 3:
			name = "March";
			return 31;
		case 4:
			name = "April";
			return 30;
		case 5: 
			name = "May";
			return 31;
		case 6:
			name = "June";
			return 30;
		case 7:
			name = "July";
			return 31;
		case 8:
			name = "August";
			return 31;
		case 9: 
			name = "September";
			return 30;
		case 10:
			name = "October";
			return 31;
		case 11:
			name = "November";
			return 30;
		case 12:
			name = "December";
			return 31;
		default:
			return 0;	
		}
	}
	
	public boolean leap() {
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				leap = "is";
				return true;
			} else {
				leap = "is not";
				return false;
			}
		} else {
			if (year % 4 == 0) {
				leap = "is";
				return true;
			} else {
				leap = "is not";
				return false;
			}
		}
	}
	
	public String getLeap() {
		return leap;
	}
}
