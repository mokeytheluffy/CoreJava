package Oct.ex_20112024_Linklist_Set;

import java.util.Set;
import java.util.TreeSet;

public class Lab205_TreeSet {
    public static void main(String[] args) {
        // Black and Red Tree mechanism is used to store the element
        // Order will maintain,Natural Sorting is done
        // It will sort the elements in the list in alphabetical order
        Set tree = new TreeSet<>();
        tree.add("Aniket");
        tree.add("Sakshi");
        tree.add("Pappu");
        //tree.add(null);------ NULL is not allowed as sorting for null is not consider for sorting------ code wont run

        System.out.println(tree);

    }
}
