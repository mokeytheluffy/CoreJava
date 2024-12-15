package Oct.ex_21112024_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab211 {
    public static void main(String[] args) {
        Map<String,Integer> HM = new HashMap();
        HM.put("ID", 1);
        HM.put("ID", 1);
        HM.put("ID2",2);
        HM.put("ID3",2);
        HM.put("ID4",null);
        HM.put("ID5",null); // null value can be used again and again
        HM.put(null,2);


        //Iterator---- need to remember IMP
        for (Map.Entry<String,Integer>  item: HM.entrySet()){
            System.out.println(item.getKey()+"-->"+item.getValue());
        }

    }
}
