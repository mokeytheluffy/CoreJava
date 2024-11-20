package Oct.ex_18102024_switch_condition;

public class Lab086 {
    public static void main(String[] args) {
        int intcode = 003;

        switch (intcode){
            case 001,002,003:// this functionality is only in JDK above 13 and greater
                System.out.println("All of them are electronic gadgets");
                break;
            case 004,005,006:// this functionality is only in JDK above 13 and greater
                System.out.println("All of them are Machenical gadgets");
                break;
            default:
                System.out.println("None");

        }
    }
}
