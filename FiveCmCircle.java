import java.awt.Graphics;
import java.applet.Applet;

public class FiveCmCircle extends Applet {

	public void paint(Graphics g) {
	
		int radius = 200;
		int diameter = radius  * 2;

		g.drawOval(50, 50, diameter, diameter);
	}
}
