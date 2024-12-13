package Oct.ex_20112024_Linklist_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab202_Set {
    public static void main(String[] args) {
        // This three is mostly used while testing
        Set hs = new HashSet<>();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Aniket");
        hs.add("Sakshi");
        hs.add("Pappu");
        hs.add("Pandu");
        System.out.println(hs);
    }
}
