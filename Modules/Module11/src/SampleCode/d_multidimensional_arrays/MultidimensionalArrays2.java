package SampleCode.d_multidimensional_arrays;

/**
 * Demonstrates multidimensional arrays.
 */
class MultidimensionalArrays2 {

    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int[][][] numbers = new int[2][2][3];                                       //Declares an empty three dimensional array of ints with 2 outer rows, 2 inner rows, and 3 columns named numbers.

        numbers[0][0][0] = 3;                                                       //Assigns values to the 3D numbers array
        numbers[0][0][1] = 6;
        numbers[0][0][2] = 8;
        numbers[0][1][0] = 5;
        numbers[0][1][1] = 1;
        numbers[0][1][2] = 2;
        numbers[1][0][0] = 9;
        numbers[1][0][1] = 7;
        numbers[1][0][2] = 4;
        numbers[1][1][0] = 1;
        numbers[1][1][1] = 2;
        numbers[1][1][2] = 3;

        for(int i=0; i<numbers.length; i++) {                                       //Controls the outer row
            for(int j=0; j<numbers[i].length; j++) {                                //Controls the inner row of the outer row
                for(int k=0; k<numbers[i][j].length; k++) {                         //Controls the column of the inner row
                    System.out.print("Outer Row " + (i+1) + ", ");                  //Prints the outer row number
                    System.out.print("Inner Row " + (j+1) + ", ");                  //Prints the inner row number
                    System.out.print("Column " + (k+1) + ": ");                     //Prints the column number
                    System.out.println(numbers[i][j][k]);                           //Prints the value at this index
                }
            }
        }
    }
    
}
