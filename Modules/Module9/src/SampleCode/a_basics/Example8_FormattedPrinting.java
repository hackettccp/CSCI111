package SampleCode.a_basics;

/**
 * Demonstrates the use of the System.out.printf method.
 */
class Example8_FormattedPrinting {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String helloString = "Hello";                //Variables used in the demonstrations below
        String worldString = "World!";
        String dayTypeString = "beautiful";
        int numDays = 31;
        String octoberString = "October";
        char cChar = 'c';
        char pChar = 'p';
        double normalTemp = 98.6;
        int bigNumber = 500000;
        double biggerNumber = 7349508;

        System.out.println("---Example 1---");
        System.out.printf("%s World!%n", helloString);                                            //Demonstrates printf with the string specifier

        System.out.println("---Example 2---");
        System.out.printf("%s %s It's a %s day!%n", helloString, worldString, dayTypeString);     //Demonstrates printf with multiple string specifiers

        System.out.println("---Example 3---");
        System.out.printf("There are %d days in October.%n", numDays);                            //Demonstrates printf with the digit specifier

        System.out.println("---Example 4---");
        System.out.printf("There are %d days in %s.%n", numDays, octoberString);                  //Demonstrates printf with the digit and string specifiers

        System.out.println("---Example 5---");
        System.out.printf("Our college is called %C%C%C!%n", cChar, cChar, pChar);                //Demonstrates printf with the uppercase character specifier

        System.out.println("---Example 6---");
        System.out.printf("A normal body temperature is %f degrees%n", normalTemp);               //Demonstrates printf with the float specifier

        System.out.println("---Example 7---");
        System.out.printf("A normal body temperature is %.2f degrees%n", normalTemp);             //Demonstrates printf to perform rounding

        System.out.println("---Example 8---");
        System.out.printf("%,d is half of a million%n", bigNumber);                               //Demonstrates printf to include commas in a number

        System.out.println("---Example 9---");
        System.out.printf("$%,.2f is a lot of money%n", biggerNumber);                            //Demonstrates printf to perform rounding and include commas in a number
    }

}
