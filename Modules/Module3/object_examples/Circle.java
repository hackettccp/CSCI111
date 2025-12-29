package object_examples;

/**
 * This class models a circle with radius and color fields
 */
class Circle {
    double radius;        //Represents the Circle's radius
    String color;         //Represents the Circle's color

    /**
     * Returns a string representation of the object.
     * (Needs the public modifier before the return type)
     */
    public String toString() {
        String text = "Circle radius: " + radius + " and color: " + color;
        return text;
    }

}
