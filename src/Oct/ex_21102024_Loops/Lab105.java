package Oct.ex_21102024_Loops;

public class Lab105 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            //Continue---- It is used to skip the below code and move to top
            if (i==5){
                continue;
            }
            System.out.println(i);// here it will skip 5 and continue printing other numbers
        }
    }
}
