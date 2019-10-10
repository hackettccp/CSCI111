package SampleCode.c_bicycle;

/**
 * This class is used to create instances of Bicycle objects
 * that have properties and behaviors commonly associated with
 * a real-world Bicycle.
 */
public class Bicycle {

    private int gear;                                                                   //Represents what gear the Bicycle is in.
    public final int NUM_WHEELS = 2;                                                    //Represents the number of wheel the Bicycle has.
    private int speed;                                                                  //Represents the current speed the Bicycle is moving.
    private String color;                                                               //Represents the color of the Bicycle.

    /**
     * No Argument Constructor.
     * Sets gear to 1, speed to 0, and color to "Black"
     */
    public Bicycle() {
        gear = 1;
        speed = 0;
        color = "Black";
    }

    /**
     * Constructor.
     * Sets gear with supplied argument, speed to 0, and
     * color to "Black"
     */
    public Bicycle(int gearIn) {
        setGear(gearIn);                                                                //Uses the setGear method to validate the argument
        speed = 0;
        color = "Black";
    }
    
    /**
     * Constructor.
     * Sets gear with supplied argument, speed to 0, and
     * color with supplied argument
     */
    public Bicycle(int gearIn, String colorIn) {
        setGear(gearIn);                                                                //Uses the setGear method to validate the argument
        speed = 0;
        color = colorIn;
    }

    /**
     * Retrieves the value of the gear field.
     */
    public int getGear() {
        return gear;
    }

    /**
     * Assigns a new value to the gear field.
     * Checks the argument is valid before assignment.
     */
    public void setGear(int gearIn) {
        if(isValidGear(gearIn)) {
            gear = gearIn;
        }
        else {
            gear = 1;
        }
    }
    
    /**
     * Checks that the argument is in a valid range of numbers (1 through 10)
     * Since this method is private, it can only be called on in this class.
     */
    private boolean isValidGear(int g) {
	    if(g >= 1 && g <= 10) {                                                         //If in the range of 1-10, return true.
            return true;
	    }
	    return false;
    }
    
    /**
     * Retrieves the value of the color field.
     */
    public String getColor() {
        return color;
    }

    /**
     * Assigns a new value to the color field.
     */
    public void setColor(String colorIn) {
        color = colorIn;
    }
    
    /**
     * Retrieves the value of the speed field.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Increases the speed field by 5 when called.
     */
    public void speedUp() {
        speed += 5;
    }

    /**
     * Decreases the speed field by 5 when called.
     * Additional logic prevents the speed from going negative.
     */
    public void slowDown() {
        if(speed >= 5) {
            speed -= 5;
        }
        else {
            speed = 0;
        }
    }
    

}
