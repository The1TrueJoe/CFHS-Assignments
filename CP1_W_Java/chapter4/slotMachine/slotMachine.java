/**
This is a slot machine game

@author JosephTelaak

10/19/18
 */


package slotMachine;

import javax.swing.JOptionPane;
import java.util.Random;

public class slotMachine {

	public static void main(String[] args) {
		
		// Ints, Doubles, and Strings
		int continueGame,
		    item1,
		    item2,
		    item3;
		
		double moneyTotal = 0,
		       moneyWon,
		       moneyIn;
		
		String userInput,
		       winStatus,
		       winHistory = "",
		       item1Name = null,
		       item2Name = null,
		       item3Name = null;
		
		Random random = new Random();
	
		// Input
		userInput = JOptionPane.showInputDialog("Add bank money");											// Bank
		moneyTotal = Double.parseDouble(userInput);															// Bank
		
		// Game
		do {
			// Input
			userInput = JOptionPane.showInputDialog("Enter bet");											// Bet
			moneyIn = Double.parseDouble(userInput);														// Bet
			
			// Random
			item1 = random.nextInt(6);																		// Iten 1 Rand
			item2 = random.nextInt(6);																		// Item 2 Rand
			item3 = random.nextInt(6);																		// Item 3 Rand
			
			// Compare
			if (item1 == item2 && 																			// All three are equal
			    item2 == item3 && 
			    item1 == item3) {
				
				// Prepare output
				winStatus = "Won 3 times amount in";														// Won
				moneyWon = 3 * moneyIn;																		// 3 Times in
				winHistory += (winStatus + "\n Money in: " + 												// Output add
				               moneyIn + " Money won: " + moneyWon + "\n");
				
			} else if (item1 == item2 || 																	// Some are equal
			           item2 == item3 || 
			           item1 == item3) {

				// Prepare output
				winStatus = "Won 2 times amount in";														// Won
				moneyWon = 2 * moneyIn;																		// 2 Times in
				winHistory += (winStatus + "\n Money in: " + 												// Output add
				               moneyIn + " Money won: " + moneyWon + "\n");
				
			} else {																						// None are equal

				// Prepare output
				winStatus = "Lost";																			// Lost
				moneyWon = moneyIn * 0;																		// 0 Times in
				winHistory += (winStatus + "\n Money in: " + 												// Output add
				               moneyIn + " Money won: " + moneyWon + "\n");
				
			}		
			
			// Assign strings
			if (item1 == 0) {
				item1Name = "Cherries ";																	// Cherries
			} else if (item1 == 1) {
				item1Name = "Oranges ";																		// Oranges
			} else if (item1 == 2) {
				item1Name = "Plums ";																		// Plums
			} else if (item1 == 3) {
				item1Name = "Bells ";																		// Bells
			} else if (item1 == 4) {
				item1Name = "Melons ";																		// Melons
			} else if (item1 == 5) {
				item1Name = "Bars ";																		// Bars
			}
			
			// Assign strings
			if (item2 == 0) {
				item2Name = "Cherries ";																	// Cherries
			} else if (item2 == 1) {
				item2Name = "Oranges ";																		// Oranges
			} else if (item2 == 2) {
				item2Name = "Plums ";																		// Plums
			} else if (item2 == 3) {
				item2Name = "Bells ";																		// Bells
			} else if (item2 == 4) {
				item2Name = "Melons ";																		// Melons
			} else if (item2 == 5) {
				item2Name = "Bars ";																		// Bars
			}
			
			// Assign strings
			if (item3 == 0) {
				item3Name = "Cherries ";																	// Cherries
			} else if (item3 == 1) {
				item3Name = "Oranges ";																		// Oranges
			} else if (item3 == 2) {
				item3Name = "Plums ";																		// Plums
			} else if (item3 == 3) {
				item3Name = "Bells ";																		// Bells
			} else if (item3 == 4) {
				item3Name = "Melons ";																		// Melons
			} else if (item3 == 5) {
				item3Name = "Bars ";																		// Bars
			}


			// Calculations
			moneyTotal += moneyWon;																			// Adds total
			
			// Output
			JOptionPane.showMessageDialog(null, item1Name + item2Name + item3Name + "\n" 						// Tells item names
			                                  + winStatus  														// Win status
			                                  + "\nMoney in: " + moneyIn + " Money won: " + moneyWon + "\n"		// Money
			                                  );
			JOptionPane.showMessageDialog(null, "Total money equals: " + moneyTotal);						// Total money
			
			// Continue
			continueGame = JOptionPane.showConfirmDialog(null, "Continue?");								// Continue
			// 0=yes, 1=no, 2=cancel
		} while (continueGame == 0);
		
		// Output
		JOptionPane.showMessageDialog(null, "Total money equals: " + moneyTotal);							// Total money
		JOptionPane.showMessageDialog(null, winHistory);													// History
		
		
	}

}
