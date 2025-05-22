
import java.util.Scanner;

/**
 * Demonstrates while loops.
 */
class Example1_WhileLoops {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                                  //Declares and initializes a Scanner object. Names the Scanner variable keyboard.

        System.out.print("Enter a number between 1 and 10: ");                      //Prompts the user to enter a number between 1 and 10
        int userNumber = Integer.parseInt(keyboard.nextLine());                     //Declares an int variable named userNumber and initializes it with the user's input.

        while(userNumber < 1 || userNumber > 10) {                                  //Begins a while loop. It must iterate as long as the user enters a number outside of the 1-10 range.
            System.out.print("Try again. Enter a number between 1 and 10: ");       //Prompts the user to try entering a number again
            userNumber = Integer.parseInt(keyboard.nextLine());                     //Assigns the user's input to the userNumber variable.
        }

        keyboard.close();                                                           //Releases the hold on the standard input stream
        System.out.println("Thank you. Goodbye!");                                  //Prints a goodbye message letting the user know the program is complete.
    }
    
}
