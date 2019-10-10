package SampleCode.a_basics;

/**
 * Demonstrates constants (variables whose values cannot be changed).
 */
class Example3_Constants {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        final double NORMAL_TEMPERATURE = 98.6;         //Declares a constant double named NORMAL_TEMPERATURE and
                                                        //assigns the value 98.6 to NORMAL_TEMPERATURE

        final float PI = 3.14f;                         //Declares a constant float named PI and assigns the value
                                                        //3.14 to PI

        //NORMAL_TEMPERATURE = 100.0;                   //Compile Error - Attempts to assign a value to a constant
    }
}
