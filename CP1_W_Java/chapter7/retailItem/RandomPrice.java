package retailItem;

import employee.RandomGen;

public class RandomPrice extends RandomGen{

	public double getPrice() { return rand.nextInt(35) + rand.nextDouble();}
	
}
