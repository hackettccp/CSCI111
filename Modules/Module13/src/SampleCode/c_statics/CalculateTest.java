package SampleCode.c_statics;

/**
 * Demonstrates calling a static function.
 */
public class CalculateTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        System.out.print("The sum of 5 and 6 is ");
        System.out.println(Calculate.add(5, 6));                            //No instance of a Calculate object needed.
    }

}
