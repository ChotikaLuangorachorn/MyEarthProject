//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;

public class Raft extends Vehicle implements Drawable {
	private Color brown;
	private Color darkBrown;

	public Raft(int x, int y) {
		super(x, y);
		this.brown = Color.decode("#BE3E14");
		this.darkBrown = Color.decode("#7E2508");
	}

	@Override
	public void draw(Graphics2D g2) {
		g2.setColor(brown);
		g2.fillRoundRect(xPosition, yPosition, 50, 5, 10, 10);
		g2.fillRoundRect(xPosition + 2, yPosition - 5, 50, 5, 10, 10);
		g2.fillRoundRect(xPosition + 2, yPosition - 10, 50, 5, 10, 10);
		g2.setColor(darkBrown);
		g2.drawRoundRect(xPosition, yPosition, 50, 5, 10, 10);
		g2.drawRoundRect(xPosition + 2, yPosition - 5, 50, 5, 10, 10);
		g2.drawRoundRect(xPosition + 2, yPosition - 10, 50, 5, 10, 10);
		g2.drawOval(xPosition + 45, yPosition, 5, 5);
		g2.drawOval(xPosition + 47, yPosition - 5, 5, 5);
		g2.drawOval(xPosition + 47, yPosition - 10, 5, 5);
	}

}
