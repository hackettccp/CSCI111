package linear_search;

import java.util.Scanner;
/**
 * Demonstrates a linear search
 */
public class LinearSearchVerbose
{
    public static void main(String[] args) {
        //An array of ints that we will be searching
        int[] numberArray = {10, 16, 3, 18, 22};
        
        //Scanner will be used to pause the algorithm for demonstration
        Scanner keyboard = new Scanner(System.in);
        
        //Prompt for number to search for
        System.out.print("Enter a number to search for: ");
        int searchNum = Integer.parseInt(keyboard.nextLine());

        //When we find the number, we will use this int to hold the number's index.
        //We'll initialize it to negative one, that way we'll know if the number we're looking for isn't found
        int foundIndex = -1;
        
        //Now, we will loop through the array searching for the value
        for(int i = 0; i < numberArray.length; i++) {
            System.out.println("\nChecking index " + i);
            System.out.print("Press enter to continue");
            keyboard.nextLine();
            if(numberArray[i] == searchNum) {
                System.out.println("Found " + searchNum);
                foundIndex = i;
                System.out.println("Breaking from loop");
                break;
            } 
            else {
                System.out.println("Did not find " + searchNum + " here.");
            }
        }
        
        //If foundIndex is still -1, we did not find the number
        if(foundIndex == -1) {
            System.out.println("\nDid not find " + searchNum + " in numberArray");
        } 
        else {
            System.out.println("\nFound " + numberArray[foundIndex] + " at index " + foundIndex);
        }
        System.out.print("Press enter to exit");
        keyboard.nextLine();
    }
}
