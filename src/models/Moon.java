//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;

public class Moon extends Planet {
	private Color colorSky;

	public Moon(int x, int y) {
		super(x, y);
		colorSky = Color.decode("#353535");
	}

	public void draw(Graphics2D g2) {
		g2.setColor(Color.decode("#FFFF00"));
		super.draw(g2);
		g2.setColor(colorSky);
		g2.fillOval(xPosition + 20, yPosition, 50, 50);
	}

	public void setColorSky(Color colorSky) {
		this.colorSky = colorSky;
	}

}
