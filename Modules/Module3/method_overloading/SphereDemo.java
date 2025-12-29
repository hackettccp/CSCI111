package method_overloading;

/**
 * Demonstrates using a Sphere object.
 */
public class SphereDemo {

    /**
     * Main Method.
     */
    public static void main(String[] args) {
        Sphere demo = new Sphere(65.4);

        System.out.println("The sphere's radius is " + demo.getRadius());   //Prints the Sphere's radius

        demo.setRadius(14.5);                                               //Changes the Sphere's radius (double argument)
        System.out.println("The sphere's radius is " + demo.getRadius());   //Prints the Sphere's radius

        demo.setRadius("83.214");                                           //Changes the Sphere's radius (String argument)
        System.out.println("The sphere's radius is " + demo.getRadius());   //Prints the Sphere's radius
    }

}
