package SampleCode.b_loops;

import java.util.Scanner;

/**
 * Demonstrates nested for loops.
 */
class Example6_NestedLoops {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                  //Declares and initializes a Scanner object. Names the Scanner variable keyboard.

        System.out.print("Enter the number of rows: ");             //Prompts the user to enter the number of rows.
        int rows = Integer.parseInt(keyboard.nextLine());           //Declares an int variable named columns and initializes it with the user's input.

        System.out.print("Enter the number of columns: ");          //Prompts the user to enter the number of columns.
        int columns = Integer.parseInt(keyboard.nextLine());        //Declares an int variable named columns and initializes it with the user's input.

        for(int i = 1; i <= rows; i++) {                                //Iterates from one through the number of rows.
            for(int j = 1; j <= columns; j++) {                         //Inner loop. Iterates from one through the number of columns.
                System.out.print("# ");                             //Prints a # and a space.
            }
            System.out.println();                                   //Prints a blank line before starting the next row
        }
    }
    
}
