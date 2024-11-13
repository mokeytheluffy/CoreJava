package Task._16102024;

import java.util.Scanner;

public class _16102024_Scanner_Class {
    public static void main(String[] args) {
        //Take a user input name age and salary and print them in the end
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name\n");
        System.out.println("Enter age\n" );
        System.out.println("Enter Salary");

        String Name = scanner.nextLine();
        int Age = scanner.nextInt();
        int Salary = scanner.nextInt();

        System.out.printf("My name is %s. \n", Name);
        System.out.printf("I am %d year old. \n",Age);
        System.out.printf("Having salary %d LPA",Salary);

scanner.close();
    }
}
