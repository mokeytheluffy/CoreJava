package Oct.ex_06112024;

public class Car {

    String model;
    int year;
    String name;

    //Default Constructor --- if no value is entered than default value will be used
    // default constructor is used to initialize the value.
    Car() {         //this is a function, it does not take any arg.
        name = "Unknown Name";
        model = "XYZ";
        year = 0;
        System.out.println("DC is Executed!!");
    }
}
