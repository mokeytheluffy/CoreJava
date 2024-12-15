package Oct.ex_21112024_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab212 {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap<>();
        student1.put("Name", "Aniket");
        student1.put("RollNo.", 1012);
        student1.put("Phone No.", 585625745);
        System.out.println(student1);

        Map<String,Object> student2 = new HashMap<>();
        student2.put("Name", "Aniket");
        student2.put("RollNo.", 1012);
        student2.put("Phone No.", 585625745);
        System.out.println(student2);

        List student = new ArrayList<>();
        student.add(student1);
        student.add(student2);
        System.out.println(student);
    }
}
