package Oct.ex_12112024_SuperClass_Abstraction;

public class Lab164 {
    public static void main(String[] args) {
        Sakshi s = new Sakshi();
        s.drive();

        tesla tesla = new tesla();
        tesla.drive();
    }
}

class Sakshi extends Engine { // concrete class

    void drive() {
        start_engine();
        stop_engine();
    }

    @Override
    void stop_engine() {
        System.out.println("stopping a car");
    }

    @Override
    void start_engine() {
        System.out.println("starting a car");
    }
}

abstract class Engine { // incomplete class
    abstract void start_engine();

    abstract void stop_engine();
}
