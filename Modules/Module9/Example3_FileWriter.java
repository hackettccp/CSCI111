import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Demonstrates how to write to a text file.
 *
 * !!!!!IMPORTANT!!!!!
 * After running the program, you'll see OutputFile.txt has been created
 * Double click the file to view its contents.
 */
class Example3_FileWriter {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) throws Exception {
        //This file will be created if it doesn't already exist.
        File fileToWrite = new File("OutputFile.txt");                                              //Instantiates the File object by providing it the path to the file "OutputFile.txt".
        PrintWriter fileWriter = new PrintWriter(fileToWrite);                                      //Instantiates the PrintWriter object by providing it the fileToWrite variable.

        Scanner keyboard = new Scanner(System.in);                                                  //Instantiates the Scanner object by providing it System.in (the keyboard) as the source.
        String line;                                                                                //Declares a String variable named line.

        while (true) {
            System.out.print("Enter a line of text (Enter exit to quit): ");                        //Prompts the user to enter a line of text.
            line = keyboard.nextLine();                                                             //Assigns the user's input to the line String variable.
            if (line.equalsIgnoreCase("exit")) {                                                    //If the user enters "exit", breaks from the loop.
                break;
            } else {                                                                                //Otherwise, the fileWriter variable writes the value of the line variable to the output file.
                fileWriter.println(line);
            }
        }

    }

}
