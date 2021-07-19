/**
This program analyizes budgets

@author JosephTelaak

10/18/18
 */



package budgetAnalysis;

import javax.swing.JOptionPane;

public class budgetAnalysis {

	public static void main(String[] args) {

		// Doubles and strings
		double total = 0,
		       budget,
		       spent,
		       difference;
		
		String userInput,
		       output,
		       outputExpense = "";
		
		// Input
		userInput = JOptionPane.showInputDialog("Enter Budget");										// Get budget
		budget = Double.parseDouble(userInput);															// Get budget
		
		// Get spent
		do {
			userInput = JOptionPane.showInputDialog("Exit with -99 \nEnter amount spent");				// Amount spent
			spent = Double.parseDouble(userInput);														// Amount spent
			 
			// Decision
			if (spent == -99) {																			// If exit value
			} else {
				total -= spent;																			// Subtract from total
				outputExpense += ("-" + spent + "\n");													// Add to output
				
			}
			
		} while (spent != -99);
		
		// Calculation
		difference = (budget + total);																	// Calculates distance
		
		// Output
		output = String.format("Your total spent is $%,.2f \n"
				             + "Your budget is $%,.2f \n\n"
				             + "The difference is $%,.2f \n"
				             + "You spent "
				             , Math.abs(total), budget, Math.abs(difference)
				             );
		
		// Decision
		if ((total * -1) > budget) {
			output += "Too Much";																		// Over budget
			
		} else if ((total * -1) < budget) {
			output += "Under Budget";																	// Under budget
			
		} else {
			output += "At Budget";																		// At budget
			
		}
		
		// Final output
		JOptionPane.showMessageDialog(null, output);
		JOptionPane.showMessageDialog(null, "Expenses \n" + 
		                                    "--------------- \n" +
				                             outputExpense
				                            );
	}

}
