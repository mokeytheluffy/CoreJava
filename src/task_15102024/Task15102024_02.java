package task_15102024;

public class Task15102024_02 {
    // Find the largest number among a,b,c using the ternary operators
    public static void main(String[] args) {
        int a = -10;
        int b = -20;
        int c = -15;
        int result = (a>=b && a>=c)? a : (b>=c)? b:c;
        System.out.println(result);

    }
}
