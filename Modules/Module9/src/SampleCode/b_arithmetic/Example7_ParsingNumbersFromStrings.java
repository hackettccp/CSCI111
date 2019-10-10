package SampleCode.b_arithmetic;

/**
 * Demonstrates parsing numeric values from Strings.
 */
class Example7_ParsingNumbersFromStrings {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String children = "10";                                 //A string value representing the number of children
        int numParents = 6;                                     //An int value representing the number of parents

        int numChildren;                                        //Will hold the parsed value from the children string

        numChildren = Integer.parseInt(children);               //Initializes numChildren with the value of the children String (parsed as an int)

        int totalPeople = numParents + numChildren;             //Declares a variable named totalPeople and initializes it with the sum of the numParents and numChildren variables.

        System.out.println("totalPeople: " + totalPeople);      //Prints the value of totalPeople


        String price1Str = "56.42";                             //A string value representing the first price
        double price2 = 34.52;                                  //An double value representing the second price

        double price1;                                          //Will hold the parsed value from the price1Str string

        price1 = Double.parseDouble(price1Str);                 //Initializes price1 with the value of the price1Str String (parsed as a double)

        double totalCost = price1 + price2;                     //Declares a variable named totalCost and initializes it with the sum of the price1 and price2 variables.

        System.out.println("totalCost: " + totalCost);          //Print the value of totalCost
    }

}
