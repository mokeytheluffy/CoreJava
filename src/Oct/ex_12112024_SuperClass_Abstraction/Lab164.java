package Oct.ex_12112024_SuperClass_Abstraction;

public class Lab164 {
    Sakshi s = new Sakshi();
    s.drive();
}

class Sakshi extends Engine{

    void drive(){
        start_engine();
        stop_engine();
    }



    @Override
    void stop_engine() {

    }
    @Override
    void start_engine(){
        System.out.println("startimg a car");
    }
}






abstract class Engine{
    abstract void start_engine();
    abstract void stop_engine();
}
