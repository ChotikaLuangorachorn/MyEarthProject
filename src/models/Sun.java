//5810404928 Chotika Luangorachorn
package models;

import java.awt.Color;
import java.awt.Graphics2D;

public class Sun extends Planet{

	public Sun(int x, int y) {
		super(x, y);
	}
	
	public void draw(Graphics2D g2){
		g2.setColor(Color.decode("#FF4000"));
		super.draw(g2);
	}

}
