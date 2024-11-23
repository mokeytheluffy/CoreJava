package Task_18102024;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
    /*
    Create a simple calculator that performs addition,subtraction,multiplication, and division,Modulus based on user input using switch statement
    input:- num1,num2,+
    out put:- num1+num2-> print information
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter any one operator- +,-,*,/,%");
        char operators = sc.next().charAt(0);
        double ans = 0 ;
        switch (operators){
            case '+':
                ans= num1+num2;
            break;
            case '-':
                ans= num1-num2;
                break;
                case '*' :
                ans = num1*num2;
                break;
            case '/' :
                ans= num1/num2;
                break;
            case '%' :
                ans = num1%num2;
                break;
            default :
                System.out.printf("Please enter valid operators");
                break;
        }
        System.out.println("The Final Result");
        System.out.println();
        System.out.println(num1+""+operators+""+num2+"="+ans);
    }
}
