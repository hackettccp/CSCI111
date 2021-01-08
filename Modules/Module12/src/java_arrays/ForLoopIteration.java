package java_arrays;

import java.util.Scanner;

/**
 * Demonstrates iterating through an array using a for loop.
 */
class ForLoopIteration {
    
    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7};                                                  //Declares an array of ints named numbers. Initializes the array with the values 3, 5 and 7.

        for(int i = 0; i < numbers.length; i++) {                                       //Prints each of the values in the numbers array using a for loop.
            System.out.println(numbers[i]);
        }

        Scanner keyboard = new Scanner(System.in);                                  //Declares and initializes a Scanner object for keyboard input.

        double[] temperatures = new double[4];                                      //Declares an empty array of doubles named temperatures with a length of 4

        for(int i = 0; i < temperatures.length; i++) {                              //Uses a for loop to prompt the user to enter values to be added to the temperatures array.
            System.out.print("Enter a temperature: ");
            temperatures[i] = Double.parseDouble(keyboard.nextLine());
        }

        for(int i = 0; i < temperatures.length; i++) {                              //Prints each of the values in the temperatures array using a for loop.
            System.out.println(temperatures[i]);
        }
    }

}
