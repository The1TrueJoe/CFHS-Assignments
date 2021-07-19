package InflatableBalloon;

import java.awt.Color;
import Balloon.Balloon;

public class InflatableBalloon extends Balloon {
	
	public InflatableBalloon(int x, int y, int r, Color c) {
		super(x, y, r, c);
	}
	
	public InflatableBalloon() {
		super();
	}
	
	public void inflate(int percentage) {
		int r = super.getRadius();
		double rCubed = Math.pow(r, 3);
		
		rCubed *= 0.01 * (100 + percentage);
		r = (int)(Math.pow(rCubed, 1.0/3.0) + 0.05);
		
		setRadius(r);
	}
	
}

