package Oct.ex_11102024;

public class Lab042 {
    public static void main (String [] args) {
        String first_name = "Aniket";
        String last_name = "Jadhav";
        int a = 10;
        int b= 10;
        System.out.println(first_name+last_name+a+b);
        // AniketJadhav1010 ---> first operator --> performed as concatination so further on it will perform as conacatination only
        System.out.println(a+b+first_name+last_name);
        // first it will act as a arithmetic operator and later on for string it will perform concatination
        System.out.println(first_name+last_name+(a+b));
        // if we wnt to fix line 9 then use "first_name+last_name+(a+b)" brackets
    }
}
