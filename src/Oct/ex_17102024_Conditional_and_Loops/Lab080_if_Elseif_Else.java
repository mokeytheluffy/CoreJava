package Oct.ex_17102024_Conditional_and_Loops;

import java.util.Scanner;

public class Lab080_if_Elseif_Else {
    public static void main(String[] args) {
        //We can have two or more outputs
        //int num1 = 20;
        //int num2 = 20;
        //1--> num1 > num2
        //2--> num2 > num1
        //3--> num1 == num2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        if( num1>num2){
            System.out.println("Num1 is greater");
        } else if (num2>num1) {
            System.out.println("Num2 is greater");
        } else{
            System.out.println("Equal");
        }
    }
}
