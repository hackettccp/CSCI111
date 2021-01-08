import javax.swing.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *  A Canvas subclass that draws ovals.
 */
public class CanvasWithOvals extends Canvas {
   
    /**
     * Overrides the Canvas superclass's paint method.
     * Will instead draw what is specified in this method.
     */
    public void paint(Graphics g) {
        //Draws a black, unfilled oval
        //Since the color has not been set, it defaults to black
        g.drawOval(40, 40,
                   50, 50);
        
        //Draws a second, unfilled oval with a red outline
        g.setColor(Color.RED);
        g.drawOval(200, 40,
                   50, 100);
        
        //Draws a third, filled blue oval
        g.setColor(Color.BLUE);
        g.fillOval(20, 140,
                   100, 50);
        
        //Draws a fourth, filled green oval
        //Will appear above the blue oval because 
        //this was drawn second
        g.setColor(Color.GREEN);
        g.fillOval(40, 160,
                   100, 50);
        
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Canvas Example");
        window.setSize(320, 340);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CanvasWithOvals c = new CanvasWithOvals();
        window.add(c);
        window.setVisible(true);
    }

}
