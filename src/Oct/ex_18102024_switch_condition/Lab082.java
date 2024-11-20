package Oct.ex_18102024_switch_condition;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        // Switch condition
        //User-Enter the int number from 1 to 7
        // which day it is it
        // 1-> Monday,4-> Thursday, 7-> sunday, 8,9,10,-1 --> Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from(1-7)");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wenesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No day exist");
                break;
        }
        System.out.println("End of the loop");
        sc.close();
    }
}
