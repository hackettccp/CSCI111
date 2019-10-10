package SampleCode.d_arrays_of_objects;

/**
 * Demonstrates an array of Car objects
 */
public class CarArray {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Car[] myCars = new Car[3];

        myCars[0] = new Car("Jeep", "Cherokee", 1994);
        myCars[1] = new Car("Ford", "F-150", 2001);
        myCars[2] = new Car("Subaru", "Outback", 2000);

        System.out.println(myCars[1]);
        System.out.println(myCars[2]);
        System.out.println(myCars[0]);
    }

}
