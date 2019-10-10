package SampleCode.b_arithmetic;

/**
 * Demonstrates widening a primitive type.
 */
class Example4_Widening {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int firstInt = 0;
        byte firstByte = 20;

        firstInt = firstByte;                   //Widens the value of firstByte/assign its value to firstInt. (No special operations or keywords needed for widening.)
        System.out.println(firstInt);           //Prints the value of firstInt (20)


        double firstDouble = 0.0;
        short firstShort = 15;

        firstDouble = firstShort;               //Widens the value of firstShort/assign its value to firstDouble
        System.out.println(firstDouble);        //Print the value of firstDouble (15.0)
    }

}
