import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {
    
    public DashboardFrame() {
        setTitle("Admin Dashboard - Uzima Borehole System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // a JTabbedPane to manage multiple panels or views
        JTabbedPane tabbedPane = new JTabbedPane();

        // now we create the individual panels for each tab
        // these classes are the placeholders where the logic will reside
        JPanel registerClientPanel = new RegisterClientPanel();
        JPanel manageClientPanel = new ManageClientPanel();
        JPanel calculationPanel = new CalculationPanel();
        JPanel reportsPanel = new ReportsPanel();

        // add the panels to the tabbed pane with titles
        tabbedPane.addTab("Register Client", registerClientPanel);
        tabbedPane.addTab("Manage Clients", manageClientPanel);
        tabbedPane.addTab("Calculate Costs", calculationPanel);
        tabbedPane.addTab = new ReportsPanel();

        // we add the panels to the tabbed pane with titles
        tabbedPane.addTab("Register Client", registerClientPanel);
        tabbedPane.addTab("Manage Clients", manageClientPanel);
        tabbedPane.addTab("Calculate Costs" calculationPanel);
        tabbedPane.addTab("General Reports", reportsPanel);


        // add the tabbed pane to the main frame
        add(tabbedPane, BorderLayout.CENTER);

        setVisible(true);
    }
}