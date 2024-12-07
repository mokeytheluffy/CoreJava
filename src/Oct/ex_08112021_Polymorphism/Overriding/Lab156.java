package Oct.ex_08112021_Polymorphism.Overriding;

public class Lab156 {
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();
    }

}
class dog{
    void bark(){
        System.out.println("I am a Dog, i can Bark!!");
    }
    int age = 10;
}
class Hound extends dog{
    // Hound is a type of dog
    @Override
    void bark(){
        System.out.println("Hound is Bark!!");
    }
}