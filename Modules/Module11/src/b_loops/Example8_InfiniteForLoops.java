package SampleCode.b_loops;

import java.util.Scanner;

/**
 * Demonstrates infinite "for-ever" loops.
 */
class Example8_InfiniteForLoops {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                                      //Declares and initializes a Scanner object. Names the Scanner variable keyboard.

        for(;;) {                                                                       //Creates an infinite for loop
            System.out.print("Enter any positive number (0 to exit): ");                //Prompts the user to enter any positive number or zero to exit the program.
            int number = Integer.parseInt(keyboard.nextLine());                         //Declares an int variable named number and initializes it with the user's input.

            if(number < 0) {                                                            //If the number is less than 0, restarts the loop using a continue statement.
                System.out.println("That's not a positive number. Try again.");
                continue;
            }

            if(number == 0) {                                                           //If the number is zero, stops the loop using a break statement.
                System.out.println("Exiting.");
                break;
            }

            System.out.println(Math.pow(number, 2));                                    //Prints the number the user entered raised to the second power.
        }

        System.out.println("Goodbye");                                                  //After the for loop is finished, print "Goodbye"
    }
    
}
