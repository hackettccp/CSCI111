package common_array_operations;

/**
 * Demonstrates methods to test the equality of two arrays.
 */
class ArrayEquality {
    
    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int[] numbers1 = {3, 5, 7, 9};                                                          //Declares an array of ints named numbers1. Initializes the array with the values 3, 5, 7 and 9.
        int[] numbers2 = {3, 5, 7, 9};                                                          //Declares an array of ints named numbers2. Initializes the array with the values 3, 5, 7 and 9.

        boolean equal = true;                                                                   //Declares a boolean variable named equal and initializes it with the value true (assumes the arrays are equal)

        if(numbers1.length == numbers2.length) {                                                //Tests if the numbers1 array and the numbers2 array are the same length.
            for(int i = 0; i < numbers1.length; i++) {                                          //This for loop compares each value at corresponding indexes of the two arrays.
                if(numbers1[i] != numbers2[i]) {                                                //If two values at the corresponding index are not the same, set the equal variable to false and break from the loop.
                    equal = false;
                    break;
                }
            }
        }
        else {                                                                                  //The two arrays did not have equal lengths, set the equal variable to false.
            equal = false;
        }

        if(equal) {                                                                             //Prints if the numbers1 and numbers2 array are equal. (The equal variable was not set to false)
            System.out.println("The numbers1 and numbers2 arrays are equal.");
        }
        else {                                                                                  //Otherwise, print the numbers1 and numbers2 array are not equal.
            System.out.println("The numbers1 and numbers2 arrays are not equal.");
        }
    }
    
}
