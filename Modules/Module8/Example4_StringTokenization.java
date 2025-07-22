import java.util.Scanner;

/**
 * Demonstrates String Tokenization
 */
public class Example4_StringTokenization {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a date in the following format MM/DD/YYYY: ");
        
        String input = keyboard.nextLine();
        
        String[] tokens = input.split("/");
        
        String month = tokens[0];
        String day = tokens[1];
        String year = tokens[2];
        
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
        
        keyboard.close();
        
    }
}