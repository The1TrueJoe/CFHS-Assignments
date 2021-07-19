package InflatableBalloon;

public class runInflate {

	public static void main(String[] args) {
		
		InflatableBalloon balloon = new InflatableBalloon();
		
		System.out.println("Initial Radius: " + balloon.getRadius());
		balloon.inflate(50);
		System.out.println("Final radius: " + balloon.getRadius());
	}

}
