import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class DrawGraphics {
    BouncingBox box;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawOval(60, 40, 200, 300);
        int[]x = new int[3];
        int[]y = new int[3];
        int n;  // count of points
        // Make a triangle
        x[0]=100; x[1]=150; x[2]=50;
        y[0]=100; y[1]=150; y[2]=150;
        n = 3;
        Polygon myTri = new Polygon(x, y, n);  // a triangle
        surface.drawPolygon(myTri);
        box.draw(surface);
    }
} 