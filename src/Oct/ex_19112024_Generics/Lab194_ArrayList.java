package Oct.ex_19112024_Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab194_ArrayList {
    public static void main(String[] args){
        //Collection list = new ArrayList();
        //List list = new ArrayList(); // Dynamic dispatch
        //Array list is a Class
        // It has dynamic size
        // It stores in arrays only
        ArrayList studentlist = new ArrayList();// size is not mentioned
    studentlist.add("Aniket");
    studentlist.add("Sakshi");
        studentlist.add("Jadhav");
        studentlist.add("Sakshi"); // duplicate is allowed
        studentlist.add("Pappu");
        studentlist.add("Pandu");
        studentlist.add(123456);
        studentlist.add (null);
        System.out.println(studentlist);

    }
}