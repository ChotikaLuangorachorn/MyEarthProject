//5810404928 Chotika Luangorachorn
package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import models.EarthComponent;
import models.Moon;
import models.Sun;
import views.DrawingView;

public class DrawingController {
	private DrawingView view;
	private Timer roketTime, satelliteTime, planetTime, raftTime;
	private RocketManager rocketManager;
	private SatelliteManager satelliteMannager;
	private PlanetManager planetManager;
	private RaftManager raftManager;

	public void startApp() {
		view = new DrawingView(this);
		view.initFrame();
		this.manageMenubar();
		rocketManager = new RocketManager(view);
		roketTime = new Timer(200, rocketManager);
		roketTime.start();

		satelliteMannager = new SatelliteManager(view);
		satelliteTime = new Timer(200, satelliteMannager);
		satelliteTime.start();

		planetManager = new PlanetManager(view);
		planetTime = new Timer(100, planetManager);

		raftManager = new RaftManager(view);
		raftTime = new Timer(200, raftManager);
		raftTime.start();
	}

	// ===== Manage Menubar =====
	public void manageMenubar() {
		view.getProduce().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Name: Chotika Luangorachorn\nID: 5810404928", "Producer",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		view.getSuggestion().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Option Menu:\n1) Flag : Change flag color.\n  - Pink, Purple, Red\n2) Time : Change time.\n  - Daytime : Show sun, Turn off the light.\n  - Nighttime : Show moon, Turn on the light.",
						"Suggestion", JOptionPane.PLAIN_MESSAGE);
			}
		});
		view.getPink().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getComponent().setFlagColor(Color.pink);
			}
		});
		view.getPurple().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getComponent().setFlagColor(Color.decode("#D100FF"));
			}
		});
		view.getRed().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getComponent().setFlagColor(Color.red);
			}
		});
		view.getDaytime().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getDetail().getTime().setText("Daytime");
				view.getFrame().getContentPane().setBackground(Color.decode("#356F90"));
				view.getComponent().setApartmentWindow(Color.decode("#9A9A9A"), Color.decode("#9A9A9A"));
				view.getComponent().setMoonColorSky(Color.decode("#356F90"));
				if (view.getComponent().getPlanet() instanceof Moon) {
					planetManager.setDown(true);
					planetManager.setPlanet(new Sun(300, 50));
					planetTime.start();
				}
			}
		});
		view.getNighttime().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getDetail().getTime().setText("Nighttime");
				view.getFrame().getContentPane().setBackground(Color.decode("#353535"));
				view.getComponent().setApartmentWindow(Color.yellow, Color.decode("#FF8000"));
				view.getComponent().setMoonColorSky(Color.decode("#353535"));
				if (view.getComponent().getPlanet() instanceof Sun) {
					planetManager.setDown(true);
					planetManager.setPlanet(new Moon(300, 50));
					planetTime.start();
				}
			}
		});
	}

	public EarthComponent initcomponent() {
		EarthComponent component = new EarthComponent();
		return component;

	}
}
