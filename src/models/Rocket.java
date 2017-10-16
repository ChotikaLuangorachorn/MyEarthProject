//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Rocket extends Vehicle implements Drawable {
	private Color gray;
	private Color darkGray;
	private Color fireColor;

	public Rocket(int x, int y) {
		super(x, y);
		this.gray = Color.gray;
		this.darkGray = Color.decode("#D2D2D2");
		this.fireColor = Color.orange;
	}

	@Override
	public void draw(Graphics2D g2) {
		// ===== rocket body =====
		g2.setColor(fireColor);
		g2.fillRect(xPosition + 5, yPosition + 30, 10, 4);
		g2.setColor(gray);
		g2.fillRect(xPosition, yPosition, 20, 30);
		g2.setColor(darkGray);
		g2.fillRect(xPosition - 5, yPosition + 20, 8, 17);
		g2.fillRect(xPosition + 20 - 3, yPosition + 20, 8, 17);
		// ===== rocket head =====
		Polygon rocketHead = new Polygon();
		rocketHead.addPoint(xPosition, yPosition);
		rocketHead.addPoint(xPosition + 20, yPosition);
		rocketHead.addPoint(xPosition + 10, yPosition - 20);
		g2.fill(rocketHead);
	}

	public void setFireColor(Color fireColor) {
		this.fireColor = fireColor;
	}

}
