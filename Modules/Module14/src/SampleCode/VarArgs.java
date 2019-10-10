package SampleCode;

/**
 * Demonstrates variable length arguments.
 */
public class VarArgs {
    
    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        printSum(1, 2, 3);                                                      //Passes 3 arguments to the printSum method
        printSum(2, 4, 6, 8);                                                   //Passes 4 arguments to the printSum method
        printSum(5, 5);                                                         //Passes 2 arguments to the printSum method
        
        int[] values = {3, 5, 7, 9};                                            //Creates an array of 4 ints
        printSum(values);                                                       //Passes the array to the printSum method
    }
    
    /**
     * Prints the total of the values passed as arguments to this method.
     *
     * The vararg parameter allows an unspecified number of int arguments
     * or an int array argument.
     */
    public static void printSum(int... numbers) {
        int total = 0;                                                          //Variable to accumulate the total
        for(int i = 0; i < numbers.length; i++) {                               //Iterates through the vararg, adding up the total of the arguments
            total += numbers[i];
        }
        System.out.println("Total: " + total);                                  //Prints the total that was calculated
    }
    
}
