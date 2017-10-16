//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Turbine extends Buildings implements Drawable {
	private Color ColorPillar;

	public Turbine(int x, int y, Color color) {
		super(x, y);
		this.ColorPillar = color;
	}

	@Override
	public void draw(Graphics2D g2) {
		// ===== Pillar =====
		g2.setColor(ColorPillar);
		Polygon pillar = new Polygon();
		pillar.addPoint(450, 200);
		pillar.addPoint(460, 220);
		pillar.addPoint(490, 180);
		g2.fill(pillar);

		g2.setColor(black);
		Polygon pillarEdge = new Polygon();
		pillarEdge.addPoint(450, 200);
		pillarEdge.addPoint(460, 220);
		pillarEdge.addPoint(490, 180);
		g2.draw(pillarEdge);
		// ===== Propeller =====
		g2.setColor(ColorPillar);
		Polygon propeller = new Polygon();
		propeller.addPoint(490, 180);
		propeller.addPoint(xPosition, yPosition);
		propeller.addPoint(xPosition + 5, yPosition - 5);
		propeller.addPoint(490, 180);
		propeller.addPoint(xPosition + 45, yPosition + 5);
		propeller.addPoint(xPosition + 45, yPosition + 13);
		propeller.addPoint(490, 180);
		propeller.addPoint(xPosition + 18, yPosition + 35);
		propeller.addPoint(xPosition + 10, yPosition + 32);
		g2.fill(propeller);

		g2.setColor(black);
		Polygon propellerEdge = new Polygon();
		propellerEdge.addPoint(490, 180);
		propellerEdge.addPoint(xPosition, yPosition);
		propellerEdge.addPoint(xPosition + 5, yPosition - 5);
		propellerEdge.addPoint(490, 180);
		propellerEdge.addPoint(xPosition + 45, yPosition + 5);
		propellerEdge.addPoint(xPosition + 45, yPosition + 13);
		propellerEdge.addPoint(490, 180);
		propellerEdge.addPoint(xPosition + 18, yPosition + 35);
		propellerEdge.addPoint(xPosition + 10, yPosition + 32);
		g2.draw(propellerEdge);

		g2.setColor(ColorPillar);
		g2.fillOval(484, 176, 10, 10);
		g2.setColor(black);
		g2.drawOval(484, 176, 10, 10);
	}

}
