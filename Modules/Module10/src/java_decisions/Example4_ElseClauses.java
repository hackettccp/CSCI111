package java_decisions;

import java.util.Scanner;

/**
 * Demonstrates else clauses.
 */
class Example4_ElseClauses {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                      //Declares and initializes a Scanner object. Name the Scanner variable keyboard.
        System.out.print("Enter the water temperature: ");              //Prompts the user to enter the water temperature
        int waterTemp = Integer.parseInt(keyboard.nextLine());          //Declares an int variable named waterTemp and initialize it with the user's input.

        if(waterTemp <= 32) {                                           //If the value of the waterTemp variable is less than or equal to 32 prints "The water is frozen."
            System.out.println("The water is frozen.");
        }
        else {                                                          //Else, prints "The water is not frozen."
            System.out.println("The water is not frozen.");
        }

        if(waterTemp >= 212) {                                          //If the value of the waterTemp variable is greater than or equal to 212, prints "The water is boiling."
            System.out.println("The water is boiling.");
        }
        else {                                                          //Else, prints "The water is not boiling."
            System.out.println("The water is not boiling.");
        }
    }

}
