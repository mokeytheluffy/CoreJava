package Oct.ex_17102024_Conditional_and_Loops;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        //int age = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age \n");
        int age = sc.nextInt();
        // Allowed to vote or not
        //If age > 18 > allowed to void
        if(age>18){
            System.out.printf(" %d age allowed to vote", age);
        }
        else {
            System.out.println("Below age 18 not allowed");
        }
    }
}