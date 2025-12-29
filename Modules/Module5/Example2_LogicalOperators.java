
/**
 * Demonstrates the logical operators.
 */
class Example2_LogicalOperators {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;

        boolean result1 = b1 && b2;                             //Declares a boolean variable named result1 and initializes it with the result of b1 && b2.
        System.out.println("b1 && b2 is " + result1);           //Prints the value of result1.

        boolean result2 = b1 || b2;                             //Declares a boolean variable named result2 and initializes it with the result of b1 || b2.
        System.out.println("b1 || b2 is " + result2);           //Prints the value of result2.

        boolean result3 = b1 || b2 && b3;                       //Declares a boolean variable named result3 and initializes it with the result of b1 || b2 && b3.
        System.out.println("b1 || b2 && b3 is " + result3);     //Prints the value of result3.

        boolean result4 = (b1 || b2) && b3;                     //Declares a boolean variable named result4 and initializes it with the result of (b1 || b2) && b3.
        System.out.println("(b1 || b2) && b3 is " + result4);   //Prints the value of result4.

        boolean result5 = b1 || !b2 && b3;                      //Declares a boolean variable named result5 and initializes it with the result of b1 || !b2 && b3.
        System.out.println("b1 || !b2 && b3 is " + result5);    //Prints the value of result5.

        boolean result6 = (b1 || !b2) && b3;                    //Declares a boolean variable named result6 and initializes it with the result of (b1 || !b2) && b3.
        System.out.println("(b1 || !b2) && b3 is " + result6);  //Prints the value of result6.
    }
    
}
