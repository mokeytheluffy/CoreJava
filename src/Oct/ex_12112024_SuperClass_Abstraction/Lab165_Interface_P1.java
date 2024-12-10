package Oct.ex_12112024_SuperClass_Abstraction;

public class Lab165_Interface_P1 {

}

abstract class ABC{
    abstract void name();
    //We can have complete function here in abstract class
    void surname(){
        System.out.println("Jadhav is my surname");
    }
}
interface I {  // In interface complete function is not allowed
    void m1();
    void m2();
    /*void m3(){
        System.out.println("ewewew");
    }*/

    //If we want to have complete function in interface class we need to use "default", but it can be used only once
    default void m3() {
        System.out.println("ewewew");
    }

    static void m4(){ //
        System.out.println("dsdsds");
}

    }
