package Oct.ex_18112024_Try_Catch;

public class Lab182_Multiple_Catch {
    public static void main(String[] args) {
        try {
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 0;
        b = 100/a;
        System.out.println(b);
        }catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("End");
        }
    }
}
