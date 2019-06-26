import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingSprite;
    ArrayList<Bouncer> movingSprites;
    //Creating an ArrayList of Bouncers


    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Bouncer firstMovingSprite = new Bouncer(100, 170, box);
        firstMovingSprite.setMovementVector(3, 1);

        Bouncer secondMovingSprite = new Bouncer(110, 180, box);
        secondMovingSprite.setMovementVector(3, 1);

        Bouncer thirdMovingSprite = new Bouncer(120, 190, box);
        thirdMovingSprite.setMovementVector(3, 1);

        //add the sprites to the movingSprites list

        movingSprites = new ArrayList<Bouncer>();
        movingSprites.add(firstMovingSprite);
        movingSprites.add(secondMovingSprite);
        movingSprites.add(thirdMovingSprite);


    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for(int i = 0; i < movingSprites.size();i++){
            movingSprites.get(i).draw(surface);        
        }
    }
}
