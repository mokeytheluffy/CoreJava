package Oct.ex_15112024_Wrapper_Exception;

public class Lab175_Conversion {
    public static void main(String[] args) {
        String num ="10";
        //String ---> wrapper(integer)---->Primitive type

        Integer a = Integer.valueOf(num);
        int a2 = a;//Unboxing

        //String to Primitive type(Direct Conversion)
        int a3 = Integer.parseInt(num);

        Long l =30l;
        Short s = 56;
        Boolean b = true;

    }
}
