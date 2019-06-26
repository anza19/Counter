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

        //drawing random shapes on the window6;
        surface.drawLine(50, 50, 200, 50);

        //attempting to draw a triangle using drawLine()
        // surface.drawLine(50, 50, 100, 50);
        // surface.drawLine(50, 50, 75, 100);
        // surface.drawLine(75, 100, 100, 50);

        //drawing a polygon

        //this is an array of x-coordinates
        int[] xpoints = {50,100,125,100,50,25};

        //this is an array for y-coordinates
        int[] ypoints = {100,100,75,50,50,75};

        //number of point
        int points = xpoints.length;

        //drawing the polygon itself
        Polygon p = new Polygon(xpoints, ypoints, points);
        surface.drawPolygon(p);
        surface.fillPolygon(p);

    }
} 