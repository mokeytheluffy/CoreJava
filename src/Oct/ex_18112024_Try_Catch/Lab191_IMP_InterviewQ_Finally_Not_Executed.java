package Oct.ex_18112024_Try_Catch;

public class Lab191_IMP_InterviewQ_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a = 10/10;
        System.exit(0); //When System.exit is used, in this case finally will not be executed//
            // here we are telling JVM to stop the process of execute

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally will not get executed");
        }
    }
}
