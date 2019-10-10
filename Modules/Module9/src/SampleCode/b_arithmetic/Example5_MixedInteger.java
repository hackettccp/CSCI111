package SampleCode.b_arithmetic;

/**
 * Demonstrates mixed integer operations.
 */
class Example5_MixedInteger {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        byte value1 = 10;
        byte value2 = 20;
        int total1 = value1 + value2;              //Adds value1 and value2 together and assigns to a variable called total1. (The result is an int.)
        System.out.println(total1);                //Prints the value of total1


        byte value3 = 60;
        short value4 = 30;
        int total2 = value3 + value4;               //Adds value3 and value4 together and assigns to a variable called total2. (The result is an int.)
        System.out.println(total2);                 //Prints the value of total2


        float value5 = 90.5f;
        long value6 = 40;
        float total3 = value6 - value5;             //Subtracts value6 from value5 and assigns to a variable called total3. (The result is a float.)
        System.out.println(total3);                 //Prints the value of total3


        float value7 = 15.6f;
        long value8 = 20;
        double value9 = 7.5;
        double total4 = value7 + value8 + value9;   //Adds value7, value8 and value9 together and assigns to a variable called total4. (The result is a double)
        System.out.println(total4);                 //Prints the value of total4
    }
    
}
