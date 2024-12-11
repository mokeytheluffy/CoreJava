package Oct.ex_19112024_Generics;

public class Lab192_Generic {
    public static void main(String[] args) {
        temp_sum(23,45);
        temp_sum("Aniket","Sakshi");
    }
public static Integer temp_sum(Integer a , Integer b){
        return a+b; //here it is used for getting sum
    }
    public static String temp_sum(String a , String b){
        return a+b; // here"+" is used to concatinate two string
    }
}

