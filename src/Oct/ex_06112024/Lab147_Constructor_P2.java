package Oct.ex_06112024;

import java.util.Scanner;

public class Lab147_Constructor_P2 {
    public static void main(String[] args) {
        Car2 t2 = new Car2( "tesla", 2015);// just enter the value of the variables and not the variable name
        System.out.println(t2.model);
        System.out.println(t2.year);
        t2.display();
        Car2 t3 = new Car2( "Nano", 2006);// just enter the value of the variables and not the variable name
        System.out.println(t3.model);
        System.out.println(t3.year);
        t3.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car name");
        String Car_name = sc.next();
        System.out.println("Enter year");
        int Car_year = sc.nextInt();

        t3 = new Car2(Car_name, Car_year);
        System.out.println(t3.model);
        System.out.println(t3.year);
    }
}

class Car2{
    String model;
    int year;

    //Parameterized Constructor
    Car2(String model_name, int year_created){
        System.out.println("PC");
        this.model = model_name;
        this.year = year_created;
    }
void display(){
    System.out.println("Car Details--->"+this.model+this.year);
}


}