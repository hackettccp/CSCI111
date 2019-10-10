package SampleCode.a_pyramid;

/**
 * This class demonstrates instances of Pyramid objects.
 * 
 * Run this program as-is and note the output that is printed.
 * Uncomment lines 15-18 and re-run this program. Note that the
 * fields of the object have been set to those values.
 */
class PyramidTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Pyramid example = new Pyramid();                                    //Creates an instance of a Pyramid object.
        /*
        example.width = 3;                                                  //Sets values to the object's fields.
        example.length = 6;
        example.height = 8;
        example.color = "Green";
        */
        System.out.println("The pyramid's width is " + example.width);      //Prints the object's fields
        System.out.println("The pyramid's length is " + example.length);
        System.out.println("The pyramid's height is " + example.height);
        System.out.println("The pyramid's color is " + example.color);
    }

}
