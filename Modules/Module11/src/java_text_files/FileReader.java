package java_text_files;

import java.io.File;
import java.util.Scanner;

/**
 * Demonstrates how to read a text file.
 */
class FileReader {

    /**
     * Main Method.
     * Run this program by clicking the "play" button directly
     * left of the main method's header (near the line numbers)
     * The main method needs "throws Exception" at the end because of
     * the Scanner constructor being used. Exceptions are covered in more
     * detail in CSCI 112.
     */
    public static void main(String[] args) throws Exception {
        Scanner fileReader = null;                                                 //Declares a Scanner object that has scope through the try/catch below

        File fileToRead = new File("src\\java_text_files\\SampleFile.txt");        //Instantiates a File object by providing the path to the file.
        fileReader = new Scanner(fileToRead);                                      //Instantiates a Scanner object /by providing it the fileToRead variable as the source.

        String line;                                                               //Declares a String variable named line.

        while (fileReader.hasNextLine()) {                                         //Iterates through the fileReader's file.
            line = fileReader.nextLine();                                          //Assign the line of text from the file to the line String variable.
            System.out.println(line);                                              //The value of the line variable is then printed.
        }

        fileReader.close();                                                         //Calls the fileReader variable's close method to release the file.
    }

}
