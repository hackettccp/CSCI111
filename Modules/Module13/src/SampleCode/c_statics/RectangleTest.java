package SampleCode.c_statics;

/**
 * This class demonstrates static members of Rectangle objects.
 * 
 * Run this program as-is and note the output that is printed.
 */
class RectangleTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8, 9);                                             //Creates an instance of a Rectangle object
	    System.out.println("Total instances = " + r1.getNumberOfInstances());           //Prints the number of instances
	
        Rectangle r2 = new Rectangle(10, 3);                                            //Creates a second instance of a Rectangle object
	    System.out.println("Total instances = " + r1.getNumberOfInstances());           //Prints the number of instances (using r1)

        Rectangle r3 = new Rectangle(6, 4);                                             //Creates a second instance of a Rectangle object
        System.out.println("Total instances = " + Rectangle.getNumberOfInstances());    //Prints the number of instances (using the class)
    }
    
}
