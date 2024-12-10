package Oct.ex_15112024_Wrapper_Exception;

public class Lab174_wrappe {
    public static void main(String[] args) {
        //Primitive to wrapper class

        int a = 10;
        Integer b = a; // it s called Boxing -----int to integer
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        b.intValue();

        Integer c = 10;
        int d = c; // it s called Unboxing -----Integer to int
        System.out.println(b);


    }
}
