package SampleCode.b_circle;

/**
 * This class is used to create instances of Circle objects
 * that have radius, area, and circumference properties/attributes.
 */
public class Circle {

    private int radius;                                         //Field for the Circle's radius
    private double area;                                        //Field for the Circle's area
    private double circumference;                               //Field for the Circle's circumference

    /**
     * Constructor with one argument.
     * Calculates and assigns the area and circumference.
     */
    public Circle(int radiusIn) {
        radius = radiusIn;
        area = Math.pow(Math.PI * radius, 2);
        circumference = 2 * Math.PI * radius;
    }

    /**
     * Returns a string representation of the object.
     */
    public String toString() {
        return "Radius: " + radius + "\nArea: " + area + "\nCircumference: " + circumference;
    }

}
