//5810404928 Chotika Luangorachorn
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.DrawingView;

public class SatelliteManager implements ActionListener {
	private DrawingView view;
	private int xPosition;
	private int yPosition;
	private boolean moveDirect;

	public SatelliteManager(DrawingView view) {
		this.view = view;
		this.xPosition = 550;
		this.yPosition = 450;
		this.moveDirect = true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (this.moveDirect != true) {
			this.xPosition += 4;
			this.yPosition -= 2;
			if (yPosition <= 450) {
				this.moveDirect = true;
			}
		} else {
			this.xPosition -= 4;
			this.yPosition += 2;
			if (yPosition >= 540) {
				this.moveDirect = false;
			}
		}
		view.getComponent().setSatelliteXY(xPosition, yPosition);
		view.getComponent().repaint();
	}

}
