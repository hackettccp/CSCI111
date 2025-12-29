package arrays_of_objects;

/**
 * Car Object.
 */
public class Car {

    private String make;
    private String model;
    private int year;
    
    /**
     * Constructor with three arguments.
     */
    public Car(String makeIn, String modelIn, int yearIn) {
        make = makeIn;
        model = modelIn;
        year = yearIn;
    }
    
    /**
     * String representation.
     */
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }

}
