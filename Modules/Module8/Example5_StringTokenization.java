import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Demonstrates String Tokenization
 */
public class Example5_StringTokenization {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a date in the following format MM/DD/YYYY: ");
        
        String input = keyboard.nextLine();
        
        StringTokenizer tokens = new StringTokenizer(input, "/");
        
        String month = tokens.nextToken();
        String day = tokens.nextToken();
        String year = tokens.nextToken();
        
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
        
        keyboard.close();
        
    }
}
