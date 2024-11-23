package Oct.ex_23102024_Functions;

public class Lab119 {
    public static void main(String[] args) {
        //2. Without parameters and with return types.
        String returned_value = greet_with_hello(); // first string will get called and stored in variable
        System.out.println(returned_value);// here returned value will get called
        int voting_age = age();
        if (voting_age >= 18) {
            System.out.println("You are allowed to vote");
        } else {
            System.out.println("You are under age");
        }
    }

    static String greet_with_hello() {
        System.out.println("What is your name"); //this string is declare first
        return "I am Aniket"; //
    }

    static int age() {
        System.out.println("Can I Vote"); //this string is declare first
        return 16;
    }
}