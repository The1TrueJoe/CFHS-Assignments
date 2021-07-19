package freezeAndBoil;

import javax.swing.JOptionPane;

public class runPoints {

	public static void main(String[] args) {
		
		Points points = new Points();
		
		points.setTemp(input.temp());
		
		JOptionPane.showMessageDialog(null, "Temp: " + points.getTemp() + "\n" +
				"Ethyl " + points.IsIsNot(points.isEthylFreezing()) + " freezing\n" +
				"Ethyl " + points.IsIsNot(points.isEthylBoiling()) + " boiling\n" +
				
				"Oxygen " + points.IsIsNot(points.isOxygenFreezing()) + " freezing\n" +
				"Oxygen " + points.IsIsNot(points.isOxygenBoiling()) + " boiling\n" +
				
				"Water " + points.IsIsNot(points.isWaterFreezing()) + " freezing\n" +
				"Water " + points.IsIsNot(points.isWaterBoiling()) + " boiling\n");

	}

}
