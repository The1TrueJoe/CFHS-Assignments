/**
 * Fancy balloon
 */


package Balloon;

import java.awt.Color;
import java.awt.Graphics;

public class FancyBalloon extends Balloon{

	// Constructor
	public FancyBalloon() {
		super();
	}
	
	// Constructor
	public FancyBalloon(int x, int y, int r, Color c) {
		super(x, y, r, c);
	}
	
	// Distance
	public double distance(int x, int y) {
		double dx = x - getX();
		double dy = y - getY();
		return Math.min(Math.sqrt(4 * dx * dx + dy * dy), Math.sqrt(dx * dx + 4 * dy * dy));
	}
	
	// Draw
	public void draw(Graphics g, boolean makeItFilled) {
		// Set color
		g.setColor(getColor());
		
		// X, Y, R
		int r = getRadius();
		int x = getX();
		int y = getY();
		
		// Get color
		Color c = getColor();
		
		// Make it filled
		if (makeItFilled) {
			g.setColor(c);
			g.fillOval(x - r/2, y - r, r, 2 * r);
			g.setColor(new Color(c.getRed(), c.getGreen(), c.getBlue(), c.getAlpha()/2));
			g.fillOval(x - r, y - r/2, 2 * r, r);
		} else {
			g.setColor(c);
			g.drawOval(x - r/2, y - r, r, 2 * r);
			g.drawOval(x - r, y - r/2, 2 * r, r);
		}
	}
	
}
