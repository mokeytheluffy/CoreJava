package Oct.ex_18102024_switch_condition;

import java.util.Scanner;

public class Lab083_switch_condition_without_break {
    public static void main(String[] args) {
        // Switch condition
        //User-Enter the int number from 1 to 7
        // which day it is it
        // 1-> Monday,4-> Thursday, 7-> sunday, 8,9,10,-1 --> Invalid
        // without using break all statement will get executed after the condition match.
        //eg. user enter-3 wednesday and all remaining statement will display
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from(1-7)");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wenesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("No day exist");
        }
        System.out.println("End of the loop");
        sc.close();
    }
}
