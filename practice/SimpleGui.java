import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class SimpleGui {
    
    private static void createWindow() {
        // create and set up the frame/window
        JFrame frame = new JFrame("Simple Swing GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit the application when the window is closed

        // adding a component (a label)
        JLabel textLabel = new JLabel("Hello, World!", SwingConstants.CENTER); // center the text in the label
        textLabel.setPreferredSize(new Dimension(300, 100)); //set the preffered size

        // adding the label to the frame's content
        frame.getContentPane().add(textLabel);

        // size the frame to fit its contents
        frame.pack(); // to adjust the window size based on the components

        // center the window on the screen
        frame.setLocationRelativeTo(null);

        //display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // creating and showing this applications's gui.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createWindow();
            }
        });
    }


}