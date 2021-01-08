package aggregation_example;

/**
 * Demonstrates using a Bicycle object.
 */
public class BicycleDemo1 {

    /**
     * Main Method.
     * Run this program by clicking the "play" button directly
     * left of the main method's header (near the line numbers)
     */
    public static void main(String[] args) {
        Bicycle testBike = new Bicycle();

        System.out.println("Speed: " + testBike.getSpeed());
        System.out.println("Back Pressure: " + testBike.getBackPressure());

        testBike.setSpeed(10);
        System.out.println("Speed: " + testBike.getSpeed());

        testBike.setBackPressure(0); 	//Flat Tire
        System.out.println("Speed: " + testBike.getSpeed());

    }

}
