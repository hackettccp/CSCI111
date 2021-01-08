package SampleCode.b_loops;

import java.util.Scanner;

/**
 * Demonstrates do-while loops.
 * 
 * Note 1: A do-while loop always iterates at least once.
 * 
 */
class Example2_DoWhileLoops {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                          //Declares and initializes a Scanner object. Names the Scanner variable keyboard.

        int userNumber = 0;                                                 //Declares an int variable named userNumber and initializes it with the value 0.

        do {                                                                //Begins a do-while loop. It must iterate as long as the user enters a number outside of the 1-10 range.
            System.out.print("Enter a number between 1 and 10: ");          //Prompts the user to enter a number
            userNumber = Integer.parseInt(keyboard.nextLine());             //Assigns the user's input to the userNumber variable.
        } while(userNumber < 1 || userNumber > 10);

        System.out.println("Thank you. Goodbye!");                          //Prints a goodbye message letting the user know the program is complete.
    }

}
