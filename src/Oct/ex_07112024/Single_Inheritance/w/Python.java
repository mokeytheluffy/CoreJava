package Oct.ex_07112024.Single_Inheritance.w;

public class Python  extends Lab150_Program_Ex2{
    //Extend
    //Python is a programming language
    void print(){
        System.out.println(author);
        System.out.println(version);

    }

    public static void main(String[] args) {
        Python p1 = new Python();
        System.out.println(p1.author);
    }
}
