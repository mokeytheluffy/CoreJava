package Oct.ex_17102024_Conditional_and_Loops;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        //Create a program--- Take user input
        //Check whether the input is even or odd number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell you od or even");
        int number = sc.nextInt();
        //Modulus --> %
        // 10%2 -- Even -- 0
        // 10%2 -- Odd -- 1
        if (number%2 == 0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
