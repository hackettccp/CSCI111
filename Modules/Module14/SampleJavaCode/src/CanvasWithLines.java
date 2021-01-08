import javax.swing.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *  A Canvas subclass that draws lines.
 */
public class CanvasWithLines extends Canvas {
   
    /**
     * Overrides the Canvas superclass's paint method.
     * Will instead draw what is specified in this method.
     */
    public void paint(Graphics g) {
        //Draws a black diagonal line
        //Since the color has not been set, it defaults to black
        g.drawLine(0, 0, 
                   300, 300);
        
        //Draws a second, red diagonal line
        g.setColor(Color.RED);
        g.drawLine(0, 300, 
                   300, 0);
        
        //Draws a green horizontal line
        g.setColor(Color.GREEN);
        g.drawLine(0, 150, 
                   300, 150);
        
        //Draws a blue vertical line
        g.setColor(Color.BLUE);
        g.drawLine(150, 0, 
                   150, 300);
        
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Canvas Example");
        window.setSize(320, 340);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CanvasWithLines c = new CanvasWithLines();
        window.add(c);
        window.setVisible(true);
    }

}
