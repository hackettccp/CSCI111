
import java.util.Random;

/**
 * Demonstrates the Insertion Sort algorithm.
 */
public class Example4_InsertionSort {

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

        insertionSort(numbers);

        //Prints the sorted array
        System.out.println("Sorted Array:");
        printArray(numbers);

    }

    /**
     * Insertion Sort Algorithm.
     * @param a - The array to sort.
     */
    public static void insertionSort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > value) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = value;
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

