package SampleCode.a_basics;

/**
 * Demonstrates String escape sequences.
 * 
 * Note: The #'s are only to show what happens to the escape character
 * when it is printed. They are not required.
 */
class Example7_EscapeSequences {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String output2 = "slash t #\t# will insert a tabspace";             //Includes a tabspace escape sequence.
        System.out.println(output2);        

        String output1 = "slash n #\n# will insert a new line";             //Includes a newline escape sequence.
        System.out.println(output1);

        String output3 = "slash double quotes #\"# will insert a \"";       //Includes a double quote escape sequence.
        System.out.println(output3);

        String output4 = "slash backslash #\\# will insert a \\";           //Includes a backslash escape sequence.
        System.out.println(output4);
    }

}
