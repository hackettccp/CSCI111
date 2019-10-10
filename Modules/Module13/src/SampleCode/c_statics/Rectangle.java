package SampleCode.c_statics;

/**
 * This class is used to create instances of Rectangle objects that have length
 * and width properties/attributes.
 */
public class Rectangle {

    private int length;                                         //Field for the Rectangle's length
    private int width;                                          //Field for the Rectangle's width
    private static int numInstances = 0;                        //Static field for the number of instances.

    /**
     * Constructor with two arguments.
     * Increments numInstances by 1 when constructed.
     */
    public Rectangle(int lengthIn, int widthIn) {
        length = lengthIn;
        width = widthIn;
        numInstances += 1;
    }

    /**
     * Method that returns the number of instances of this object.
     */
    public static int getNumberOfInstances() {
        return numInstances;
    }
}
