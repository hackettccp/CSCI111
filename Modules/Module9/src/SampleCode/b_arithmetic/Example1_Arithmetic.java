package SampleCode.b_arithmetic;

/**
 * Demonstrates the arithmetic operators.
 */
class Example1_Arithmetic {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int numApples = 14;
        int numOranges = 7;
        int totalFruit = numApples + numOranges;            //Assigns to totalFruit the sum of numApples and numOranges
        System.out.println(totalFruit);                     //Prints the value of totalFruit (21)


        int stolenFruit = 5;                                //The number of fruit stolen.
        totalFruit = totalFruit - stolenFruit;              //Assigns to totalFruit the difference of totalFruit and stolenFruit
        System.out.println(totalFruit);                     //Prints the new value of totalFruit (16)


        int totalSlices = totalFruit * 2;                   //Assigns to totalSlices the product of totalFruit and 2 (cutting all in half)
        System.out.println(totalSlices);                    //Prints the value of totalSlices (32)
        

        int totalPeople = 11;                               //Total people used to divide the slices up
        int slicesPerPerson = totalSlices / totalPeople;    //Calculates the number of slices per person and assigns the results to totalSlices
        System.out.println(slicesPerPerson);                //Prints the value of slicesPerPerson (2)


        int leftoverSlices = totalSlices % totalPeople;     //Calculates the number of slices left over (the remainder) and assigns the result to leftoverSlices
        System.out.println(leftoverSlices);                 //Prints the value of leftoverSlices (10)
    }
    
}
