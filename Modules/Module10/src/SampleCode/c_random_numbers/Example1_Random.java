package SampleCode.c_random_numbers;

import java.util.Random;

/**
 * Demonstrates the use of a Random Number Generator.
 */
class Example1_Random {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Random myGenerator = new Random();                                          //Creates a new instance of the Random object. Uses a random seed generated by the JVM.

        int myNumber = myGenerator.nextInt(5);                                      //Declares a variable named myNumber and assign it a random number between 0 and 4 to someNumber.
        System.out.println("The random number selected is " + myNumber);            //Prints the random number

        myNumber = myGenerator.nextInt(10);                                         //Gets a new random number between 0 and 9 and assign to myNumber
        System.out.println("The second random number selected is " + myNumber);     //Prints the random number
    }

}
