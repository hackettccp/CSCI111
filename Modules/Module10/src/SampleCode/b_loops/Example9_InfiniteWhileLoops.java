package SampleCode.b_loops;

import java.util.Scanner;

/**
 * Demonstrates an infinite while loop.
 */
class Example9_InfiniteWhileLoops {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                                      //Declares and initializes a Scanner object. Names the Scanner variable keyboard.
        String input;                                                                   //Declares a String variable named input used to hold the user's input.

        while(true) {                                                                   //Begins an infinite while loop
            System.out.println("Enter a word or phrase (Enter stop to exit): ");        //Prompts the user to enter a word or phrase.
            input = keyboard.nextLine();                                                //Assigns the user's input to the variable input

            if(input.equalsIgnoreCase("stop")) {                            //Breaks out of the loop if the user entered "stop". Ignores upper- or lowercase letters.
                System.out.println("Exiting.");
                break;
            }

            System.out.println("You entered (in all caps) " + input.toUpperCase());     //Prints the user's input in uppercase.
        }

        System.out.println("Goodbye");                                                  //After the for loop is finished, print "Goodbye"
    }
    
}
