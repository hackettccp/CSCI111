package SampleCode.c_random_numbers;

import java.util.Random;

/**
 * Simulates one roll of dice.
 *
 */
class Example3_Dice {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Random myGenerator = new Random();                          //Instantiates a new Random object to simulate a dice roll.

        int firstNumber = myGenerator.nextInt(6) + 1;               //Gets a random number between 0 and 5. 1 is added to shift the value to between 1 and 6
        System.out.println("First number: " + firstNumber);         //Prints the number.

        int secondNumber = myGenerator.nextInt(6) + 1;              //Gets another random number between 0 and 5. 1 is added to shift the value to between 1 and 6
        System.out.println("Second number: " + secondNumber);       //Prints the number.

        int sum = firstNumber + secondNumber;                       //Calculates the sum/total

        System.out.println("The total is " + sum);                  //Prints the total
    }

}
