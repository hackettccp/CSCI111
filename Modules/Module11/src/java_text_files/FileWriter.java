package java_text_files;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Demonstrates how to write to a text file.
 *
 * !!!!!IMPORTANT!!!!!
 * After running the program, you'll see OutputFile.txt has been created in java_text_files
 * Double click the file to view its contents.
 */
class FileWriter {

    /**
     * Main Method.
     * Run this program by clicking the "play" button directly
     * left of the main method's header (near the line numbers)
     * The main method needs "throws Exception" at the end because of
     * the PrintWriter constructor being used. Exceptions are covered in more
     * detail in CSCI 112.
     */
    public static void main(String[] args) throws Exception {
        PrintWriter fileWriter = null;                                                         //Declares a PrintWriter object that has scope through the try/catch below

        //This file will be created if it doesn't already exist.
        File fileToWrite = new File("src\\java_text_files\\OutputFile.txt");                   //Instantiates the File object by providing it the path to the file "OutputFile.txt".
        fileWriter = new PrintWriter(fileToWrite);                                             //Instantiates the PrintWriter object by providing it the fileToWrite variable.

        Scanner keyboard = new Scanner(System.in);                                             //Instantiates the Scanner object by providing it System.in (the keyboard) as the source.
        String line;                                                                           //Declares a String variable named line.

        while (true) {
            System.out.print("Enter a line of text (Enter exit to quit): ");                   //Prompts the user to enter a line of text.
            line = keyboard.nextLine();                                                        //Assigns the user's input to the line String variable.
            if (line.equalsIgnoreCase("exit")) {                                               //If the user enters "exit", breaks from the loop.
                break;
            }
            else {                                                                             //Otherwise, the fileWriter variable writes the value of the line variable to the output file.
                fileWriter.println(line);
            }
        }

        fileWriter.close();                                                                     //Calls the fileWriter variable's close method to release and save the file. If you don't close the PrintWriter, your written data will not be saved.
    }

}
