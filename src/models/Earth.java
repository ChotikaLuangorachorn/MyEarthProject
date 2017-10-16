//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Earth implements Drawable {

	@Override
	public void draw(Graphics2D g2) {
		g2.setColor(Color.black);
		g2.fillOval(145, 145, 360, 340);
		g2.setColor(Color.decode("#13CEBF"));
		g2.fillOval(150, 150, 350, 330);
		g2.setColor(Color.decode("#18D103"));
		g2.fillArc(250, 270, 80, 200, 190, 140);
		Polygon groundBelow = new Polygon();
		groundBelow.addPoint(245, 461);
		groundBelow.addPoint(255, 466);
		groundBelow.addPoint(265, 470);
		groundBelow.addPoint(280, 474);
		groundBelow.addPoint(290, 476);
		groundBelow.addPoint(300, 479);
		groundBelow.addPoint(320, 480);
		groundBelow.addPoint(260, 400);
		g2.fill(groundBelow);

		g2.fillArc(126, 150, 80, 200, 250, 140);
		Polygon groundLeft = new Polygon();
		groundLeft.addPoint(198, 200);
		groundLeft.addPoint(190, 210);
		groundLeft.addPoint(180, 223);
		groundLeft.addPoint(170, 239);
		groundLeft.addPoint(160, 260);
		groundLeft.addPoint(150, 300);
		groundLeft.addPoint(151, 309);
		groundLeft.addPoint(150, 320);
		groundLeft.addPoint(151, 330);
		groundLeft.addPoint(154, 345);
		groundLeft.addPoint(200, 200);
		g2.fill(groundLeft);

		g2.fillArc(360, 330, 90, 100, 140, 50);
		g2.fillArc(320, 345, 90, 100, 0, 50);

		g2.fillOval(350, 200, 100, 80);
		Polygon groundTop = new Polygon();
		groundTop.addPoint(300, 151);
		groundTop.addPoint(345, 151);
		groundTop.addPoint(370, 155);
		groundTop.addPoint(400, 165);
		groundTop.addPoint(430, 182);
		groundTop.addPoint(460, 209);
		groundTop.addPoint(480, 238);
		groundTop.addPoint(490, 260);
		groundTop.addPoint(500, 300);
		groundTop.addPoint(390, 250);
		groundTop.addPoint(350, 250);
		g2.fill(groundTop);

	}

}
