package Activity1;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card card1 = new Card("10", "Diamonds", 10);
		Card card2 = new Card("10", "Diamonds", 10);
		Card card3 = new Card("Ace","Spades", 1);
		
		System.out.println("Card 1: " + card1);
		System.out.println("Card 2: " + card2);
		System.out.println("Card 3: " + card3);
		
		System.out.println("Card 1 equals Card 2: " + card1.matches(card2));
		System.out.println("Card 2 equals Card 3: " + card2.matches(card3));
	}
}
