package Task_17102024;

import java.util.Scanner;

public class If_elseif_else {
    public static void main(String[] args) {
        //Take user input and identify the triangle
        Scanner lenght = new Scanner(System.in);
        System.out.println("Enter left side lenght\n");
        int L1 = lenght.nextInt();
        System.out.println("Enter right side lenght\n");
        int L2 = lenght.nextInt();
        System.out.println("Enter bottom side lenght \n");
        int L3 = lenght.nextInt();
        if (L1 == L2 & L2 == L3 & L1 ==L3){
            System.out.println("All sides are congruent, hence it is an Equilateral Triangle");
        } else if (L1 <= 0 || L2 <= 0 || L1 <= 0)  {
            System.out.println("Invalid input, Avoid negative input");
        }else if (L1 == L3 || L2 == L3 || L1 ==L3)  {
            System.out.println("Only two sides are congruent, hence it is an Isosceles Triangle");
        }else{
            System.out.println("No sides are congruent, hence it is an Scalene Triangle");
        }
    }
}
