import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginFrame extends JFrame implements ActionListener {
    // we declare GUI components as private instance variables
    private final JTextField emailField;
    private final JPasswordField passwordField;
    private final JButton loginButton;

    public LoginFrame() {
        // the main window frame
        setTitle("Login - Uzima Borehole System");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the window on the screen

        // creating panel and set layout
        // gridlayout arranges components in a grid, hapa ni rows then columns
        JPanel panel = new JPanel (new GridLayout(3, 2));

        // initialize the components
        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Password:");
        emailField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        // add an actionlistener to the button
        loginButton.addActionListener(this);

        // add components to the panel
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // ts an empty label for de spacing
        panel.add(loginButton);

        // add the panel to the frame's content
        add(panel, BorderLayout.CENTER);

        // display the window
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // this method will be called when the loginButton is clicked
        if (e.getSource() == loginButton) {
            String email = emailField.getText();

            String password = new String(passwordField.getPassword());

            // we set some lil example, database connection later
            if (email.equals("admin@uzima.com")) && password.equals("password123")
                JOptionPane.showMessageDialog(this, "Login successful! Welcome, Welsh.");

                // close de window
                dispose();

                // now open the main dashboard window
                new DashboardFrame();

        } else {
            JOptionPane.showMessageDialog(this, "Invalid email or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
