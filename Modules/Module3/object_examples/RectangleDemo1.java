package object_examples;

/**
 * Demonstrates using the Rectangle object.
 */
class RectangleDemo1 {

    /**
     * Main Method.
     */
    public static void main(String[] args) {
        Rectangle demo;                     //Declares a Rectangle variable
        demo = new Rectangle();             //Instantiates a Rectangle object

        demo.width = 3;                     //Sets the object's width field to 3
        demo.length = 7;                    //Sets the object's length field to 7
        System.out.println(demo.width);     //Prints the object's width field
        System.out.println(demo.length);    //Prints the object's length field
        demo.length = 18;                   //Sets a new length to the object's length field
        System.out.println(demo.width);     //Prints the object's width field
        System.out.println(demo.length);    //Prints the object's length field
    }
}
