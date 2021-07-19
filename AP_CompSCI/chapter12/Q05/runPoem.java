package Q05;

public class runPoem {

	public static void main(String[] args) {

		Poem limerick = new Limerick();
		Poem haiku = new Haiku();
		
		System.out.println("Limerick: ");
		limerick.printRythm();
		
		System.out.println("\nHaiku: ");
		haiku.printRythm();

	}

}
