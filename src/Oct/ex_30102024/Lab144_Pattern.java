package Oct.ex_30102024;

import java.util.Scanner;

public class Lab144_Pattern {
    public static void main(String[] args) {
    //Right hand triangle
        //*
        //**
        //***
        //****
        //*****
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number n=5");
        int n = sc.nextInt();
    //R-->3
    //R-->C-->3
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");

             }
        System.out.println("");
    }


}
}
