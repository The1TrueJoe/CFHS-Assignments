package blackJack;

import javax.swing.JOptionPane;

public class input {

	public static boolean cont() {
		int num;
		
		num = JOptionPane.showConfirmDialog(null, "Roll?");
		// 0=yes, 1=no, 2=cancel
		
		if (num == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
