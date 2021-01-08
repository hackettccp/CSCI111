package multidimensional_arrays;

import java.util.Scanner;

/**
 * Demonstrates multidimensional arrays.
 */
class MultidimensionalArrays {

    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int[][] numbers = {{3, 6, 8},                                                                       //Declares a two dimensional array of ints named numbers.
                           {5, 1, 2},
                           {9, 7, 4}};

        numbers[2][0] = 10;                                                                                 //Changes the value at row 3 column 1 to 10
        numbers[1][2] = 11;                                                                                 //Changes the value at row 2 column 3 to 11
        numbers[0][1] = 12;                                                                                 //Changes the value at row 1 column 2 to 12

        for(int i = 0; i < numbers.length; i++) {                                                           //Controls the row
            for(int j = 0; j < numbers[i].length; j++) {                                                    //Controls the column of the row
                System.out.print(numbers[i][j] + " ");                                                      //Prints and places one space between each number.
            }
            System.out.println();
        }
        

        int[][] values = new int[3][2];                                                                     //Declares an empty two dimensional array of ints with 3 rows and 2 columns named values.

        Scanner keyboard = new Scanner(System.in);                                                          //Declares and instantiates a Scanner object for keyboard input

        for(int i = 0; i < values.length; i++) {                                                            //Controls the row
            for(int j = 0; j < values[i].length; j++) {                                                     //Controls the column of the row
                System.out.print("Enter a number for row " + (i + 1) + " column " + (j + 1) + ": ");        //Prompts for user to input a number
                values[i][j] = Integer.parseInt(keyboard.nextLine());                                       //Puts the user's number at the current row and column
            }
        }

        for(int i = 0; i < values.length; i++) {                                                            //Controls the row
            for(int j = 0; j < values[i].length; j++) {                                                     //Controls the column of the row
                System.out.print(values[i][j] + " ");                                                       //Prints and places one space between each number.
            }
            System.out.println();
        }
    }

}
