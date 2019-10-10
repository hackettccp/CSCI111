package SampleCode.a_pyramid;

/**
 * This class demonstrates instances of Pyramid objects.
 */
class PyramidTest2 {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Pyramid example1 = new Pyramid();                                              //Instantiates five Pyramid instances
        Pyramid example2 = new Pyramid(5);
        Pyramid example3 = new Pyramid(3, 6);
        Pyramid example4 = new Pyramid(7, 12, 9);
        Pyramid example5 = new Pyramid(5, 5, 7, "Yellow");
        
        System.out.println("The first pyramid's width is " + example1.width);          //Prints the first instance's fields
        System.out.println("The first pyramid's length is " + example1.length);
        System.out.println("The first pyramid's height is " + example1.height);
        System.out.println("The first pyramid's color is " + example1.color);
        
        System.out.println("\nThe second pyramid's width is " + example2.width);       //Prints the second instance's fields
        System.out.println("The second pyramid's length is " + example2.length);
        System.out.println("The second pyramid's height is " + example2.height);
        System.out.println("The second pyramid's color is " + example2.color);
        
        System.out.println("\nThe third pyramid's width is " + example3.width);        //Prints the third instance's fields
        System.out.println("The third pyramid's length is " + example3.length);
        System.out.println("The third pyramid's height is " + example3.height);
        System.out.println("The third pyramid's color is " + example3.color);
        
        System.out.println("\nThe fourth pyramid's width is " + example4.width);       //Prints the fourth instance's fields
        System.out.println("The fourth pyramid's length is " + example4.length);
        System.out.println("The fourth pyramid's height is " + example4.height);
        System.out.println("The fourth pyramid's color is " + example4.color);
        
        System.out.println("\nThe fifth pyramid's width is " + example5.width);        //Prints the fifth instance's fields
        System.out.println("The fifth pyramid's length is " + example5.length);
        System.out.println("The fifth pyramid's height is " + example5.height);
        System.out.println("The fifth pyramid's color is " + example5.color);
    }
    
}
