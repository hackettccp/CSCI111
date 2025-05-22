
import java.util.Scanner;

/**
 * Demonstrates loop branching statements (break and continue).
 */
class Example7_LoopBranching {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                  //Declares and initializes a Scanner object. Names the Scanner variable keyboard.

        System.out.print("Enter a number between 1 and 10: ");      //Prompts the user to enter a number between 1 and 10
        int stopNumber = Integer.parseInt(keyboard.nextLine());     //Declares an int variable named stopNumber and initializes it with the user's input.

        for(int i = 1; i <= 10; i++) {                              //Iterates for every number from 1 through 10.
            if(i == stopNumber) {                                   //Break from the loop if the counter equals the user's number.
                break;
            }
            System.out.println(i);                                  //Prints the value of the counter.
        }

        System.out.println();                                       //Prints a blank line.

        for(int i = 1; i <= 10; i++) {                              //Iterates for every number from 1 through 10.
            if(i == 2 || i == 3 || i == 5 || i == 7) {              //Begins the next iteration if the counter is a prime number.
                continue;
            }
            System.out.println(i);                                  //Prints the value of the counter.
        }
        keyboard.close();                                           //Releases the hold on the standard input stream
    }
    
}
