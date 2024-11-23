package Oct.ex_21102024_Loops;

public class Lab103 {
    public static void main(String[] args) {
        // Write a program to find the even number from 1 to 50
        for (int i = 0; i <= 50 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }else {
                System.out.println("Odd");// here all odd numbers will get printed
            }
        }
    }
}
