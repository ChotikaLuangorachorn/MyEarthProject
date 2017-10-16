//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;

public class Vehicle {
	protected int xPosition;
	protected int yPosition;

	public Vehicle(int x, int y) {
		this.xPosition = x;
		this.yPosition = y;

	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
}
