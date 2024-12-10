package Oct.ex_18112024_Try_Catch;

public class Lab179_goodCoder_will_handle_tryCatch {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            b = 10/a;
            String s1 = null;
            s1.trim();
            //Multiple Catch can be used
        } catch (ArithmeticException| NullPointerException e) // We can also use ArithmeticExpression/Throwable by replacing Exception
        // above we have specified exception very presicely--- which is a sign of a GOOD CODER
                //but it is OK to use exception
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e) // We can also use ArithmeticExpression/Throwable by replacing Exception
        {
            System.out.println(e.getMessage());
        }
        catch (Throwable e) // We can also use ArithmeticExpression/Throwable by replacing Exception
        {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
 // as if now it is unchecked exception
    }
}
