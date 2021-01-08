package aggregation_example;

/**
 * This class models a Bicycle with a speed field
 */
public class Bicycle {

    private int speed;          //Represents the bicycle's speed
    private Tire front;         //Tire object representing the bicycle's front tire
    private Tire back;          //Tire object representing the bicycle's back tire

    /**
     * No-arg Constructor
     */
    public Bicycle() {
        speed = 0;
        front = new Tire(45);
        back = new Tire(45);
    }

    /**
     * Gets the back tire's pressure
     */
    public int getBackPressure() {
        return back.getPressure();
    }

    /**
     * Sets the back tire's pressure.
     * Will set speed to 0 if the back tire is flat
     */
    public void setBackPressure(int p) {
        back.setPressure(p);
        if(p < 1) {
            speed = 0;
        }
    }

    /**
     * Gets the bicycle's speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the bicycle's speed.
     * Will set speed to 0 if the back tire is flat
     */
    public void setSpeed(int s) {
        if(back.getPressure() > 0) {
            speed = s;
        }
        else {
            speed = 0;
        }

    }

}
