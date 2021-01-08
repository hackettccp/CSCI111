package SampleCode.b_loops;

/**
 * Demonstrates unary subtraction.
 * 
 * When used in prefix, the subtraction happens first.
 * x = 10;
 * y = 8;
 * x = --y;
 * x will be 7 and y will be 7
 * 
 * When used in postfix, the subtraction happens last.
 * x = 10;
 * y = 8;
 * x = y--;
 * x will be 8 and y will be 7
 * 
 * When used alone, it doesn't matter.
 * y = 8;
 * y-- and --y would both assign y a value of 7
 */
class Example4_Decrement {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int amount = 10;                                        //Declares an int variable named amount. Initialize amount with the value 10.
        amount--;                                               //Uses the postfix unary subtraction operator to subtract 1 from the value of amount.
        System.out.println("amount = " + amount);               //Prints the value of amount.
        --amount;                                               //Uses the prefix unary subtraction operator to subtract 1 from the value of amount.
        System.out.println("amount = " + amount);               //Prints the value of amount.
        

        int amount2 = 20;                                       //Declares an int variable named amount2. Initializes amount2 with the value 20.
        int newAmount2 = amount2--;                             //Declares an int variable named newAmount2. Initializes newAmount with the value of amount2, while applying the postfix unary subtraction operator.
        System.out.println("newAmount2 = " + newAmount2);       //Prints the value of newAmount2
        System.out.println("amount2 = " + amount2);             //Prints the value of amount2
    }
    
}
