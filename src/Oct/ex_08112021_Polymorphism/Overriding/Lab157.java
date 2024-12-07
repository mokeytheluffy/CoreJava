package Oct.ex_08112021_Polymorphism.Overriding;

public class Lab157 {
    public static void main(String[] args) {
        Aniket a = new Aniket();
        a.home();

        Father f = new Father();
        f.home();

        // Dynamic Dispatch();
        Father q = new Aniket();// whom ever object is created that function will be called
        q.home();

        //Aniket w = new Father(); //Never possible
        //w.home();
    }
}


 //Same method name but different parameter

class Father{
    void home(){
        System.out.println("2BHK");
    }
}
class Aniket extends Father{

    @Override
    void home(){
        System.out.println("3BHK");
    }
}
