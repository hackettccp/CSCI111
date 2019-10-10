package SampleCode.b_circle;

/**
 * This class demonstrates the behavior of a toString method.
 */
public class CircleTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Circle example = new Circle(10);                                //Creates an instance of a Circle object.
        
        System.out.println(example.toString());                         //Explicit toString call
        System.out.println();
        System.out.println(example);                                    //Implicitly calls toString
    }
    
}
