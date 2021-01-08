package object_examples;

/**
 * This class models a circle with radius and color fields
 */
class Circle {
    double radius;        //Represents the Circle's radius
    String color;         //Represents the Circle's color

    /**
     * No-Arg Constructor
     */
    Circle() {
        radius = 1;
        color = "Red";
    }

    /**
     * Constructor with one double argument
     */
    Circle(double r) {
        radius = r;
        color = "Red";
    }

    /**
     * Constructor with a double and String arguments
     */
    Circle(double r, String c) {
        radius = r;
        color = c;
    }

    /**
     * Returns a string representation of the object.
     * (Needs the public modifier before the return type)
     */
    public String toString() {
        String text = "Circle radius: " +
                radius +
                " and color: " +
                color;
        return text;
    }

    /**
     * Calculates and returns the area of the circle
     */
    double area() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    /**
     * Calculates and returns the circumference of the circle
     */
    double circumference() {
        double result = 2 * Math.PI * radius;
        return result;
    }

}
