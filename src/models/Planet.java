//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;

public class Planet implements Drawable {
	protected int xPosition;
	protected int yPosition;

	public Planet(int x, int y) {
		this.xPosition = x;
		this.yPosition = y;
	}

	public void draw(Graphics2D g2) {
		g2.fillOval(xPosition, yPosition, 50, 50);
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

}
