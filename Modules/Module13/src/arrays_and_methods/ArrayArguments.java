package arrays_and_methods;

/**
 * Demonstrates passing an array to a method.
 */
public class ArrayArguments {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d"};

        convertToUppercase(letters);                                    //This method will operate directly on the letters array.

        for(String letter : letters) {                                  //Prints all of the elements of the array.
            System.out.print(letter + " ");
        }

        System.out.println();
    }
    
    /**
     * This method converts the contents of a String array to all uppercase.
     * 
     * When an array is passed to a method as an argument, any modifications are
     * applied to that array. 
     */
    public static void convertToUppercase(String[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
    
}
