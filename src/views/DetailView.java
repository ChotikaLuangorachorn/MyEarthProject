//5810404928 Chotika Luangorachorn
package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DetailView extends JPanel {
	private JLabel timeTitle, time;
	public DetailView() {
		timeTitle = new JLabel("Time :");
		time= new JLabel("Nighttime");
	}
	public void render(){
		Font font = new Font(null,Font.BOLD, 15);
		timeTitle.setFont(font);
		timeTitle.setForeground(Color.cyan);
		time.setFont(font);
		time.setForeground(Color.CYAN);
		this.add(timeTitle);
		this.add(time);
	}
	public JLabel getTime() {
		return time;
	}
	public void setTime(JLabel time) {
		this.time = time;
	}

}
