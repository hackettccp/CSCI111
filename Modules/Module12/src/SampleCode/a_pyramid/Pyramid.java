package SampleCode.a_pyramid;

/**
 * This class is used to create instances of Pyramid objects
 * that have width, length, height, and color properties/attributes.
 */
class Pyramid {

    int width;                              //Field for the Pyramid's width
    int length;                             //Field for the Pyramid's length
    int height;                             //Field for the Pyramid's height
    String color;                           //Field for the Pyramid's color

    /**
     * Constructor with no arguments.
     */
    Pyramid() {
        width = 1;
        length = 1;
        height = 5;
        color = "White";
    }
    
    /**
     * Constructor with one argument for setting
     * the width.
     */
    Pyramid(int widthIn) {
        width = widthIn;
        length = 1;
        height = 5;
        color = "White";
    }

    /**
     * Constructor with two arguments for setting
     * the width and length
     */
    Pyramid(int widthIn, int lengthIn) {
        width = widthIn;
        length = lengthIn;
        height = 5;
        color = "White";
    }

    /**
     * Constructor with three arguments for setting
     * the width, length, and height.
     */
    Pyramid(int widthIn, int lengthIn, int heightIn) {
        width = widthIn;
        length = lengthIn;
        height = heightIn;
        color = "White";
    }

    /**
     * Constructor with four arguments for setting all four fields
     */
    Pyramid(int widthIn, int lengthIn, int heightIn, String colorIn) {
        width = widthIn;
        length = lengthIn;
        height = heightIn;
        color = colorIn;
    }

}
