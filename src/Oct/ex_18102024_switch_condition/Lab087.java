package Oct.ex_18102024_switch_condition;

public class Lab087 {
    public static void main(String[] args) {
        // we can also use "->" and no need of using break
        // this is used when ther is a 1 liner.
        int intercode = 001;
        switch (intercode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("default");
        }
    }
}
