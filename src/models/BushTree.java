//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;

public class BushTree implements Drawable {
	private int xPosition;
	private int yPosition;
	private Color flowerColor;

	public BushTree(Color c) {
		this.xPosition = 120;
		this.yPosition = 300;
		this.flowerColor = c;
	}

	@Override
	public void draw(Graphics2D g2) {
		g2.setColor(Color.decode("#0B610B"));
		g2.fillOval(xPosition, yPosition, 20, 20);
		g2.fillOval(xPosition + 15, yPosition - 10, 20, 20);
		g2.fillOval(xPosition + 30, yPosition, 20, 20);
		g2.fillOval(xPosition + 15, yPosition + 5, 20, 20);
		g2.fillOval(xPosition, yPosition + 15, 20, 20);
		g2.fillOval(xPosition + 15, yPosition + 20, 20, 20);
		g2.fillOval(xPosition + 30, yPosition + 15, 20, 20);
		g2.setColor(flowerColor);
		g2.fillOval(xPosition + 5, yPosition + 5, 5, 5);
		g2.fillOval(xPosition + 20, yPosition - 5, 5, 5);
		g2.fillOval(xPosition + 5, yPosition + 20, 5, 5);
		g2.fillOval(xPosition + 40, yPosition + 5, 5, 5);

	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

}
