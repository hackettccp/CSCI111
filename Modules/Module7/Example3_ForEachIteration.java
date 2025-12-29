/**
 * Demonstrates iterating through an array using a for each loop.
 */
class Example3_ForEachIteration {
    
    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7};                          //Declares an array of ints named numbers. Initializes the array with the values 3, 5 and 7.

        for(int number : numbers) {                         //Prints each of the values in the numbers array using a for each loop.
            System.out.println(number);
        }
    }

}
