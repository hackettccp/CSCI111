
/**
 * This program demonstrates some basic String functions.
 * 
 */
public class Example2_StringMethods {

	public static void main(String[] args) {

		String college = "Community College of Philadelphia";
		
		//length method
		System.out.println("The length of the college String is " + college.length() + " characters.");
		
		//charAt method
		System.out.println("The first character of the college String is " + college.charAt(0));
		System.out.println("The last character of the college String is " + college.charAt(college.length()-1));
		
		//Substring, one parameter
		System.out.println("The substring starting at index 14:" + college.substring(10));
		
		//Substring, two parameters
		System.out.println("The substring starting at index 0 and ending at (but not including) index 10:" + college.substring(0, 10));
		System.out.println("The substring starting at index 10 and ending at (but not including) index 20:" + college.substring(10, 20));
		
		//Remember, ALL characters have indexes... even whitespace.
		System.out.println("The substring starting at index 18 and ending at (but not including) index 26:" + college.substring(18, 26));
		
		//Even though we called all of those methods on our String object, the value of it has not changed
		System.out.println("The original value is still intact: " + college);
	}

}
