package SampleCode.b_arithmetic;

/**
 * Demonstrates usage of the Math object.
 * 
 * Note 1: The Math object is a special class for completing common math and
 * rounding functions.
 */
class Example6_MathExamples {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        double myValue = 56.76;                                             //Variable used in the demonstrations below

        double myValueRounded = Math.round(myValue);                        //Declares a double variable named myValueRounded
                                                                            //Uses the Math.round method to round myValue
                                                                            //Assigns this value to myValueRounded
                                                                            //Note: .5 or higher is rounded up
        System.out.println("myValueRounded: " + myValueRounded);            //Prints the value of myValueRounded



        double myValueRoundedUp = Math.ceil(myValue);                       //Declares a double variable named myValueRoundedUp
                                                                            //Uses the Math.ceil method to round myValue UP
                                                                            //Assigns this value to myValueRoundedUp
                                                                            //Note: Math.ceil always rounds up.
        System.out.println("myValueRoundedUp: " + myValueRoundedUp);        //Prints the value of myValueRoundedUp



        double myValueRoundedDown = Math.floor(myValue);                    //Declares a double variable named myValueRoundedUp
                                                                            //Uses the Math.floor method to round myValue DOWN
                                                                            //Assigns this value to myValueRoundedDown
                                                                            //Note: Math.floor always rounds down.
        System.out.println("myValueRoundedDown: " + myValueRoundedDown);    //Prints the value of myValueRoundedUp



        double myValueSquared = Math.pow(myValue, 2);                       //Declares a double variable named myValueSquared
                                                                            //Uses the Math.pow method to raise myValue to the power of 2
                                                                            //Assigns this value to myValueSquared
                                                                            //Note: First argument is the base, the second argument is the power
                                                                            //Note: The result is always a double
        System.out.println("myValueSquared: " + myValueSquared);            //Prints the value of myValueSquared



        double myValueCubed = Math.pow(myValue, 3);                         //Declares a double variable named myValueSquared
                                                                            //Uses the Math.pow method to raise myValue to the power of 3
                                                                            //Assigns this value to myValueCubed
        System.out.println("myValueCubed: " + myValueCubed);                //Prints the value of myValueSquared



        double squareRootOfMyValue = Math.sqrt(myValue);                    //Declares a double variable named squareRootOfMyValue
                                                                            //Uses the Math.sqrt to calculate the square root of myValue
                                                                            //Assigns this value to squareRootOfMyValue
                                                                            //Note: The result is always a double.
        System.out.println("squareRootOfMyValue: " + squareRootOfMyValue);  //Prints the value of squareRootOfMyValue
    }

}
