package object_examples;

/**
 * Demonstrates using multiple instances of Rectangle objects.
 */
class RectangleDemo2 {

    /**
     * Main Method.
     */
    public static void main(String[] args) {
        Rectangle demo = new Rectangle();
        Rectangle demo2 = new Rectangle();
        Rectangle demo3 = new Rectangle();
        Rectangle demo4 = new Rectangle();
        demo.width = 4;                     //Sets the Rectangle object's (demo) width field to 4
        demo2.width = 7;                    //Sets the Rectangle object's (demo) width field to 7
        demo3.width = 2;                    //Sets the Rectangle object's (demo) width field to 2
        demo4.width = 8;                    //Sets the Rectangle object's (demo) width field to 8
        System.out.println(demo.width);
        System.out.println(demo2.width);
        System.out.println(demo3.width);
        System.out.println(demo4.width);
    }
}
