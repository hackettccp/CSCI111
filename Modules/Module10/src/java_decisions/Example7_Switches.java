package java_decisions;

import java.util.Scanner;
/**
 * Demonstrates a switch statement.
 */
class Example7_Switches {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                              //Declares and initializes a Scanner object. Name the Scanner variable keyboard.
        System.out.print("Enter a number between 1 and 10: ");                  //Prompts the user to enter a number between 1 and 10
        int number = Integer.parseInt(keyboard.nextLine());                     //Declares an int variable named number and initializes it with the user's input

        if(number < 1 || number > 10) {                                         //Checks that the user's input is valid.
            System.out.println("Error. Enter a number between 1 and 10");       //Prints an error message
            System.exit(0);                                              //Stops the program
        }

        switch(number) {
            case 2:                                                             //Falls through to case 3
            case 3:                                                             //Falls through to case 5
            case 5:                                                             //Falls through to case 7
            case 7: System.out.println("This is a prime number");               //Prints the number is prime
                    break;                                                      //Does not fall through
            default: System.out.println("This is not a prime number");          //Prints the number is not prime
        }
    }
    
}
