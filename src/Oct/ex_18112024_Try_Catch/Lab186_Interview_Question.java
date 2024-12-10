package Oct.ex_18112024_Try_Catch;

public class Lab186_Interview_Question {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a= 0;
        try {
            int x =10/a;
        } catch (Exception e) {
            System.out.println("Div by zero");
        }finally {
            System.out.println("end of the program");
        }
    }
}
