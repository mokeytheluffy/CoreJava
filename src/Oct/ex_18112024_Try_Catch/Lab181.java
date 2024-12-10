package Oct.ex_18112024_Try_Catch;

import java.util.Scanner;

public class Lab181 {
    public static void main(String[] args) {
        Scanner s = null;
        s = new Scanner(System.in);
        int v = s.nextInt();
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        finally {
            s.close();
            System.out.println("Closed");
        }

    }
}
