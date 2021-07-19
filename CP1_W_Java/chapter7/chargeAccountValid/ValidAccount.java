/**
 * This program stores vaid charge accounts
 * 
 * @author JosephTelaak
 * 
 * @date_created 12/5/18
 * @date_edited 12/8/18
 * 
 * @ver 2
 */

package chargeAccountValid;

public class ValidAccount {

	// Fields
	public final int ACCOUNTS = 18;
	public int number;
	
	// Valid accounts
	public int[] account = {
			5658845, 4520125, 7895122, 8777541, 
            8451277, 1302850, 8080152, 4562555,
            5552012, 5050552, 7825877, 1250255,
            1005231, 6545231, 3852085, 7576651,
            7881200, 4581002 
            };
	
	/**
	 * Gets the account number
	 * 
	 * @return number
	 */
	
	public int getAccountNumber() { return number; }
	
	/**
	 * Chcks if valid
	 * 
	 * @param accountNumber
	 * @return true or false
	 */
	
	public boolean isValid(int accountNumber) {
		for (int i = 0; i < ACCOUNTS; i++) {
			if (account[i] == accountNumber) {
				number = account[i];
				return true;
			}
		}
		number = 0;
		return false;
	}
	
	/**
	 * Converts to string
	 * 
	 * @param valid
	 * @return valid or not valid
	 */
	
	public String valid(boolean valid) {
		if (valid == true) {
			return "is valid";
		} else {
			return "is not valid";
		}
	}
}
