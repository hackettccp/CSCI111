package object_example;

/**
 * This class models a sphere with a radius field
 */
public class Sphere {

    private double radius;              //Represents the Sphere's radius

    /**
     * Constructor with one double argument
     */
    public Sphere(double r) {
        radius = r;
    }

    /**
     * Accessor method for the radius field
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Mutator method for the radius field
     */
    public void setRadius(double r) {
        radius = r;
    }

}
