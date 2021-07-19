package temperature;

import javax.swing.JOptionPane;

public class runTemp {

	public static void main(String[] args) {
		
		Temperature temp = new Temperature();
		
		temp.setTemp(input.fahrenheit());
		
		JOptionPane.showMessageDialog(null, String.format("%,.2fF \n%,.2fC \n%,.2fK", 
											temp.getTemp(), temp.getCelcius(), temp.getKelvin()));

	}

}
