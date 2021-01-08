package object_example;

/**
 * Demonstrates using a Car object.
 */
public class CarDemo {

    /**
     * Main Method.
     * Run this program by click the "play" button directly
     * left of the main method's header (near the line numbers)
     */
    public static void main(String[] args) {
        Car testCar = new Car();
        System.out.println("Speed: " + testCar.getSpeed());

        //Calls the accelerate method five times
        for(int i = 0; i < 5; i++) {
            testCar.accelerate();
        }
        System.out.println("Speed: " + testCar.getSpeed());

        //Calls the brake method 3 times
        for(int i = 0; i < 3; i++) {
            testCar.brake();
        }
        System.out.println("Speed: " + testCar.getSpeed());
    }

}
