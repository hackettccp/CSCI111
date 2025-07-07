
import java.util.Scanner;

/**
 * Demonstrates the Binary Search Algorithm
 */
public class Example7_BinarySearch {

    /**
     * Main Method.
     * @param args - Command line arguments.
     */
    public static void main(String[] args) {
        int[] numbers = {3, 7, 9, 15, 18, 24, 31, 45, 67, 82};

        //Prints the array
        printArray(numbers);

        Scanner kb = new Scanner(System.in);

        while(true) {
            //Prompt for number to search for.
            System.out.print("Enter a number to search for (-1 to exit): ");
            int searchVal = kb.nextInt();
            if (searchVal < 0) {
                break;
            }

            //Search the array.
            int foundIndex = binarySearch(numbers, searchVal);

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
     * Performs a binary search.
     * @param a - The array to search.
     * @param v - The value to search for.
     * @return Index where the value was found. Returning -1 indicates it was not found.
     */
    public static int binarySearch(int[] a, int v) {
        //Set the starting boundaries
        int low = 0;
        int high = a.length-1;
        int middle;

        while(low <= high) {
            //Calculate the middle index
            middle = (low + high) / 2;

            if(a[middle] == v) {
                //Found
                return middle;
            }
            else if(a[middle] > v) {
                //Search value is less than the middle (search lower partition)
                high = middle - 1;
            }
            else {
                //search value is greater that the middle (search upper partition)
                low = middle + 1;
            }
        }

        //Search value was not found.
        return -1;
    }
}
