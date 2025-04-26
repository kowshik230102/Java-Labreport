import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/* <applet code="MyGraphicsApplet.class" width="400" height="300"></applet> */

public class MyGraphicsApplet extends Applet {
    public void paint(Graphics g) {
        // Set color and draw a rectangle
        g.setColor(Color.blue);
        g.drawRect(50, 50, 100, 50);

        // Fill oval with red color
        g.setColor(Color.red);
        g.fillOval(200, 50, 100, 50);

        // Draw a line
        g.setColor(Color.green);
        g.drawLine(50, 150, 300, 150);

        // Write some text
        g.setColor(Color.black);
        g.drawString("Hello from Applet!", 120, 200);
    }
}
