package object_example;

/**
 * Demonstrates using Circle object.
 */
public class SphereDemo {

    /**
     * Main Method.
     * Run this program by click the "play" button directly
     * left of the main method's header (near the line numbers)
     */
    public static void main(String[] args) {
        Sphere demo = new Sphere(65.4);

        System.out.println("The sphere's radius is " + demo.getRadius());   //Prints the Sphere's radius

        demo.setRadius(104.5);                                              //Changes the Sphere's radius
        System.out.println("The sphere's radius is " + demo.getRadius());   //Prints the Sphere's (new) radius
    }

}
