package Oct.ex_15102024_Increment_Decrement;

public class Lab068 {
    public static void main (String[] args){
        int a = 10;
        System.out.println(a++ + ++a);
        // A --> a++ --> 10 is assign, now a = 11
        // B--> ++a --> 12, now a = 12
        // A+B = 10+12
        // 22
        System.out.println(a);

    }
}
