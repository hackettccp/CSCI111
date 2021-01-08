package object_examples;

/**
 * Demonstrates using Circle object.
 */
class CircleDemo1 {

    /**
     * Main Method.
     * Run this program by click the "play" button directly
     * left of the main method's header (near the line numbers)
     */
    public static void main(String[] args) {
        Circle demo = new Circle();
        Circle demo2 = new Circle(76.5);
        Circle demo3 = new Circle(100.4, "Blue");

        System.out.println("The first circle's radius is " + demo.radius);
        System.out.println("The first circle's color is " + demo.color);
        System.out.println();
        System.out.println("The second circle's radius is " + demo2.radius);
        System.out.println("The second circle's color is " + demo2.color);
        System.out.println();
        System.out.println("The third circle's radius is " + demo3.radius);
        System.out.println("The third circle's color is " + demo3.color);
    }
}
