package Oct.ex_21112024_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab209_P1 {
    public static void main(String[] args) {
        // Key can not be duplicate
        Map HM = new HashMap();
        HM.put("ID", 1);
        HM.put("ID", 1);
        HM.put("ID2",2);
        HM.put("ID3",2);
        HM.put("ID4",null);
        HM.put("ID5",null); // null value can be used again and again
        HM.put(null,2);
        HM.put(null,2);// null Key can be used again and again



        System.out.println(HM);







    }
}
