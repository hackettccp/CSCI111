
/**
 * Demonstrates methods to increase the size of an array.
 */
class Example1_ArrayIncreaseSize {
    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String[] cities = {"New York", "Atlanta", "Chicago"};               //Declares an array of Strings named cities. Initializes the cities array with the values New York, Atlanta and Chicago.

        String[] tempCities = new String[cities.length + 2];                //Declares a String array named tempCities with room for 2 more values than the cities array.

        for(int i = 0; i < cities.length; i++) {                            //Deep copies the values from the cities array into the tempCities array using a for loop.
            tempCities[i] = cities[i];
        }
        cities = tempCities;                                                //Makes the cities array variable be a shallow copy of the tempCities array.
        tempCities = null;                                                  //Sets the tempCities array variable to null.

        cities[4] = "Philadelphia";                                         //Adds the value Philadelphia to index 4 of the cities array.

        for(int i = 0; i < cities.length; i++) {                            //Prints all of the elements in the cities array using a for loop.
            System.out.println("City: " + cities[i]);
        }
    }

}