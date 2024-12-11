package Oct.ex_19112024_Generics;

public class Lab193_Generic_solution {
    public static void main(String[] args) {
// this is how generic class is called in main class
   temp_sum(34,43); // Integer
   temp_sum("Aniket","Jadhav"); //String
   temp_sum(true, false); // Boolean

    }
    //this is how generic methods are being used in java
    public static <T> T  temp_sum(T a, T b){  // Here "T" is a reference to any data type in future.

        // data type can be any
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}

