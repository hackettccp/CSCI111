package arrays_of_objects;

/**
 * Demonstrates an array of Rectangle objects
 */
public class RectangleArray {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];                                                              //Array of Rectangle Objects

        rectangles[0] = new Rectangle(5, 6);                                                                    //Puts a new Rectangle instance at index 0
        rectangles[1] = new Rectangle(7, 8);                                                                    //Puts a new Rectangle instance at index 1

        Rectangle example = new Rectangle(9, 10);                                                               //Creates an instance of a Rectangle object referenced by a variable
        rectangles[2] = example;                                                                                //Puts example at index 2 (index 2 and example are shallow copies/have the same reference)

        for(int i = 0; i < rectangles.length; i++) {                                                            //Prints the area and perimeter of each
            System.out.println("Rectangle " + i + " Area: " + rectangles[i].calculateArea());
            System.out.println("Rectangle " + i + " Perimeter: " + rectangles[i].calculatePerimeter());
        }
    }

}
