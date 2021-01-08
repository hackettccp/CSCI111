package encapsulation_example;

/**
 * This class models a sphere with a radius field
 */
public class Sphere {

    private double radius;              //Represents the Sphere's radius

    /**
     * Constructor with one double argument
     */
    public Sphere(double r) {
        validateRadius(r);
    }

    /**
     * Accessor method for the radius field
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Mutator method for the radius field using a double argument
     */
    public void setRadius(double r) {
        validateRadius(r);
    }

    /**
     * Mutator method for the radius field using a String argument
     */
    public void setRadius(String r) {
        validateRadius(Double.parseDouble(r));
    }

    /**
     * Validates a new radius before assigning it to the radius field
     */
    private void validateRadius(double r) {
        if(r > 0) {
            radius = r;
        }
        else {
            radius = 1;
        }
    }

}
