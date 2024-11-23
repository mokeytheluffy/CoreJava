package Task_18102024;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        /*
        write a program that converts between different units(e.g. kilometers to meters,Celsius to Fahrenheit) based on user selection using a switch statement.
        input-
        choice- 1-Km -> Km->1m
        choice- 2-f->c,f->c
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Km/Celsius");
        int Km_Cel = sc.nextInt();
        System.out.println("Select Conversion 1 or 2");
        char Conversion = sc.next().charAt(0);
        double o = 0;
        switch (Conversion){
            case '1' :
                o = Km_Cel* 1000;
                break;
            case '2' :
                o = (Km_Cel*1.8)+32;
                break;
            default:
                System.out.println("Please enter number between 1-2");
        }
        System.out.println("Conversion");
        System.out.println();
        System.out.println(Km_Cel+"="+o);
    }
}
