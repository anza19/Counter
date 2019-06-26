import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxes;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {

        //Making motion animation for three boxes

        //firstly, we make 3 instances of the BouncingBox
        BouncingBox firstBox = new BouncingBox(100, 100, Color.MAGENTA);
        firstBox.setMovementVector(1, 2);

        BouncingBox secondBox = new BouncingBox(200, 200, Color.MAGENTA);
        secondBox.setMovementVector(1, 2);

        BouncingBox thirdBox = new BouncingBox(150, 150, Color.MAGENTA);
        thirdBox.setMovementVector(1, 2);

        //we then add them to an arrayList
        boxes = new ArrayList<BouncingBox>();
        
        boxes.add(firstBox);
        boxes.add(secondBox);
        boxes.add(thirdBox);

    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {

        //drawing the box on the window
        //cycle through and animate the motion of the box
        for(int i = 0; i < boxes.size(); i++){
            boxes.get(i).draw(surface);
        }

        // box.draw(surface);

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