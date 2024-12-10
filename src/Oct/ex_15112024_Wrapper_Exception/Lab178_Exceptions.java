package Oct.ex_15112024_Wrapper_Exception;

public class Lab178_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 =null;
        try {
            s1.trim(); // trim() is not allowed when there is a null
        }catch (Exception e) {
            System.out.println(e.getMessage()); // this is how exceptional handling is used
        }
        System.out.println("End");
        //Unchecked---- java.lang.NullPointerException
        //jvm--compile---> jvm knows at the runtime----> Terminated
    }
}
