//5810404928 Chotika Luangorachorn
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.DrawingView;

public class RaftManager implements ActionListener {
	private DrawingView view;
	private int xPosition;

	public RaftManager(DrawingView view) {
		this.view = view;
		this.xPosition = 210;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (xPosition == 210) {
			this.xPosition += 1;
		} else {
			this.xPosition = 210;
		}

		view.getComponent().setRaft(xPosition);
		view.getComponent().repaint();

	}

}
