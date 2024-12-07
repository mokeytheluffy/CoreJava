package Oct.ex_08112021_Polymorphism.Overloading;

public class Lab155 {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        //int result = mathOperations.add(3,7);
        float result = mathOperations.add(3.5f,7.2f);// In this case float method will be running
        System.out.println(result);
    }
}
class MathOperations{
    //Method Overloading
    //Method will be overload
    //same name button  different argument or parameters
    // Method Overloading is a compile time, At compilation JVM will consider which function is need to be considered
    //Overloading happened within a class
    //Same method name but different parameter

    int add(int a, int b){
        return a+b;
    }
    float add(float a, float b){
        return a+b;
    }
    void add(int a, int b , int c){
        System.out.println("hello");
    }
    double add(double a,double b){
        return a+b;
    }
    double add(double a,double b, double c){
        return a+b;
    }


}
