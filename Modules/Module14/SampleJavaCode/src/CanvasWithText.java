import javax.swing.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *  A Canvas subclass that draws text.
 */
public class CanvasWithText extends Canvas {
   
    /**
     * Overrides the Canvas superclass's paint method.
     * Will instead draw what is specified in this method.
     */
    public void paint(Graphics g) {
        //Draws a String
        g.drawString("Hello World", 60, 50);
        
        //Draws a blue String with a specified font.
        g.setColor(Color.BLUE);
        g.setFont(new Font("Serif", Font.BOLD, 16));
        g.drawString("Hello World!", 200, 50);
        
        //Draws a filled, red 8-sided polygon (octagon)
        //X Coordinates of shape 1
        int[] shape1_x = {110, 150, 190, 190, 150, 110, 70, 70};
        //Y Coordinates fo shape 1
        int[] shape1_y = {70, 70, 110, 150, 190, 190, 150, 110};
        g.setColor(Color.RED);
        g.fillPolygon(shape1_x, shape1_y, 8);
        
        //Draws a white String with a specified font.
        g.setColor(Color.WHITE);
        g.setFont(new Font("Dialog", Font.BOLD, 28));
        g.drawString("STOP", 95, 140);

    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Canvas Example");
        window.setSize(320, 340);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CanvasWithText c = new CanvasWithText();
        window.add(c);
        window.setVisible(true);
    }

}
