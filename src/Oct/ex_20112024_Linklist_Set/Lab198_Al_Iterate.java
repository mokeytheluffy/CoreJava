package Oct.ex_20112024_Linklist_Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab198_Al_Iterate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Aniket");
        mylist.add("Sakshi");
        mylist.add("Jadhav");

        System.out.println("--To Print Arraylist--2");

        for(int i=0;i< mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        System.out.println("----To Print Arraylist--3");
        //Iterator
        Iterator<String>iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
