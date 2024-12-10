package Oct.ex_12112024_SuperClass_Abstraction;

public class Lab167_Interface_P3 {

}


class child1 implements father,Mother{  // Multiple inheritance
    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
    @Override
    public void f4() {

    }

    @Override
    public void f5() {

    }

    @Override
    public void f6() {

    }
}


// We can create multiple interface
interface father{
    void f1();
    void f2();
    void f3();
}
interface Mother{
    void f4();
    void f5();
    void f6();
}