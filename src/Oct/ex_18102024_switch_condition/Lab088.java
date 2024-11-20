package Oct.ex_18102024_switch_condition;

public class Lab088 {
    public static void main(String[] args) {
        int a=11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:// always switch and case values will match so 10 will get printed, a=11 is ignored here
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
