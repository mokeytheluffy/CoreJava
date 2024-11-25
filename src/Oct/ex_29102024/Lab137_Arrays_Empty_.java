package Oct.ex_29102024;

import java.util.Scanner;

public class Lab137_Arrays_Empty_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = sc.nextInt();
        int[] number = new int[size];// size value will get stored in number
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number are:");
            number[i]= sc.nextInt(); //entered number will be stored in number
        }
        System.out.println("---------");
        //Print the number enter by the user
        System.out.println("The numbers are:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);

        }

    }
}
