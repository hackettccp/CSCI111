package SampleCode.b_rectangle;

import java.util.Scanner;

/**
 * This class demonstrates instances of Rectangle objects.
 * Run this program as-is and note the output that is printed.
 */
class RectangleTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();                                                                    //Instantiates two Rectangle objects
        Rectangle r2 = new Rectangle();
        
        Scanner keyboard = new Scanner(System.in);                                                         //Scanner object used for keyboard input.

        System.out.print("Enter the length of the first rectangle in feet: ");                             //Prompts for the length and width of the first rectangle
        int len = Integer.parseInt(keyboard.nextLine());
        r1.setLength(len);
        System.out.print("Enter the width of the first rectangle in feet: ");
        int wid = Integer.parseInt(keyboard.nextLine());
        r1.setWidth(wid);

        System.out.print("Enter the length of the second rectangle in feet: ");                            //Prompts for the length and width of the second rectangle
        r2.setLength(Integer.parseInt(keyboard.nextLine()));                                               //Passes the user's inputs (as ints) directly to the setter methods
        System.out.print("Enter the width of the second rectangle in feet: ");
        r2.setWidth(Integer.parseInt(keyboard.nextLine()));

        System.out.println("\nThe first rectangle's length is " + r1.getLength() + " FT");                //Prints information about the first rectangle
        System.out.println("The first rectangle's width is " + r1.getWidth() + " FT");
        System.out.println("The first rectangle's area is " + r1.calculateArea()+ " SQFT");
        System.out.println("The first rectangle's perimeter is " + r1.calculatePerimeter() + " FT");

        System.out.println("\nThe second rectangle's length is " + r2.getLength() + " FT");               //Prints information about the first rectangle
        System.out.println("The second rectangle's width is " + r2.getWidth() + " FT");
        System.out.println("The second rectangle's area is " + r2.calculateArea() + " SQFT");
        System.out.println("The second rectangle's perimeter is " + r2.calculatePerimeter() + " FT");
    }
    
}
