package object_example;

/**
 * This class models a Car with a speed field
 */
public class Car {

    private int speed;      //Current speed of the car

    /**
     * No-arg Constructor
     */
    public Car() {
        speed = 0;
    }

    /**
     * Retrieves the speed field
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Increases the speed field by 5
     */
    public void accelerate() {
        speed += 5;
    }

    /**
     * Decreases the speed field by 5
     */
    public void brake() {
        speed -= 5;
    }

}
