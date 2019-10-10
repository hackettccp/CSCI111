package SampleCode.b_arithmetic;

/**
 * Demonstrates narrowing a primitive type.
 */
class Example3_Narrowing {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int firstInt = 10;
        byte firstByte = 0;
        firstByte = (byte)firstInt;         //Narrows the value of firstInt to assign its value to firstByte.
        System.out.println(firstByte);      //Prints the value of firstByte (10)


        int secondInt = 1000;
        byte secondByte = 0;
        secondByte = (byte)secondInt;       //Narrows the value of secondInt to assign its value to secondByte
                                            //1000 is too big, so only the last 8 bits of this 32-bit int value
                                            //will be assigned to secondByte. In this case, these 8 bits will be
                                            //interpreted as -24
        System.out.println(secondByte);     //Prints the value of secondByte (-24)

        
        short firstShort = 0;
        double firstDouble = 45.67;
        firstShort = (short)firstDouble;    //Narrows the value of firstShort to assign its value to firstDouble
                                            //Narrowing a double or float will cause the loss of its fractional value
        System.out.println(firstShort);     //Prints the value of firstShort (45)
    }
    
}
