package Oct.ex_21112024_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab210_HM_Example {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap<>();
        student1.put("Name", "Aniket");
        student1.put("RollNo.", 1012);
        student1.put("Phone No.", 585625745);
        System.out.println(student1);


        Set Book_reed_items = new HashSet<>();
        Book_reed_items.add("Rich dad Poor dad");
        Book_reed_items.add("Sapaiens");
        Book_reed_items.add("sceret");
        Book_reed_items.add("Eat that frog");
        System.out.println(Book_reed_items);
    }
}
