package Oct.ex_06112024;

public class Lab146_Constructors {
    public static void main(String[] args) {
        Car tesla = new Car(); // the Movement we call "new Car()" default constructor will be called.
        System.out.println(tesla.model);
        System.out.println(tesla.name);
        System.out.println(tesla.year);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);
        nano.year =  2000;
        System.out.println(nano.year);

    }
}
