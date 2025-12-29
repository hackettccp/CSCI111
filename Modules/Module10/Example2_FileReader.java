import java.io.File;
import java.util.Scanner;

/**
 * Demonstrates how to read a text file.
 */
class Example2_FileReader {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) throws Exception {
        File fileToRead = new File("SampleFile.txt");                                   //Instantiates a File object by providing the path to the file.
        Scanner fileReader = new Scanner(fileToRead);                                   //Instantiates a Scanner object /by providing it the fileToRead variable as the source.

        String line;                                                                    //Declares a String variable named line.

        while (fileReader.hasNextLine()) {                                              //Iterates through the fileReader's file.
            line = fileReader.nextLine();                                               //Assign the line of text from the file to the line String variable.
            System.out.println(line);                                                   //The value of the line variable is then printed.
        }

        fileReader.close();
        
    }

}
