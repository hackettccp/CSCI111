package SampleCode.a_decisions;

/**
 * Demonstrates the relational operators.
 */
class Example1_RelationalOperators {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 15;
        int value3 = 15;

        boolean result1 = value1 == value2;                     //Declares a boolean variable named result1 and initializes it with result of value1 is equal to value2.
        System.out.println("value1 == value2 is " + result1);   //Prints the value of result1.

        boolean result2 = value1 != value2;                     //Declares a boolean variable named result2 and initializes it with result of value1 is not equal to value2.
        System.out.println("value1 != value2 is " + result2);   //Prints the value of result2.

        boolean result3 = value2 > value3;                      //Declares a boolean variable named result3 and initializes it with result of value2 greater than value3.
        System.out.println("value2 > value3 is " + result3);    //Prints the value of result3.

        boolean result4 = value1 < value2;                      //Declares a boolean variable named result4 and initializes it with result of value1 less than value2.
        System.out.println("value1 < value2 is " + result4);    //Prints the value of result4.

        boolean result5 = value2 >= value3;                     //Declares a boolean variable named result5 and initializes it with result of value2 greater than or equal to value3.
        System.out.println("value2 >= value3 is " + result5);   //Prints the value of result4.

        boolean result6 = value1 <= value2;                     //Declares a boolean variable named result6 and initializes it with result of value1 less than or equal to value2.
        System.out.println("value1 <= value2 is " + result6);   //Prints the value of result6.
    }
    
}
