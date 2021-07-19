/**
 * Oval Balloon
 */


package Balloon;

import java.awt.Color;
import java.awt.Graphics;

public class OvalBalloon extends Balloon{

	// Constructor
	public OvalBalloon() {
		super();
	}
	
	// Constructor
	public OvalBalloon(int x, int y, int r, Color c) {
		super(x, y, r, c);
	}
	
	// Distance
	public double distance(int x, int y) {
		double dx = x - getX();
		double dy = y - getY();
		return Math.sqrt(4 * dx * dx + dy * dy);
	}
	
	// Draw
	public void draw(Graphics g, boolean makeItFilled) {
		// Set color
		g.setColor(getColor());
		
		// X, Y, R
		int r = getRadius();
		int x = getX();
		int y = getY();
		
		// If make it filled
		if (makeItFilled) {
			g.fillOval(x - r, y - r, r, 2 * r);
		} else {
			g.drawOval(x - r, y - r, r, 2 * r);
		}
	}
	
}
