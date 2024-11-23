package Oct.ex_23102024_Functions;

public class Lab121 {
    public static void main(String[] args) {
        //4. With parameters and with return types.
        int sum = add_to_numbers(10,40);
        System.out.println(sum);
    }

    static int add_to_numbers(int a, int b) {
        return a + b;
    }
}
