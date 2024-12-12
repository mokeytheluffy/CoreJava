package Oct.ex_19112024_Generics;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;

public class Lab195_Arraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1"); // 0
        list.add("2"); //1
        list.add("3"); //2
        list.add("4"); //3
        list.add("5"); //4

        System.out.println(list.size());
        System.out.println(list.contains("3"));
        System.out.println(list.isEmpty()); //Int Check
        System.out.println(list.indexOf("2")); // Find the first acc of element in list


    }
}
