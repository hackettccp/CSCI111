
/**
 * Demonstrates the use of the Character class.
 */
public class Example1_CharacterClass {
    public static void main(String[] args) {
        
        char character = 'C';
        
        //Determine and print:
        //If the character is a letter
        if(Character.isLetter(character)) {
            System.out.println("The char is a letter.");
        }
        //If the character is a digit
        if(Character.isDigit(character)) {
            System.out.println("The char is a digit.");
        }
        //If the character is a lowercase letter
        if(Character.isLowerCase(character)) {
            System.out.println("The char is a lowercase letter.");
        }
        //If the character is an uppercase character
        if(Character.isUpperCase(character)) {
            System.out.println("The char is an uppercase letter.");
        }
        //If the character is whitespace
        if(Character.isWhitespace(character)) {
            System.out.println("The char is whitespace.");
        }
        
    }
}
