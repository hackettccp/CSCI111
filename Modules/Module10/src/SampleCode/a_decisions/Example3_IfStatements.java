package SampleCode.a_decisions;

import java.util.Scanner;

/**
 * Demonstrates if statements.
 */
class Example3_IfStatements {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                          //Declares and initializes a Scanner object. Names the Scanner variable keyboard.
        System.out.print("Enter the number of seconds: ");                  //Prompts the user to enter a value/number of seconds
        int seconds = Integer.parseInt(keyboard.nextLine());                //Declares an int variable named seconds and initializes it with the user's input.
        

        if(seconds > 60) {                                                  //If the value of the seconds variable is greater than sixty, prints "This is more than one minute."
            System.out.println("This is more than one minute.");
        }

        if(seconds < 60) {                                                  //If the value of the seconds variable is less than sixty, prints "This is less than one minute."
            System.out.println("This is less than one minute.");
        }

        if(seconds == 60) {                                                 //If the value of the seconds variable is equal to sixty, prints "This is one minute."
            System.out.println("This is one minute.");
        }
    }

}
