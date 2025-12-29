package object_equality;

/**
 * This class demonstrates the Rectangle object's copy constructor.
 * (Change the dimensions of one of the Rectangles and re-run to test the output.)
 */
class RectangleEqualityTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(9, 12);                                        //Creates an instance of a Rectangle object
        Rectangle r2 = new Rectangle(9, 12);                                        //Creates a second instance of a Rectangle object

        if(r1.equals(r2)) {                                                         //Determines if the two objects are equal.
            System.out.println("r1 and r2 have the same dimensions");
        }
        else {
            System.out.println("r1 and r2 do not have the same dimensions");
        }
    }

}
