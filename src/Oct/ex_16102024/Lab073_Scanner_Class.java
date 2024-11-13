package Oct.ex_16102024;

import java.util.Scanner;// mandatory to use when use scanner class

public class Lab073_Scanner_Class {
    public static void main(String[] args) {
// Scanner Class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age\n");
        int age = scanner.nextInt();
        System.out.println(age>26? "Allowed to go Goa":"Not allowed to go Goa");

scanner.close();
    }
}
