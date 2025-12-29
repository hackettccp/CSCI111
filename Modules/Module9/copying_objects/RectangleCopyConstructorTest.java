package copying_objects;

/**
 * This class demonstrates the Rectangle object's copy constructor.
 */
class RectangleCopyConstructorTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12, 10);                                                           //Creates an instance of a Rectangle object
        Rectangle r2 = new Rectangle(r1);                                                               //Creates another instance of a Rectangle object using a copy constructor

        System.out.println("The first rectangle's length is " + r1.getLength() + " FT");                //Prints information about the first object
        System.out.println("The first rectangle's width is " + r1.getWidth() + " FT");
        System.out.println("The first rectangle's area is " + r1.calculateArea() + " SQFT");
        System.out.println("The first rectangle's perimeter is " + r1.calculatePerimeter() + " FT");

        System.out.println("\nThe second rectangle's length is " + r2.getLength() + " FT");             //Prints information about the second object
        System.out.println("The second rectangle's width is " + r2.getWidth() + " FT");
        System.out.println("The second rectangle's area is " + r2.calculateArea() + " SQFT");
        System.out.println("The second rectangle's perimeter is " + r2.calculatePerimeter() + " FT");

        System.out.println("\nChanging r1's length...");
        r1.setLength(15);                                                                               //Changes r1's length using its setLength method

        System.out.println("The first rectangle's length is " + r1.getLength() + " FT");                //Prints information about the first object again
        System.out.println("The first rectangle's width is " + r1.getWidth() + " FT");
        System.out.println("The first rectangle's area is " + r1.calculateArea() + " SQFT");
        System.out.println("The first rectangle's perimeter is " + r1.calculatePerimeter() + " FT");

        System.out.println("\nThe second rectangle's length is " + r2.getLength() + " FT");             //Prints information about the second object again
        System.out.println("The second rectangle's width is " + r2.getWidth() + " FT");
        System.out.println("The second rectangle's area is " + r2.calculateArea() + " SQFT");
        System.out.println("The second rectangle's perimeter is " + r2.calculatePerimeter() + " FT");
    }

}
