
import java.util.Random;
import java.util.Scanner;

/**
 * Demonstrates the Linear Search Algorithm
 */
public class Example6_LinearSearch {

    /**
     * Main Method.
     * @param args - Command line arguments.
     */
    public static void main(String[] args) {
        int[] numbers = new int[10];

        //Fills the array with random numbers between 1 and 100
        Random r = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(100) + 1;
        }

        //Prints the unsorted array
        printArray(numbers);

        Scanner kb = new Scanner(System.in);

        while(true) {
            //Prompt for number to search for.
            System.out.print("Enter a number to search for (-1 to exit): ");
            int searchVal = kb.nextInt();
            if(searchVal < 0) {
                break;
            }

            //Search the array.
            int foundIndex = linearSearch(numbers, searchVal);

            //Result of search.
            if(foundIndex == -1) {
                System.out.println("Value was not found in the array.\n");
            }
            else {
                System.out.println("Value was found at index " + foundIndex + "\n");
            }

        }

        kb.close();

    }

    /**
     * Prints the contents of an array of integers.
     * @param a - Array to print.
     */
    public static void printArray(int[] a) {
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Performs a linear search.
     * @param a - The array to search.
     * @param v - The value to search for.
     * @return Index where the value was found. Returning -1 indicates it was not found.
     */
    public static int linearSearch(int[] a, int v) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == v) {
                //Value was found at index "i"
                return i;
            }
        }
        //Value was not found, returning -1 (an invalid index)
        return -1;
    }
}
