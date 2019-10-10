package SampleCode.c_random_numbers;

import java.util.Random;
import java.util.Scanner;

/**
 * Simulates flipping a coin.
 * 
 * Run the program a few times to perform 10, 100, 1000,
 * and 1000000 flips.
 * 
 * The more flips you do, the closer it should get to 50/50, though it may never
 * be exactly 50/50. After all, you wouldn't expect to flip a coin 500 times 
 * and ALWAYS get exactly 250 heads and 250 tails.
 *
 */
class Example2_CoinToss {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Random myGenerator = new Random();                                          //Instantiates a new Random object to simulate a coin flip.
        int totalHeads = 0;                                                         //Keeps track of the total number of times "heads" was observed.
        int totalTails = 0;                                                         //Keeps track of the total number of times "tails" was observed.

        Scanner keyboard = new Scanner(System.in);                                  //Scanner object for keyboard input.

        int flips = 0;                                                              //This variable will hold a user's input.
        
        while(flips <= 0) {                                                         //Verifies the user's input is non-negative.
            System.out.print("Enter the number of coin flips: ");                   //Prompts the user to enter the number of coin flips.
            flips = Integer.parseInt(keyboard.nextLine());                          //Assigns the flips variable with the user's input.
        }

        for(int i = 1; i <= flips; i++) {                                               //Iterates as many times as the user specified.
            int randomNum = myGenerator.nextInt(2);                                 //Gets a random number between 0 and 1
            if(randomNum == 0) {                                                    //If the number is zero, add one to the value of totalHeads.
                totalHeads++;
            } else {                                                                //If the number is one, add one to the value of totalTails.
                totalTails++;
            }
        }

        System.out.println("Total Heads: " + totalHeads + ", or " + ((double)totalHeads/flips)*100 + "%");
        System.out.println("Total Tails: " + totalTails + ", or " + ((double)totalTails/flips)*100 + "%");
    }

}
