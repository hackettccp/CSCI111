package SampleCode.g_arrays_and_methods;

/**
 * Demonstrates returning an array from a method.
 */
public class ReturningArrays {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int[] values = getArray(10);                        //Gets an empty array of ints with a length of 10 from the getArray method
        values[0] = 100;                                    //Assigns values to the array that was returned
        values[1] = 200;
        values[2] = 300;
        values[3] = 400;
        values[4] = 500;
        values[5] = 600;
        values[6] = 700;
        values[7] = 800;
        values[8] = 900;
        values[9] = 1000;
        
        for(int number : values) {                          //Prints all of the values in the array
            System.out.println(number);
        }
    }
    
    /**
     * Returns an empty array of ints with the length specified by an
     * argument to the method.
     */
    public static int[] getArray(int length) {
        int[] array = new int[length];
        return array;
    }
    
}
