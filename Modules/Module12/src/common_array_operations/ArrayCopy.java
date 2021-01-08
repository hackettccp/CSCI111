package common_array_operations;

/**
 * Demonstrates shallow and deep array copying.
 */
class ArrayCopy {
    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String[] cities = {"New York", "Atlanta", "Chicago"};                               //Declares an array of Strings named cities. Initializes the cities array with the values New York, Atlanta, Chicago.

        String[] citiesCopy = cities;                                                       //Creates a shallow copy of the cities array.

        citiesCopy[0] = "Philadelphia";                                                     //Changes the first element of citiesCopy to Philadelphia

        System.out.println(cities[0]);                                                      //Prints the first element of cities array


        double[] scores = {80.5, 75.4, 90.15, 86.75};                                       //Declares an array of doubles named scores containing the values 80.5, 75.4, 90.15 and 86.75.

        double[] deepScores = new double[scores.length];                                    //Declares an array of doubles named deepScores with the same length as the letters array.

        for(int i = 0; i < scores.length; i++) {                                            //Copies each element from the scores array to the corresponding index in the deepScores array using a for loop.
            deepScores[i] = scores[i];
        }

        deepScores[2] = 93.25;                                                              //Changes the third element of the scores array to 93.25

        for(int i = 0; i < scores.length; i++) {                                            //Prints the contents of scores array
            System.out.println("scores array: " + scores[i]);
        }

        for(int i = 0; i < deepScores.length; i++) {                                        //Prints the contents of deepScores array
            System.out.println("deepScores array: " + deepScores[i]);
        }
    }

}