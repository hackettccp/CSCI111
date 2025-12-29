
import java.util.ArrayList;

/**
 * The ArrayList uses an array as its underlying data structure.
 * The methods of the ArrayList allows us to use an array where we can add, 
 * insert, and remove its elements simply by calling its methods.
 * The ArrayList will also handle increasing and decreasing its array's size automatically.
 */
class Example9_ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(9);

        System.out.println("Contents of list: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.add(0, 6);                                 //Adds/inserts the value 6 at index 0

        System.out.println("Contents of list: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.add(2, 8);                                 //Adds/inserts the value 8 at index 2
        System.out.println("Contents of list: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.remove(1);                                 //Removes the element at index 1
        System.out.println("Contents of list: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


    }
}

