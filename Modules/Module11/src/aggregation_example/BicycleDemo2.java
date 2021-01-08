package aggregation_example;

/**
 * Demonstrates using a Bicycle object.
 */
public class BicycleDemo2 {

    /**
     * Main Method.
     * Run this program by clicking the "play" button directly
     * left of the main method's header (near the line numbers)
     */
    public static void main(String[] args) {
        Bicycle testBike = new Bicycle();

        testBike.setBackPressure(0); 	//Flat Tire
        System.out.println("Speed: " + testBike.getSpeed());

        testBike.setSpeed(100);
        System.out.println("Speed: " + testBike.getSpeed());

        testBike.setBackPressure(35);
        testBike.setSpeed(15);
        System.out.println("Speed: " + testBike.getSpeed());
    }

}
