package Oct.ex_21112024_Map;

import Oct.ex_08112024_Hierarchical_Inheritance.Aniket;

import java.util.HashMap;
import java.util.Map;
//import java.util.*; --- this imports all the modules, but slow down the processing of code
public class Lab208 {
    public static void main(String[] args) {
         // Map is Key value pair
        //name:pramod , rollno. : 10
        //phone : 9588657425
        Map HM = new HashMap();
        HM.put("Name", "Aniket");
        HM.put("RollNo.", 1012);
        HM.put("Phone No.", 585625745);
        System.out.println(HM);


        //when to use Map and when to use List?
        //List--> Shopping list, Single items
        //Map---> name--aniket, roll

    }
}
