package rainfallOld;

public class Rainfall {

	public final int MONTHS = 12;
	public int index;
	
	public double[] totalRainfall = new double[MONTHS];
	public double avgMonthlyRain;
	
	public String monthMostRain;
	public String monthLeastRain;
	
	
	public Rainfall() {
		index = 1;
		avgMonthlyRain = 0;
		monthMostRain = null;
		monthLeastRain = null;
	}
	
	public void addRain(double rain) {
		index++;
		
		totalRainfall[index] = rain;
	}
	
	public double getRain(int in) { return totalRainfall[in]; }
	public int getIndex() { return index; }
	public int getMonths() { return MONTHS; }
	
	public String getMonthMost() { return monthMostRain; }
	public String getMonthLeast() { return monthLeastRain; }
	
	public void setMostRain() {
		double r1 = totalRainfall[0], m = 0 ;
		for(int i =0; i < totalRainfall.length; i++){
			if(totalRainfall[i] > r1) {r1 = totalRainfall[i]; m = i+1;}	
		}
		monthMostRain = getMonthName(m);
	}
	
	public void setLeastRain() {
		double r1 = totalRainfall[0], m = 0 ;
		for(int i =0; i < totalRainfall.length; i++){
			if(totalRainfall[i] > r1) {r1 = totalRainfall[i]; m = i+1;}	
		}
		monthLeastRain = getMonthName(m);
	}
	
	public String getMonthName(double m) {
	
			   if (m == 0) { return "January"; 
		} else if(m == 1) { return "Febuary"; 
		} else if(m == 2) { return "March"; 
		} else if(m == 3) { return "April"; 
		} else if(m == 4) { return "May"; 
		} else if(m == 5) { return "June"; 
		} else if(m == 6) { return "July"; 
		} else if(m == 7) { return "August"; 
		} else if(m == 8) { return "September"; 
		} else if(m == 9) { return "October"; 
		} else if(m == 10) { return "November"; 
		} else if(m == 11) { return "December"; 
		} else { return null; }
	}
}
