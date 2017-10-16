//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Satellite extends Buildings implements Drawable {
	private Color darkBlue;

	public Satellite(int x, int y) {
		super(x, y);
		this.darkBlue = Color.decode("#2037D0");
	}

	@Override
	public void draw(Graphics2D g2) {
		// ===== solar cell Left=====
		g2.setColor(darkBlue);
		Polygon solarLeft = new Polygon();
		solarLeft.addPoint(xPosition - 70, yPosition + 70);
		solarLeft.addPoint(xPosition - 20, yPosition + 25);
		solarLeft.addPoint(xPosition - 20, yPosition + 45);
		solarLeft.addPoint(xPosition - 70, yPosition + 95);
		g2.fill(solarLeft);

		g2.setColor(black);
		Polygon solarLeftEdge = new Polygon();
		solarLeftEdge.addPoint(xPosition - 20, yPosition + 25);
		solarLeftEdge.addPoint(xPosition - 20, yPosition + 45);
		solarLeftEdge.addPoint(xPosition, yPosition + 20);
		g2.draw(solarLeftEdge);
		// ===== Structure =====
		g2.setColor(gray);
		Polygon structure = new Polygon();
		structure.addPoint(xPosition, yPosition);
		structure.addPoint(xPosition + 20, yPosition + 20);
		structure.addPoint(xPosition, yPosition + 40);
		structure.addPoint(xPosition - 20, yPosition + 20);
		g2.fill(structure);
		// ===== solar cell Right=====
		g2.setColor(darkBlue);
		Polygon solarRight = new Polygon();
		solarRight.addPoint(xPosition + 10, yPosition);
		solarRight.addPoint(xPosition + 60, yPosition - 50);
		solarRight.addPoint(xPosition + 60, yPosition - 20);
		solarRight.addPoint(xPosition + 10, yPosition + 20);
		g2.fill(solarRight);

		g2.setColor(black);
		Polygon solarRightEdge = new Polygon();
		solarRightEdge.addPoint(xPosition + 10, yPosition);
		solarRightEdge.addPoint(xPosition + 10, yPosition + 20);
		solarRightEdge.addPoint(xPosition, yPosition + 20);
		g2.draw(solarRightEdge);

	}

}
