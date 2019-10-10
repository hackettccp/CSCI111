package SampleCode.b_loops;

/**
 * Demonstrates for loops.
 */
class Example5_ForLoops {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {                             //A for loop that prints the values 1 through 10.
            System.out.println("Loop 1: Count = " + i);
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {                             //A for loop that prints the values of 10 through 1.
            System.out.println("Loop 2: Count = " + i);
        }
        System.out.println();

        for (int i = 0; i <= 20; i += 2) {                          //A for loop that counts by two, printing every other number starting at 1, up through 20.
            System.out.println("Loop 3: Count = " + i);
        }
        System.out.println();

        for (int i = 20; i >= 1; i -= 2) {                          //A for loop that counts by two, printing every other number starting at 20, down through 1.
            System.out.println("Loop 4: Count = " + i);
        }
    }

}
