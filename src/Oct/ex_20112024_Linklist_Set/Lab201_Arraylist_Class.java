package Oct.ex_20112024_Linklist_Set;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab201_Arraylist_Class {
    public static void main(String[] args) {
        Lab200_Student s1 =new Lab200_Student("Aniket","101");
        Lab200_Student s2 =new Lab200_Student("Sakshi","102");
        Lab200_Student s3 =new Lab200_Student("Pappu","103");

        ArrayList<Lab200_Student> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        s1.printdetails();
        s2.printdetails();
        s3.printdetails();

        System.out.println(myStudent);

    }

}

