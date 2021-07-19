/**
 * Square balloon
 */


package Balloon;

import java.awt.Color;
import java.awt.Graphics;

public class SquareBalloon extends Balloon{

	// Constructor
	public SquareBalloon() {
		super();
	}
	
	// Constructor
	public SquareBalloon(int x, int y, int r, Color c) {
		super(x, y, r, c);
	}
	
	// Distance
	public double distance(int x, int y) {
		double dx = Math.abs(x - getX());
		double dy = Math.abs(y - getY());
		return Math.max(dx, dy);
	}
	
	// Draw
	public void draw(Graphics g, boolean makeItFilled) {
		// Set color
		g.setColor(getColor());
		
		// X, Y, R
		int r = getRadius();
		int x = getX();
		int y = getY();
		
		// Make it filled
		if (makeItFilled) {
			g.fillRect(x - r, y - r, 2 * r, 2 * r);
		} else {
			g.drawRect(x - r, y - r, 2 * r, 2 * r);
		}
	}
	
}
