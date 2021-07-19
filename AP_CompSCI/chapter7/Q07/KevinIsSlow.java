//KevinIsSlow.exe

package Q07;

public class KevinIsSlow {
	
	public static int getMonths() {
		int percentage = 10, months = 0;
		
		while (percentage < 95) {
			months++;
			percentage += (percentage * .10);
		}
		
		return months;
	}

	public static void main(String[] args) {
		
		int months = getMonths();
		System.out.println("It will take " + (months / 12) + " years " +
							(months % 12) + " months to complete the book");
	}
}
