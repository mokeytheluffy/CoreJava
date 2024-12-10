package Oct.ex_18112024_Try_Catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab188_Throws {
    public static void main(String[] args) throws Exception {// this is the one way which we can use ---it will handle exception at method level


        //Throws used when there is checked
       /* try {
            FileInputStream fileInputStream = new FileInputStream("C://abc.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);// one way to throw the exception
        }*/

        FileInputStream fileInputStream = new FileInputStream("C://abc.txt");

    }
}
