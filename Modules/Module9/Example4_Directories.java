import java.io.File;

/**
 * Demonstrates using a File object as a directory.
 *
 * !!!!Uses the TestDirectory folder located in the Module 9 folder.!!!!
 */
class Example4_Directories {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {

        File directory = new File("TestDirectory");                             //Instantiates the File object by providing it the directory name "TestDirectory".

        System.out.println("---File Names (Strings)---");

        String[] fileNames = directory.list();                                  //This array contains only the names (Strings) of the directory's contents.

        for (String fileName : fileNames) {                                     //Each iteration of the loop, it prints the value of the fileName variable.
            System.out.println(fileName);
        }

        System.out.println("---File Names (File Objects)---");
        
        File[] files = directory.listFiles();                                   //This array contains files/folders (all File objects) of the directory's contents.

        for (File file : files) {
            System.out.print(file.getName());                                   //Each iteration of the loop, it prints the file's name by calling the getName method on the file variable.
            if(file.isFile()) {
                System.out.println(" : This is a file.");                       //Prints if this is a file
            }
            if(file.isDirectory()) {
                System.out.println(" : This is a directory/folder.");           //Prints if this is a directory
            }
        }
    }
}
