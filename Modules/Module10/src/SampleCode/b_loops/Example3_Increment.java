package SampleCode.b_loops;

/**
 * Demonstrates unary addition and subtraction.
 * 
 * When used in prefix, the addition happens first.
 * x = 10;
 * y = 8;
 * x = ++y;
 * x will be 9 and y will be 9
 * 
 * When used in postfix, the addition happens last.
 * x = 10;
 * y = 8;
 * x = y++;
 * x will be 8 and y will be 9
 * 
 * When used alone, it doesn't matter.
 * y = 8;
 * y++ and ++y would both assign y a value of 9
 */
class Example3_Increment {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int amount = 10;                                        //Declares an int variable named amount. Initialize amount with the value 10.
        amount++;                                               //Uses the postfix unary addition operator to add 1 to the value of amount.
        System.out.println("amount = " + amount);               //Prints the value of amount.
        ++amount;                                               //Uses the prefix unary addition operator to add 1 to the value of amount.
        System.out.println("amount = " + amount);               //Prints the value of amount.


        int amount1 = 10;                                       //Declares an int variable named amount1. Initializes amount with the value 10.
        int newAmount1 = amount1++;                             //Declares an int variable named newAmount1. Initializes newAmount1 with the value of amount1 while applying the postfix unary addition operator.
        System.out.println("newAmount1 = " + newAmount1);       //Prints the value of newAmount
        System.out.println("amount1 = " + amount1);             //Prints the value of amount
    }
    
}
