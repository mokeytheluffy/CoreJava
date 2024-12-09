package Oct.ex_12112024_SuperClass_Abstraction;

public class Lab161_Super {
    public static void main(String[] args) {
        Car c = new Car();

    }
}
//---------------------//

class Vehicle {
    public int max_speed = 180;

    void display() {
        System.out.println("Parent");
    }

    Vehicle() {
        System.out.println("DC Vehicle");
    }

    Vehicle(int a) {
        System.out.println("DC Vehicle");
    }

    void message() {
        System.out.println("Hello Vehicle");
    }

}

//-----------//

class Car extends Vehicle {
    private int max_speed = 241;

    @Override
    void display() {
        System.out.println("Child");
        ;
    }

    Car() {

        super(10);
        System.out.println("DC Car");
        System.out.println(this.max_speed);//this ---here is accessing only with the class parameters
        System.out.println(super.max_speed);//Now here it will access max_speed from parent class
        super.display();
        this.display();

    }

}
