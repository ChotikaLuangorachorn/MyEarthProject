//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class EarthComponent extends JComponent {
	private Earth earth = new Earth();
	private Rocket rocket = new Rocket(350, 190);
	private Satellite satellite = new Satellite(550, 450);
	private Turbine turbine = new Turbine(470, 170, Color.white);
	private Planet planet = new Moon(300, 50);
	private Raft raft = new Raft(210, 210);

	private Apartment apartmentYellow = new Apartment(130, 200, Color.YELLOW);
	private Apartment apartmentOrange = new Apartment(155, 165, Color.decode("#FF8000"));

	private Flag flag = new Flag(500, 280, 540, 280);
	private Flag flagstaff = new Flag(498, 270);

	private BushTree bushRed = new BushTree(Color.red);
	private BushTree bushPink = new BushTree(Color.decode("#FA58AC"));
	private BushTree bushOrange = new BushTree(Color.decode("#FF6600"));

	private Graphics2D g2;
	private ArrayList<Drawable> drawList;

	public EarthComponent() {
		this.drawList = new ArrayList<Drawable>();
		this.drawList.add(planet);
		this.drawList.add(apartmentYellow);
		this.drawList.add(apartmentOrange);
		this.drawList.add(turbine);
		this.drawList.add(bushRed);
		this.bushPink.setxPosition(400);
		this.bushPink.setyPosition(150);
		this.drawList.add(bushPink);
		this.bushOrange.setxPosition(250);
		this.bushOrange.setyPosition(470);
		this.drawList.add(bushOrange);
		this.drawList.add(flag);
		this.drawList.add(flagstaff);
		this.drawList.add(earth);
		this.drawList.add(rocket);
		this.drawList.add(satellite);
		this.drawList.add(raft);
	}

	public void paintComponent(Graphics g) {
		this.g2 = (Graphics2D) g;
		for (Drawable obj : this.drawList) {
			obj.draw(g2);
		}
	}

	public void setRocketY(int y) {
		this.rocket.setyPosition(y);
	}

	public void setRocketFire(Color color) {
		this.rocket.setFireColor(color);
	}

	public void setRaft(int x) {
		this.raft.setxPosition(x);
	}

	public void setApartmentWindow(Color yellow, Color orange) {
		this.apartmentYellow.setWindowColor(yellow);
		this.apartmentOrange.setWindowColor(orange);
	}

	public void setSatelliteXY(int x, int y) {
		this.satellite.setxPosition(x);
		this.satellite.setyPosition(y);
	}

	public void setPlanet(Planet planet) {
		this.planet = planet;
	}

	public void setPlanetXY(int x, int y) {
		this.planet.setxPosition(x);
		this.planet.setyPosition(y);
	}

	public Planet getPlanet() {
		return planet;
	}

	public void setMoonColorSky(Color c) {
		if (this.planet instanceof Moon) {
			Moon moon = (Moon) this.planet;
			moon.setColorSky(c);
		}
	}

	public void setFlagColor(Color c) {
		this.flag.setFlagColor(c);
	}

	public ArrayList<Drawable> getDrawList() {
		return drawList;
	}

}
