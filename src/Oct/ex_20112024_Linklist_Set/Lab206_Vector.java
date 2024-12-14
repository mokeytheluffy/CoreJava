package Oct.ex_20112024_Linklist_Set;

import java.util.Enumeration;
import java.util.Vector;

public class Lab206_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");

        for (String o : vector) { // We can replace Object = String--- because we have hardcoded String above
            System.out.println(o);
        }
    }
    //For legacy classes Iterator is not allowed
    // Enumeration

    /*Enumeration<String> enumeration = Vector.elements();
    while(enumeration.hasMoreElements())
    {
        System.out.println(enumeration.nextElement());
    }
*/
}
