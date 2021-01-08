package object_equality;

/**
 * This class is used to create instances of Rectangle objects that have length
 * and width properties/attributes.
 */
public class Rectangle {

    private int length;                                         //Field for the Rectangle's length
    private int width;                                          //Field for the Rectangle's width

    /**
     * Constructor with two arguments.
     */
    public Rectangle(int lengthIn, int widthIn) {
        setLength(lengthIn);
        setWidth(widthIn);
    }

    /**
     * Determines if another Rectangle instance is equal to this one.
     * Returns true if the lengths and width match, otherwise returns false.
     */
    public boolean equals(Rectangle otherRectangle) {
        if (otherRectangle.getLength() == length &&
                otherRectangle.getWidth() == width) {
            return true;
        }
        return false;
    }

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

}
