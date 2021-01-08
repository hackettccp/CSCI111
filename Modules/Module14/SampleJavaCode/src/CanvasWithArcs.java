import javax.swing.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *  A Canvas subclass that draws arcs.
 */
public class CanvasWithArcs extends Canvas {
   
    /**
     * Overrides the Canvas superclass's paint method.
     * Will instead draw what is specified in this method.
     */
    public void paint(Graphics g) {
        //Draws a black arc
        //Since the color has not been set, it defaults to black
        //Arc begins at 45 degrees and extends 135 degrees counter-clockwise.
        g.drawArc(30, 30,
                  100, 100,
                  45, 135);
        
        //Draws a blue, filled arc
        //Arc begins at 140 degrees and extends 90 degrees counter-clockwise.
        g.setColor(Color.BLUE);
        g.fillArc(200, 30,
                  100, 100,
                  140, 90);
        
        //Draws a yellow, filled arc
        //Arc begins at 35 degrees and extends 295 degrees counter-clockwise.
        g.setColor(Color.YELLOW);
        g.fillArc(20, 100,
                  100, 100,
                  35, 295);
        
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Canvas Example");
        window.setSize(320, 340);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CanvasWithArcs c = new CanvasWithArcs();
        window.add(c);
        window.setVisible(true);
    }

}
