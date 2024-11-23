package Oct.ex_22102024_while_Loop;

import java.util.Scanner;

public class Lab111 {
    public static void main(String[] args) {
        //Take the user input age and print the output.
        // taking input using arg[]---- it takes only string and not int

        String age_string = args[0];
        //convert String to int
        int age =Integer.parseInt(age_string);
        System.out.println(age);
        while (age>=1) {
            System.out.println(age);
            age--;
        }

       /* Scanner sc = new Scanner(System.in);
        System.out.println("");
        int age = sc.nextInt();
        while (age>=1){
            System.out.println(age);
        age--;

        */
        }
    }

