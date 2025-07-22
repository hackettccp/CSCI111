import java.util.Scanner;

/**
 * Demonstrates the use of StringBuilder
 */
public class Example3_StringBuilder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String areaCode;
        String exchangeNumber;
        String subscriberNumber;
        
        System.out.print("Enter the 3 digit area code: ");
        areaCode = keyboard.nextLine();
        StringBuilder formattedPhoneNumber = new StringBuilder(areaCode);
        
        System.out.print("Enter the 3 digit exchange: ");
        exchangeNumber = keyboard.nextLine();
        formattedPhoneNumber.append(exchangeNumber);
        
        System.out.print("Enter the 4 digit subscriber number: ");
        subscriberNumber = keyboard.nextLine();
        formattedPhoneNumber.append(subscriberNumber);
        
        //Convert the number entered from XXXXXXXXXX to (XXX) XXX-XXXX
        //First, verify the length of the number entered
        if(formattedPhoneNumber.length() == 10) {
            //Insert the (
            formattedPhoneNumber.insert(0, "(");
            //StringBuilder contents: (XXXXXXXXXX
            
            //Insert the )
            formattedPhoneNumber.insert(4, ")");
            //StringBuilder contents: (XXX)XXXXXXX
            
            //Insert the space
            formattedPhoneNumber.insert(5, " ");
            //StringBuilder contents: (XXX) XXXXXXX
            
            //Insert the -
            formattedPhoneNumber.insert(9, "-");
            //StringBuilder contents: (XXX) XXXXXXX
            
            //Print the formatted phone number
            System.out.println(formattedPhoneNumber.toString());

            keyboard.close();
        }
    }
}
