package Oct.ex_17102024_Conditional_and_Loops;

import java.util.Scanner;

public class Lab081_Hackerrank_Q {
    public static void main(String[] args) {
        //Grade Calculator
        //Write a program that calculates and display the letter grade for a given numbers
        // for a numerical score(eg. A,B,C,D,or F)
        //A= 90-100
        //B= 80-89
        //C= 70-79
        //D= 60-69
        //F= 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter scored marks\n");
        int score = sc.nextInt();
        if (score >= 90 && score<= 100) {
            System.out.println("A");
        } else if (score >= 80 & score<= 89) {
            System.out.println("B");
        } else if (score >= 70 & score<= 79) {
            System.out.println("C");
        } else if (score >= 60 & score<= 69) {
            System.out.println("D");
        } else if (score <= 0 & score >= 100) {
            System.out.println("Not possible");
        }
        else {
            System.out.println("F");
        }
    }
}
