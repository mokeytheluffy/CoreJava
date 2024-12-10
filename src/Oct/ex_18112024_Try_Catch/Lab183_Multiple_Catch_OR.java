package Oct.ex_18112024_Try_Catch;

public class Lab183_Multiple_Catch_OR {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 0;
            b = 100/a;
            System.out.println(b);
        }catch (ArrayIndexOutOfBoundsException|ArithmeticException|NumberFormatException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("End");
        }
    }
}
