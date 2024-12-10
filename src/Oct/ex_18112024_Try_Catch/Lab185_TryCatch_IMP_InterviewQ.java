package Oct.ex_18112024_Try_Catch;

public class Lab185_TryCatch_IMP_InterviewQ {
    public static void main(String[] args) {
        try {
            String s1 ="Aniket";
            String a1 = args[0];
            int a = 10/0;
            s1=null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is some problem with code");
            System.out.println(e.getMessage());
        }
        System.out.println("End of the program");
    }
}
