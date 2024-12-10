package Oct.ex_12112024_SuperClass_Abstraction;

public class tesla extends Engine{

    @Override
    void start_engine() {
        System.out.println("Start Tesla");
    }

    @Override
    void stop_engine() {
        System.out.println("Stop Tesla");
    }
    void drive(){
        start_engine();
        stop_engine();
    }
}
