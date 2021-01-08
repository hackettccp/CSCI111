import javax.swing.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *  A Canvas subclass that draws rectangles.
 */
public class CanvasWithRects extends Canvas {
   
    /**
     * Overrides the Canvas superclass's paint method.
     * Will instead draw what is specified in this method.
     */
    public void paint(Graphics g) {
        //Draws a black, unfilled rectangle
        //Since the color has not been set, it defaults to black
        g.drawRect(40, 40,
                   50, 50);
        
        //Draws a second, unfilled rectangle with a red outline
        g.setColor(Color.RED);
        g.drawRect(200, 40,
                   50, 100);
        
        //Draws a third, filled blue rectangle
        g.setColor(Color.BLUE);
        g.fillRect(20, 140,
                   100, 50);
        
        //Draws a fourth, filled green rectangle
        //Will appear above the blue rectangle because 
        //this was drawn second
        g.setColor(Color.GREEN);
        g.fillRect(40, 160,
                   100, 50);
        
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Canvas Example");
        window.setSize(320, 340);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CanvasWithRects c = new CanvasWithRects();
        window.add(c);
        window.setVisible(true);
    }

}
