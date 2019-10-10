package SampleCode.c_bicycle;

/**
 * Demonstrates the use of the Bicycle Object.
 */
public class BicycleTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Bicycle testBike = new Bicycle(6, "Red");                                               //Creates an instance of a Bicycle object.

        System.out.println("The bicycle's speed is " + testBike.getSpeed() + "MPH");            //Prints the object's current speed

        System.out.println("Pedaling...");
        for(int i = 0; i < 3; i++) {                                                            //Increases the speed 3 times
            testBike.speedUp();
        }

        System.out.println("The bicycle's speed is now " + testBike.getSpeed() + "MPH");        //Prints the object's current speed

        System.out.println("Braking...");                                                       //Decreasing the speed once
        testBike.slowDown();

        System.out.println("The bicycle's speed is now " + testBike.getSpeed() + "MPH");        //Prints the object's current speed

        System.out.println("Braking again...");
        for(int i = 0; i < 3; i++) {                                                            //Decreases the speed 3 times
            testBike.slowDown();
        }

        System.out.println("The bicycle's speed is now " + testBike.getSpeed() + "MPH");        //Prints the object's current speed (should be 0, not -5)
    }

}
