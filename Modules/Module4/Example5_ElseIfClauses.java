
import java.util.Scanner;

/**
 * Demonstrates else-if clauses.
 * 
 */
class Example5_ElseIfClauses {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);              //Declares and initializes a Scanner object. Names the Scanner variable keyboard.
        System.out.print("Enter your test score: ");            //Prompts the user to enter their test score
        int myScore = Integer.parseInt(keyboard.nextLine());    //Declares an int variable named myGrade and initializes it with the user's input.

                                                                //Determines and prints the letter grade for the test score
        if(myScore >= 90) {                                     //Prints A
            System.out.println("Your grade is an A.");
        }
        else if(myScore >= 80 && myScore <= 89) {               //Prints B
            System.out.println("Your grade is a B.");
        }
        else if(myScore >= 70 && myScore <= 79) {               //Prints C
            System.out.println("Your grade is a C.");
        }
        else if(myScore >= 60 && myScore <= 69) {               //Prints D
            System.out.println("Your grade is a D.");
        }
        else {                                                  //Prints F
            System.out.println("Your grade is an F.");
        }
        keyboard.close();                                                   //Releases the hold on the standard input stream
    }

}

