//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Apartment extends Buildings implements Drawable {
	private Color windowColor;
	private Color darkViolet;

	public Apartment(int x, int y, Color windowColor) {
		super(x, y);
		this.windowColor = windowColor;
		this.darkViolet = Color.decode("#5B0257");
	}

	@Override
	public void draw(Graphics2D g2) {
		g2.setColor(darkViolet);
		Polygon structure = new Polygon();
		structure.addPoint(xPosition, yPosition);
		structure.addPoint(xPosition + 70, yPosition + 50);
		structure.addPoint(xPosition + 30, yPosition + 120);
		structure.addPoint(xPosition - 10, yPosition + 20);
		g2.fill(structure);

		g2.setColor(windowColor);
		Polygon windowTop = new Polygon();
		windowTop.addPoint(xPosition, yPosition + 5);
		windowTop.addPoint(xPosition + 10, yPosition + 12);
		windowTop.addPoint(xPosition, yPosition + 32);
		windowTop.addPoint(xPosition - 7, yPosition + 19);
		g2.fill(windowTop);

		Polygon windowBottom = new Polygon();
		windowBottom.addPoint(xPosition + 14, yPosition + 15);
		windowBottom.addPoint(xPosition + 25, yPosition + 24);
		windowBottom.addPoint(xPosition + 10, yPosition + 55);
		windowBottom.addPoint(xPosition + 3, yPosition + 38);
		g2.fill(windowBottom);

		g2.setColor(Color.decode("#3A1C01"));
		g2.fillOval(xPosition + 18, yPosition + 38, 30, 27);
	}

	public void setWindowColor(Color windowColor) {
		this.windowColor = windowColor;
	}

}
