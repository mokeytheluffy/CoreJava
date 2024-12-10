package Oct.ex_18112024_Try_Catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab187_MostIMP_Unchecked_Checked_Example {
    public static void main(String[] args) {
        //Example--Unchecked
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Unchecked");
        }

        // Example--Checked
        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally checked example");
        }
    }
}
