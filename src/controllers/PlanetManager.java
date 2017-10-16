//5810404928 Chotika Luangorachorn
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Moon;
import models.Planet;
import models.Sun;
import views.DrawingView;

public class PlanetManager implements ActionListener {
	private DrawingView view;
	private int xPosition;
	private int yPosition;
	private boolean down;
	private Planet planet;

	public PlanetManager(DrawingView view) {
		this.view = view;
		this.xPosition = 300;
		this.yPosition = 50;
		this.down = true;
		this.planet = new Moon(300, 50);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.down == true) {
			if (this.yPosition <= 150) {
				this.yPosition += 5;
				this.xPosition -= 2;
			} else {
				this.down = false;
				this.yPosition = 155;
				this.xPosition = 340;
			}
		} else {
			view.getComponent().setPlanet(planet);
			view.getComponent().getDrawList().set(0, planet);
			if (this.yPosition >= 50) {
				this.yPosition -= 5;
				this.xPosition -= 2;
			}
		}
		this.view.getComponent().setPlanetXY(xPosition, yPosition);
		this.view.getComponent().repaint();
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public void setPlanet(Planet planet) {
		this.planet = planet;
	}

}
