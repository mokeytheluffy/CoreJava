package Task._16102024;
import java.util.Scanner;
public class _16102024_Tarnary_UserInput {
    // Take a user int 2 number from the argument and calculate the maximum in between using ternary operation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1 \n");
        System.out.println("Enter Number 2 \n");
        int Number_1 = scanner.nextInt();
        int Number_2 = scanner.nextInt();
        int Max = (Number_1 > Number_2)?  Number_1 : Number_2 ;
        System.out.printf("Define Maximum among two numbers %d", Max);
        scanner.close();
    }

}
