import javax.swing.JFrame;
import javax.swing.JButton;

public class MyGui{
	public static void main(String[] args){
		JFrame frame = new JFrame("Happy Coding");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Hello World!");
		
		frame.add(button);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
