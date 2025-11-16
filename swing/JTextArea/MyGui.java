import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyGui{
	public static void main(String[] args){
		JFrame frame = new JFrame("Happy Coding");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea textArea = new JTextArea("It was the best of times, it was the worst of times...");
		frame.add(textArea);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
