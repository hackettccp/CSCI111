import javax.swing.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *  A Canvas subclass that draws polygons.
 */
public class CanvasWithPolygons extends Canvas {
   
    /**
     * Overrides the Canvas superclass's paint method.
     * Will instead draw what is specified in this method.
     */
    public void paint(Graphics g) {
        //Draws an unfilled, black three-sided polygon (triangle)
        //Since the color has not been set, it defaults to black
        //X Coordinates of shape 1
        int[] shape1_x = {100, 60, 140};
        //Y Coordinates of shape 1
        int[] shape1_y = {20, 100, 100};
        g.drawPolygon(shape1_x, shape1_y, 3);
        
        
        //Draws a filled, green 5-sided polygon (pentagon)
        //X Coordinates of shape 2
        int[] shape2_x = {180, 120, 140, 220, 240};
        //Y Coordinates fo shape 2
        int[] shape2_y = {120, 170, 240, 240, 170};
        g.setColor(Color.GREEN);
        g.fillPolygon(shape2_x, shape2_y, 5);
        
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Canvas Example");
        window.setSize(320, 340);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CanvasWithPolygons c = new CanvasWithPolygons();
        window.add(c);
        window.setVisible(true);
    }
   

}
