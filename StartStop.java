import javax.swing.*;
import java.awt.event.*;

public class StartStop {

	public static void main(String[] args) {
	
		JFrame f = new JFrame("SwingApp1");

		JButton start = new JButton("Start");
		JButton stop = new JButton("Stop");
		JLabel label = new JLabel("Press Start.");

		start.setBounds(30, 30, 80, 30);
		stop.setBounds(120, 30, 80, 30);
		label.setBounds(70, 70, 150, 30);

		start.addActionListener(e -> label.setText("Started"));
		stop.addActionListener(e -> label.setText("Stopped"));

		f.setLayout(null);
		f.add(start);
		f.add(stop);
		f.add(label);

		f.setSize(250, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
