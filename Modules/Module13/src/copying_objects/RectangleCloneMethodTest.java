package copying_objects;

/**
 * This class demonstrates the Rectangle object's clone method.
 */
class RectangleCloneMethodTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(11, 5);                                                            //Creates an instance of a Rectangle object
        Rectangle r2 = r1.clone();                                                                      //Creates another instance of a Rectangle object using the clone method of an existing Rectangle object

        System.out.println("The first rectangle's length is " + r1.getLength() + " FT");                //Prints information about the first object
        System.out.println("The first rectangle's width is " + r1.getWidth() + " FT");
        System.out.println("The first rectangle's area is " + r1.calculateArea() + " SQFT");
        System.out.println("The first rectangle's perimeter is " + r1.calculatePerimeter() + " FT");

        System.out.println("\nThe second rectangle's length is " + r2.getLength() + " FT");             //Prints information about the second object
        System.out.println("The second rectangle's width is " + r2.getWidth() + " FT");
        System.out.println("The second rectangle's area is " + r2.calculateArea() + " SQFT");
        System.out.println("The second rectangle's perimeter is " + r2.calculatePerimeter() + " FT");

        System.out.println("\nChanging r1's length...");
        r1.setLength(20);                                                                               //Changes r1's length using its setLength method

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
