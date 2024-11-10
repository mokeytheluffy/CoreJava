package Oct.ex_14102024;

public class Lab057_typecasting {
    public static void main (String[] args){
        // Type Casting
        // Widening- Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit( with data type) , loss

        // Widening--
    byte b = 10;
    int a = b; // Implicit Casting--- done by JVM
     int a1 = (int)b; // Valid ---- Explicit Casting-- done by JVM

        // Narrowing-- converting large data type to small data type
     int val = 200;
     //byte b2 = val;// invalid data---- Implicit Casting-- done by JVM
    byte b3 = (byte)val; // valid----- Explicit--- done by user
    }
}
