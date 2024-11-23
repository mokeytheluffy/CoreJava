package Task_23102024;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Create a function of Sum,Sub,Mul,Div with parameter a,b (take the parameter from the user )
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a");
        int a = sc.nextInt();
        System.out.println("Enter value b");
        int b = sc.nextInt();
        System.out.println("Enter Operator");
        char operation = sc.next().charAt(0);
        double o = 0;
        switch (operation) {
            case '+':
                o = sum(a, b);
                System.out.println(o);
                break;
            case '-':
                o = Sub(a, b);
                System.out.println(o);
                break;
            case '*':
                o = Mul(a, b);
                System.out.println(o);
                break;
            case '/':
                o = Div(a, b);
                System.out.println(o);
                break;
            default:
                System.out.println("Enter invalid operator");
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int Sub(int a, int b) {
        return a - b;
    }

    static int Mul(int a, int b) {
        return a * b;
    }

    static int Div(int a, int b) {
        return a / b;
    }
}
