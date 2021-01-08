package aggregation_example;

/**
 * This class models a bicycle's Tire with a pressure field
 */
public class Tire {

    private int pressure;       //The tire's pressure

    /**
     * Constructor that accepts one int argument
     */
    public Tire(int p) {
        pressure = p;
    }

    /**
     * Gets the tire's pressure
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * Sets the tire's pressure
     */
    public void setPressure(int p) {
        pressure = p;
    }

}
