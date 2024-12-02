package Oct.ex_06112024;

import java.util.Scanner;

public class Lab148 {
    public static void main(String[] args) {
        Car3 t2 = new Car3( );// just enter the value of the variables and not the variable name
        System.out.println(t2.model);
        System.out.println(t2.year);

        t2.display();

        Car3 t3 = new Car3();// just enter the value of the variables and not the variable name
        System.out.println(t3.model);
        System.out.println(t3.year);

        t3.display();

    }
}

class Car3{
    String model;
    int year;

    //Parameterized Constructor
    Car3(){
        model= "Tata Curve";
        year = 2024;
    }
    void display(){
        System.out.println("Car Details--->"+this.model+this.year);
    }
}
