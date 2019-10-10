package SampleCode.a_basics;

/**
 * Demonstrates the primitive data types of
 * the Java programming language.
 */
class Example2_Variables {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        byte myByteValue;               //Declares a byte named myByteValue
        short myShortValue;             //Declares a short named myShortValue
        int myIntValue;                 //Declares an int named myIntValue
        long myLongValue;               //Declares a long named myLongValue
        float myFloatValue;             //Declares a float named myFloatValue
        double myDoubleValue;           //Declares a double named myDoubleValue
        char myCharValue;               //Declares a char named myCharValue
        boolean myBooleanValue;         //Declares a boolean named myBooleanValue
        

        myByteValue = 8;                //Initializes myByteValue with the value 8
        myShortValue = 16;              //Initializes myShortValue with the value 16
        myIntValue = 32;                //Initializes myIntValue with the value 32
        myLongValue = 64;               //Initializes myLongValue with the value 64
        myFloatValue = 98.6f;           //Initializes myFloatValue with the value 98.6f
        myDoubleValue = 3.14;           //Initializes myDoubleValue with the value 3.14
        myCharValue = 'A';              //Initializes myCharValue with the value 'A'
        myBooleanValue = true;          //Initializes myBooleanValue with the value true


        System.out.println(myByteValue);            //Prints the value of myByteValue
        System.out.println(myIntValue);             //Prints the value of myIntValue
        System.out.println(myCharValue);            //Prints the value of myCharValue
        System.out.println(myBooleanValue);         //Prints the value of myBooleanValue


        int myOtherIntValue = -123;                 //Declares an int named myOtherIntValue AND
                                                    //initializes it with the value -123 (all in one statement)

        double myOtherDoubleValue = 456.789;        //Declares a double named myOtherDoubleValue AND
                                                    //initializes it with the value 456.789 (all in one statement)
        

        System.out.println(myOtherIntValue);        //Prints the value of myOtherIntValue
        System.out.println(myOtherDoubleValue);     //Prints the value of myOtherDoubleValue
    }

}
