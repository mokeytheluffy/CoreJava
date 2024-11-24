package Oct.ex_25102024;

public class Lab128_String_Comparison {
    public static void main(String[] args) {
        String S1 = "Hello";
        String S2 = "Hello";
        String S3 = new String("Hello");
        String S4 = new String("Hello");
        String S5 = new String("hello");

            // == ---- is use to check the ref location

        System.out.println(S1 == S2); // True----String within SCP can be compaired
        System.out.println(S1 == S3); // False----String outside SCP can't be compaired
        System.out.println(S3 == S4); // False---- As in QA(HA) each string has thier own space,due to which it can not be compaired  with each other.
        System.out.println(S4 == S5); // False---- As in QA(HA) each string has thier own space,due to which it can not be compaired  with each other.
        System.out.println(S3 == S5); // False---- As in QA(HA) each string has thier own space,due to which it can not be compaired  with each other.

    // function:---- equals(content)--> value
        // How can i check the value ? equals == value

        System.out.println(S1.equals(S2)); // true as it compares content in the string
        System.out.println(S1.equals(S3)); // true as it compares content in the string
        System.out.println(S3.equals(S5)); // false-- content is mismatch as Case is different
        System.out.println(S3.equalsIgnoreCase(S5)); // true--- here the output will be equal as case is ignored by the JVM and only conntent is compared
    }

}
