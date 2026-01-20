import javax.swing.*;

public class StartStop {

	public static void main(String[] args) {
	
		JFrame f = new JFrame("SwingApp");

		JButton start = new JButton("Start");
		JButton stop = new JButton("Stop");
		JLabel label = new JLabel("Press Start.");

		JPanel panel = new JPanel();
		panel.add(start);
		panel.add(stop);
		panel.add(label);

		f.add(panel);
		f.setSize(300,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
