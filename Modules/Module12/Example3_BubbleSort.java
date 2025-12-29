
import java.util.Random;

/**
 * Demonstrates the Bubble Sort algorithm.
 */
public class Example3_BubbleSort {

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
        System.out.println("Unsorted Array:");
        printArray(numbers);

        bubbleSort(numbers);

        //Prints the sorted array
        System.out.println("Sorted Array:");
        printArray(numbers);

    }

    /**
     * Bubble Sort Algorithm.
     * @param a - The array to sort.
     */
    public static void bubbleSort(int[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 1; j < a.length; j++) {
                if(a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
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
}
