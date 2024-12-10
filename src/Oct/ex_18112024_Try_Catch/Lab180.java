package Oct.ex_18112024_Try_Catch;

public class Lab180 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            b = 10 / a;
            System.out.println(b);
            //Multiple Catch can be used
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {// if there is error or no-error it will execute
            //
            System.out.println("I will be always executed");
        }
    }
}

