package java_decisions;

/**
 * Demonstrates the Inline If.
 *
 * boolean ? do this : do this instead.
 * 
 */
class Example8_InlineIf {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 15;

        int biggerNumber = firstNumber > secondNumber ? firstNumber : secondNumber;                             //Uses an inline if to assign the larger of the two numbers to biggerNumber.
        System.out.println("First output: " + biggerNumber);                                                    //Prints the larger number

        System.out.println("Second output: " + (firstNumber > secondNumber ? firstNumber : secondNumber));      //Can be done in a method call.
    }
    
}