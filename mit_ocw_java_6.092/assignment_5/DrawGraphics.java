import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class DrawGraphics {
    BouncingBox box;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 200, Color.MAGENTA);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {

        //drawing the box on the window
        box.draw(surface);

        //drawing random shapes on the window
        surface.drawLine(50, 50, 200, 50);

        //attempting to draw a triangle using drawLine()
        surface.drawLine(50, 50, 100, 50);
        surface.drawLine(50, 50, 75, 100);
        surface.drawLine(75, 100, 100, 50);

    }
} 