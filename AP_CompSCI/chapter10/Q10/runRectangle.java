package Q10;

public class runRectangle {

	public static void main(String[] args) {
		
		int height = 9;
		int width = 11;
		
		Rectangle rectangle = new Rectangle(height, width);
		
		System.out.println("Rectangle 1");
		System.out.println("Height: " + rectangle.getHeight() + " Width: " + rectangle.getWidth());
		
		if (rectangle.isSquare()) {
			System.out.println("Is a square\n");
		} else {
			System.out.println("Is not a square\n");
		}
		
		height = 6;
		width = 9;
		
		rectangle = new Rectangle(height, width);
		
		System.out.println("Rectangle 2");
		System.out.println("Height: " + rectangle.getHeight() + " Width: " + rectangle.getWidth());
		
		if (rectangle.isSquare()) {
			System.out.println("Is a square\n");
		} else {
			System.out.println("Is not a square\n");
		}
		
		rectangle.quadratize();
		
		System.out.println("Rectangle 2 (Quadratized)");
		System.out.println("Height: " + rectangle.getHeight() + " Width: " + rectangle.getWidth());
		
		if (rectangle.isSquare()) {
			System.out.println("Is a square\n");
		} else {
			System.out.println("Is not a square\n");
		}

	}

}
