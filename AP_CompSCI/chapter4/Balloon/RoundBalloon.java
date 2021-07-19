/**
 * This is a round balloon
 */


package Balloon;

import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon extends Balloon{

	// Constructor
	public RoundBalloon() {
		super();
	}
	
	// Constructor
	public RoundBalloon(int x, int y, int r, Color c) {
		super(x, y, r, c);
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
			g.fillOval(x - r, y - r, 2 * r, 2 * r);
		} else {
			g.drawOval(x - r, y - r, 2 * r, 2 * r);
		}
	}
	
}
