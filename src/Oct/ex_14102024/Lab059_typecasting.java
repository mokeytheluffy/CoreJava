package Oct.ex_14102024;

public class Lab059_typecasting {
    public static void main(String[] args){

        //GST - 18,45
        int course = 100;
        float GST = 18.45f;
         int total_price = course+ (int)GST; // Narrowing --- using Explicit--- loss
        System.out.println(total_price);// here we loss .45 value by narrowing
    }
}
