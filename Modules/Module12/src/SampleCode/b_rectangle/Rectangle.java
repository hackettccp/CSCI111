package SampleCode.b_rectangle;

/**
 * This class is used to create instances of Rectangle objects
 * that have length and width properties/attributes.
 */
public class Rectangle {

    private int length;                                         //Field for the Rectangle's length
    private int width;                                          //Field for the Rectangle's width

    /**
     * Sets the object's length.
     * If the argument is less than or equal to zero,
     * the length is defaulted to 1.
     */
    public void setLength(int lengthIn) {
        if (lengthIn <= 0) {
            length = 1;
        }
        else {
            length = lengthIn;
        }
    }

    /**
     * Gets the object's length.
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the object's width.
     * If the argument is less than or equal to zero,
     * the width is defaulted to 1.
     */
    public void setWidth(int widthIn) {
        if (widthIn <= 0) {
            width = 1;
        }
        else {
            width = widthIn;
        }
    }

    /**
     * Gets the object's width.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Calculates and returns the area.
     * Formula used: length * width
     */
    public int calculateArea() {
        int area = length * width;
        return area;
    }

    /**
     * Calculates and returns the perimeter.
     * Formula used: 2 * (length + width)
     */
    public int calculatePerimeter() {
        int perimeter = 2 * (length + width);
        return perimeter;
    }

}
