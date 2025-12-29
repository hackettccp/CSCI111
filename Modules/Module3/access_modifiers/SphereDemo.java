package access_modifiers;

/**
 * Demonstrates using Circle object.
 */
public class SphereDemo {

    /**
     * Main Method.
     */
    public static void main(String[] args) {
        Sphere demo = new Sphere(65.4);

        System.out.println("The sphere's radius is " + demo.getRadius());   //Prints the Sphere's radius

        demo.setRadius(104.5);                                              //Changes the Sphere's radius
        System.out.println("The sphere's radius is " + demo.getRadius());   //Prints the Sphere's (new) radius
    }

}
