package encapsulation_example;

/**
 * Demonstrates encapsulating and validating data passed to an object.
 */
public class SphereDemo {

    /**
     * Main Method.
     */
    public static void main(String[] args) {
        Sphere demo = new Sphere(-73.65);
        System.out.println("The sphere's radius is " + demo.getRadius()); //Prints the Sphere's radius (1)

        demo.setRadius(-9.25);                                            //Attempts to set the radius to -9.25
        System.out.println("The sphere's radius is " + demo.getRadius()); //Prints the Sphere's radius (1)

        demo.setRadius("-200.13");                                        //Attempts to set the radius to -200.13
        System.out.println("The sphere's radius is " + demo.getRadius()); //Prints the Sphere's radius (1)
    }

}
