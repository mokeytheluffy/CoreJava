package Oct.ex_15112024_Wrapper_Exception;

public class Lab176_Exception {
    public static void main(String[] args) {
        System.out.println("Start of program");
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println(b);
        System.out.println("End of program");
    }



}
