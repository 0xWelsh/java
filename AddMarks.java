import javax.swing.*;
import java.awt.event.*;

public class AddMarks {

	public static void main(String[] args) {
	
		JFrame f = new JFrame("Add Marks");

		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JLabel result = new JLabel("Result:");
		JButton btn = new JButton("Add");

		t1.setBounds(50,50,100,30);
		t2.setBounds(50,90,100,30);
		btn.setBounds(50,130,100,30);
		result.setBounds(50,170,200,30);

		btn.addActionListener(e -> {
		
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			result.setText("Result: " + (a + b));
		});

		f.add(t1); f.add(t2); f.add(btn); f.add(result);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
