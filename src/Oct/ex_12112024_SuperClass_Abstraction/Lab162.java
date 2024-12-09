package Oct.ex_12112024_SuperClass_Abstraction;

public class Lab162 {

}

class Aniket extends loan{
    @Override
    void loan50K (){
        System.out.println("Loan of 50K");
    }
}


abstract class loan {
    abstract void loan50K();

    void loan_1L() {
        System.out.println("Loan of 1 Lakh");
    }
}

//every class is a Concrete Class
