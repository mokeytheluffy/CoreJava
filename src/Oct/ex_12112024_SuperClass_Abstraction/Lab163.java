package Oct.ex_12112024_SuperClass_Abstraction;

public class Lab163 {
    public static void main(String[] args) {
        child c = new child();
        c.loan50K();
        c.loan_2L();
    }
}
abstract class Father{
    abstract void loan50K();
    void loan_2L(){
        System.out.println("Paid by father");
    }
}

class child extends Father {

    @Override
    void loan50K() {
        System.out.println("Loan Paid  by child");
    }
}