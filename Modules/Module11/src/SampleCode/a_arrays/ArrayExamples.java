package SampleCode.a_arrays;

/**
 * Demonstrates basic array usage.
 */
class ArrayExamples {

    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        double[] temperatures = new double[4];                                  //Declare an empty array of doubles named temperatures with a length of 4

        temperatures[0] = 34.56;                                                //Adds the following values to the temperatures array: 34.56, 56.45, 67.87, 55.12
        temperatures[1] = 56.45;
        temperatures[2] = 67.87;
        temperatures[3] = 55.12;
        System.out.println(temperatures[0]);                                    //Prints each of the values in the temperatures array
        System.out.println(temperatures[1]);
        System.out.println(temperatures[2]);
        System.out.println(temperatures[3]);
        System.out.println(temperatures.length);                                //Prints the length of the temperatures array

        String[] cities = new String[2];                                        //Declares an empty array of Strings named cities with a length of 2.
        cities[0] = "New York";                                                 //Adds the values "New York" and "Philadelphia" to the cities array.
        cities[1] = "Philadelphia";
        System.out.println(cities[0]);                                          //Prints the elements of cities array
        System.out.println(cities[1]);
        System.out.println(cities.length);                                      //Prints the length of the cities array.

        int[] numbers = {3, 5, 7};                                              //Declares an array of ints named numbers. Initializes the array with the values 3, 5 and 7.
        System.out.println(numbers[1]);                                         //Prints the second element of the numbers array.
        numbers[1] = 50;                                                        //Changes the second element of the numbers array to 50.
        System.out.println(numbers[1]);                                         //Prints the second element of the numbers array again

        System.out.println(numbers[2]);                                         //Prints the third element of the numbers array.
        numbers[2] = 75;                                                        //Changes the third element of the numbers array to 75.
        System.out.println(numbers[2]);                                         //Prints the third element of the numbers array again

        System.out.println(numbers.length);                                     //Prints the length of the numbers array.
    }

}
