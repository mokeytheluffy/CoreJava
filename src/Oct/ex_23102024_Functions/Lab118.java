package Oct.ex_23102024_Functions;

public class Lab118 {
    public static void main(String[] args) {
        //1. Without parameters and without return type.
        // Void ------ No return nothing
        for (int i = 0; i < 100; i++) {
            greet();
        }
    }

    static void greet() {//declaration
        System.out.println("Hello World");
    }
}
