
import java.util.Random;
import java.util.Scanner;

/**
 * Simulates rolling dice.
 * 
 * Possibilities of each roll:
 * 2 - (1, 1)
 * 3 - (1, 2) (2, 1)
 * 4 - (1, 3) (3, 1) (2, 2)
 * 5 - (1, 4) (4, 1) (2, 3) (3, 2)
 * 6 - (1, 5) (5, 1) (2, 4) (4, 2) (3, 3)
 * 7 - (1, 6) (6, 1) (2, 5) (5, 2) (3, 4) (4, 3)
 * 8 - (2, 6) (6, 2) (5, 3) (3, 5) (4, 4)
 * 9 - (3, 6) (6, 3) (4, 5) (5, 4)
 * 10- (4, 6) (6, 4) (5, 5)
 * 11- (5, 6) (6, 5)
 * 12- (6, 6)
 *
 * There should be about as many 2 totals as 12 totals, 3 totals as 11 totals, etc.
 * The sum of 7 should be the most frequent. (7's not lucky, there's just more ways
 * to make a 7 than any other total with two die)
 * 
 * Run the program a few times to perform 100, 1000, and 1000000 rolls.
 */
class Example4_DiceSim {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Random myGenerator = new Random();                          //Instantiates a new Random object to simulate a dice roll.

        int total2 = 0;                                             //Variables that will hold the totals of each "roll".
        int total3 = 0;
        int total4 = 0;
        int total5 = 0;
        int total6 = 0;
        int total7 = 0;
        int total8 = 0;
        int total9 = 0;
        int total10 = 0;
        int total11 = 0;
        int total12 = 0;

        Scanner keyboard = new Scanner(System.in);                  //Scanner object for keyboard input.

        System.out.print("Enter the number of rolls: ");            //Prompts the user to enter the number of rolls.
        int rolls = Integer.parseInt(keyboard.nextLine());          //This variable will hold the user's input.

        for(int i = 1; i <= rolls; i++) {                           //Iterates as many times as the user specified.
            int firstNumber = myGenerator.nextInt(6) + 1;           //Gets two random numbers between 1 and 6.
            int secondNumber = myGenerator.nextInt(6) + 1;

            int sum = firstNumber + secondNumber;                   //Calculates the sum

            if(sum == 2) {                                          //Increments the appropriate total variable based on the result of the addition.
                total2++;
            }
            else if(sum == 3) {
                total3++;
            }
            else if(sum == 4) {
                total4++;
            }
            else if(sum == 5) {
                total5++;
            }
            else if(sum == 6) {
                total6++;
            }
            else if(sum == 7) {
                total7++;
            }
            else if(sum == 8) {
                total8++;
            }
            else if(sum == 9) {
                total9++;
            }
            else if(sum == 10) {
                total10++;
            }
            else if(sum == 11) {
                total11++;
            }
            else if(sum == 12) {
                total12++;
            }
        }

        keyboard.close();                                           //Releases the hold on the standard input stream
        System.out.println("2: " + total2);                         //Prints the value of each total variable
        System.out.println("3: " + total3);
        System.out.println("4: " + total4);
        System.out.println("5: " + total5);
        System.out.println("6: " + total6);
        System.out.println("7: " + total7);
        System.out.println("8: " + total8);
        System.out.println("9: " + total9);
        System.out.println("10: " + total10);
        System.out.println("11: " + total11);
        System.out.println("12: " + total12);
    }

}
