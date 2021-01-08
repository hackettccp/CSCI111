package object_examples;

import java.util.Scanner;

/**
 * Demonstrates using Circle object.
 */
class CircleDemo1 {

    /**
     * Main Method.
     * Run this program by click the "play" button directly
     * left of the main method's header (near the line numbers)
     */
    public static void main(String[] args) {
        Circle demo = new Circle();
        Scanner keyboard = new Scanner(System.in);          //Instantiates a Scanner object for reading standard input

        System.out.print("Enter the circle's color: ");     //Prompts the user to enter the circle's color
        String userColor = keyboard.nextLine();             //Reads the user's entry; Assigns it to userColor variable
        demo.color = userColor;                             //Sets the Circle's color field to the user's input

        System.out.print("Enter the circle's radius: ");     //Prompts the user to enter the circle's radius
        String userRadius = keyboard.nextLine();             //Reads the user's entry; Assigns it to userRadius variable
        demo.radius = Integer.parseInt(userRadius);          //Sets the Circle's radius field to the user's input (converted to an int)

        System.out.println(demo.toString());                //Prints the String returned by the Circle's toString() method.
    }
}
