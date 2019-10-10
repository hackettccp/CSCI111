package SampleCode.a_basics;

/**
 * Demonstrates String concatenation and appending.
 */
class Example5_ConcatAndAppend {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String united = "United";
        String states = "States";
        String of = "of";
        String america = "America";

        String usa1;

        usa1 = united + " " + states + " " + of + " " + america;            //Initializes the usa1 variable by...
                                                                            // concatenating the united, states, of and america variables (with spaces)

        System.out.println("Example 1: " + usa1);                           //Prints the value of the usa variable

        

        String usa2;
        usa2 = united;                                                      //Assigns the value of united to usa2

        usa2 = usa2 + " ";                                                  //Appends a space to usa2
        usa2 = usa2 + states;                                               //Appends the value of states to usa2
        usa2 = usa2 + " ";                                                  //Appends a space to usa2

        usa2 += of;                                                         //Appends the value of of to usa2
        usa2 += " ";                                                        //Appends a sapce to usa2
        usa2 += america;                                                    //Appends the value of america to usa2

        System.out.println("Example 2: " + usa2);                           //Prints the value of usa2 variable
    }

}
