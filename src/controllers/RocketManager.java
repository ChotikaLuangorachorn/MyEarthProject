//5810404928 Chotika Luangorachorn
package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.DrawingView;

public class RocketManager implements ActionListener {
	private DrawingView view;
	private int yPosition;

	public RocketManager(DrawingView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
		this.yPosition = 190;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (yPosition % 10 == 0) {
			view.getComponent().setRocketFire(Color.red);
		} else {
			view.getComponent().setRocketFire(Color.orange);
		}
		this.yPosition -= 5;
		if (yPosition < -50) {
			yPosition = 190;
		}
		view.getComponent().setRocketY(yPosition);
		view.getComponent().repaint();
	}
}
