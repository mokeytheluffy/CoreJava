package Oct.ex_14102024;

public class Lab058_typecasting {
    public static void main(String[] args){
        long phone_no = 7878984678l;
        // here narrowing concept is used
        // short s = phone_no; implicit is not possible
        short s = (short)phone_no; // Explicit casting is possible--User--- but ther will be data loss

    }
}
