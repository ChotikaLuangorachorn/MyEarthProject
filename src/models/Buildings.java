//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;

public class Buildings {
	protected int xPosition;
	protected int yPosition;
	protected Color gray;
	protected Color black;

	public Buildings(int x, int y) {
		this.xPosition = x;
		this.yPosition = y;
		this.gray = Color.gray;
		this.black = Color.black;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

}
