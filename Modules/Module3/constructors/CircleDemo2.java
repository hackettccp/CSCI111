package constructors;

/**
 * Demonstrates using Circle object.
 */
class CircleDemo2 {

    /**
     * Main Method.
     */
    public static void main(String[] args) {
        Circle demo = new Circle(100.4, "Blue");

        System.out.println(demo.toString());                           //Prints the Circle's String representation

        double a = demo.area();                                        //Gets the calculated area
        System.out.println("The circle's area is " + a);               //Prints the calculated area

        double c = demo.circumference();                               //Gets the calculated circumference
        System.out.println("The circle's circumference is " + c);      //Prints the calculated circumference
        System.out.printf("The circle's circumference is %.2f %n", c); //Prints the calculated circumference (Rounded to two decimal places)
        System.out.printf("The circle's circumference is %.3f", c);    //Prints the calculated circumference (Rounded to three decimal places)
    }
}
