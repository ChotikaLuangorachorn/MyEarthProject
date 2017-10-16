//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Flag extends Buildings implements Drawable {
	private int[] positions;
	private Color flagColor;

	public Flag(int x, int y, int... positions) {
		super(x, y);
		this.positions = positions;
		this.flagColor = Color.pink;
	}

	@Override
	public void draw(Graphics2D g2) {
		g2.setColor(gray);
		Polygon flagstaff = new Polygon();
		flagstaff.addPoint(xPosition, yPosition);
		flagstaff.addPoint(xPosition + 40, yPosition - 5);
		flagstaff.addPoint(xPosition + 40, yPosition);
		flagstaff.addPoint(xPosition, yPosition + 5);
		g2.fill(flagstaff);
		g2.fillOval(xPosition + 40, yPosition - 7, 7, 7);
		g2.setColor(black);
		Polygon flagstaffEdge = new Polygon();
		flagstaffEdge.addPoint(xPosition, yPosition);
		flagstaffEdge.addPoint(xPosition + 40, yPosition - 5);
		flagstaffEdge.addPoint(xPosition + 40, yPosition);
		flagstaffEdge.addPoint(xPosition, yPosition + 5);
		g2.draw(flagstaffEdge);

		g2.drawOval(xPosition + 40, yPosition - 7, 7, 7);
		if (positions.length != 0) {
			this.drawFlage(g2);
		}

	}

	public void drawFlage(Graphics2D g2) {
		g2.setColor(flagColor);
		Polygon flag = new Polygon();
		flag.addPoint(positions[0], positions[1]);
		flag.addPoint(positions[0], positions[1] + 20);
		flag.addPoint(positions[0] - 7, positions[1] + 10);
		flag.addPoint(positions[0] - 14, positions[1] + 20);
		flag.addPoint(positions[0] - 14, positions[1] + 3);
		g2.fill(flag);
	}

	public void setFlagColor(Color flagColor) {
		this.flagColor = flagColor;
	}
}
