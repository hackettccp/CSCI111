package object_examples;

/**
 * Demonstrates using Circle object.
 */
class CircleDemo {

    /**
     * Main Method.
     */
    public static void main(String[] args) {
        Circle demo = new Circle();
        demo.color = "Red";                                 //Sets the Circle's color field
        demo.radius = 45;                                   //Sets the Circle's radius field
        System.out.println(demo.toString());                //Prints the String returned by the Circle's toString() method.
    }
}
