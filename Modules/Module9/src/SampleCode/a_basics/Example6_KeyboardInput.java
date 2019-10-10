package SampleCode.a_basics;

import java.util.Scanner;

/**
 * Demonstrates the use of a Scanner object to get keyboard input
 * from a user.
 */
class Example6_KeyboardInput {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);              //Declare and initialize a Scanner object for getting keyboard input.
                                                                //The Scanner variable here is named keyboard.

        System.out.print("Enter your name: ");                  //Prompts the user to enter their name
        String name = keyboard.nextLine();                      //Assigns their input to a String variable named name

        System.out.print("Enter your street address: ");        //Prompt the user to enter their street address
        String address = keyboard.nextLine();                   //Assign their input to a String variable named address
        
        System.out.print("Enter your city: ");                  //Prompt the user to enter their city
        String city = keyboard.nextLine();                      //Assign their input to a String variable named city

        System.out.print("Enter your state: ");                 //Prompt the user to enter their state
        String state = keyboard.nextLine();                     //Assign their input to a String variable named state

        System.out.print("Enter your zip code: ");              //Prompt the user to enter their zip code
        String zipCode = keyboard.nextLine();                   //Assign their input to a String variable named zipCode


        System.out.println(name);                                   //Prints the user's name
        System.out.println(address);                                //Prints their street address
        System.out.println(city + ", " + state + " " + zipCode);    //Prints their  city, state, and zip Code
    }

}
