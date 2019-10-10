package SampleCode.b_arithmetic;

/**
 * Demonstrates the augmented assignment operators.
 */
class Example2_AugmentedAssignment {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int myNumber = 13;

        myNumber += 2;                      //Adds 2 to myNumber
        System.out.println(myNumber);       //Prints the value of myNumber (15)

        myNumber -= 6;                      //Subtracts 6 from myNumber
        System.out.println(myNumber);       //Prints the value of myNumber (9)

        myNumber *= 6;                      //Multiplies myNumber by 6
        System.out.println(myNumber);       //Prints the value of myNumber (54)

        myNumber /= 2;                      //Divides myNumber by 2
        System.out.println(myNumber);       //Prints the value of myNumber (27)
    }

}
