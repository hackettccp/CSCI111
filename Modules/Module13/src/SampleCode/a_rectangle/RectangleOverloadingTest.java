package SampleCode.a_rectangle;

/**
 * This class demonstrates instances of Rectangle objects.
 * 
 * Run this program as-is and note the output that is printed.
 */
class RectangleOverloadingTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();                                                                     //Instantiates a Rectangle object

        System.out.println("The first rectangle's length is " + r1.getLength() + " FT");                    //Prints information about the object
        System.out.println("The first rectangle's width is " + r1.getWidth() + " FT");
        System.out.println("The first rectangle's area is " + r1.calculateArea()+ " SQFT");
        System.out.println("The first rectangle's perimeter is " + r1.calculatePerimeter() + " FT");

        System.out.println("\nChanging r1's length using a String argument...");
        r1.setLength("15");                                                                                 //Changes r1's length using the overloaded setLength method

        System.out.println("\nThe first rectangle's length is " + r1.getLength() + " FT");                  //Prints information about the object
        System.out.println("The first rectangle's width is " + r1.getWidth() + " FT");
        System.out.println("The first rectangle's area is " + r1.calculateArea()+ " SQFT");
        System.out.println("The first rectangle's perimeter is " + r1.calculatePerimeter() + " FT");
    }
    
}
