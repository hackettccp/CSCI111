import java.io.File;

/**
 * Demonstrates File object methods.
 */
class Example1_FileMethods {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        File testFile = new File("SampleFile.txt");                                                 //Declares a File object variable named testFile. Instantiates the File object by providing the path to the file.

        String fileName = testFile.getName();                                                       //Initializes the fileName variable with the value returned from calling the getName method on the testFile variable.
        System.out.println("File name: " + fileName);                                               //Prints the value of the fileName String variable

        String fileParent = testFile.getParent();                                                   //Initializes the fileParent variable with the value returned from calling the getParent method on the testFile variable.
        System.out.println("File's parent directory: " + fileParent);                               //Prints the value of the fileParent String variable (will be null)

        String filePath = testFile.getPath();                                                       //Initializes the filePath variable with the value returned from calling the getPath method on the testFile variable.
        System.out.println("File's path: " + filePath);                                             //Prints the value of the filePath String variable

        String fileAbsolutePath = testFile.getAbsolutePath();                                       //Initializes the fileAbsolutePath variable with the value returned from calling the getAbsolutePath method on the testFile variable.
        System.out.println("File's absolute path: " + fileAbsolutePath);                            //Prints the value of the fileAbsolutePath String variable
    }

}
