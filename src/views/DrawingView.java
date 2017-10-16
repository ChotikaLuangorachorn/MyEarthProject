//5810404928 Chotika Luangorachorn
package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controllers.DrawingController;
import models.EarthComponent;

public class DrawingView {
	private JFrame frame;
	private DetailView detail;
	private DrawingController controller;
	private EarthComponent component;
	private JMenuItem produce, suggestion;
	private JMenuItem red, pink, purple;
	private JMenuItem daytime, nighttime;

	public DrawingView(DrawingController controller) {
		this.controller = controller;
		detail = new DetailView();
		detail.render();
	}

	public void initFrame() {
		frame = new JFrame();
		// ===== Menu Bar =====
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		produce = new JMenuItem("Producer");
		suggestion = new JMenuItem("Suggestion");
		menuFile.add(produce);
		menuFile.add(suggestion);
		menuBar.add(menuFile);
		JMenu menuOption = new JMenu("Option");

		JMenu flag = new JMenu("Flag");
		purple = new JMenuItem("Purple");
		pink = new JMenuItem("Pink");
		red = new JMenuItem("Red");
		flag.add(purple);
		flag.add(pink);
		flag.add(red);
		menuOption.add(flag);

		JMenu time = new JMenu("Time");
		daytime = new JMenuItem("Daytime");
		nighttime = new JMenuItem("Nighttime");
		time.add(daytime);
		time.add(nighttime);
		menuOption.add(time);

		menuBar.add(menuOption);
		frame.setJMenuBar(menuBar);
		// =====================
		Dimension d = new Dimension(700, 700);
		frame.setPreferredSize(d);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.decode("#353535"));
		frame.setTitle("Earth");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		component = controller.initcomponent();
		frame.add(component);
		detail.setBackground(null);
		frame.add(detail, BorderLayout.SOUTH);
		frame.pack();
	}

	public EarthComponent getComponent() {
		return component;
	}

	public void setComponent(EarthComponent component) {
		this.component = component;
	}

	public JMenuItem getProduce() {
		return produce;
	}

	public JMenuItem getSuggestion() {
		return suggestion;
	}

	public JMenuItem getDaytime() {
		return daytime;
	}

	public JMenuItem getNighttime() {
		return nighttime;
	}

	public JFrame getFrame() {
		return frame;
	}

	public DetailView getDetail() {
		return detail;
	}

	public JMenuItem getRed() {
		return red;
	}

	public JMenuItem getPink() {
		return pink;
	}

	public JMenuItem getPurple() {
		return purple;
	}
}