package Oct.ex_14112024_Static_Keyword;

public class Lab168 {
    public static void main(String[] args) {
        //student s = new student();
        //int age1 = s.age;
        //System.out.println(student.school_name);// here the static variable is called directly from child class
     student.school_name="XYZ";
        System.out.println(student.school_name);

        student s1 = new student(10);// To call IIB
        student s2 = new student(30);

    }
}

class student {
    int age; //Non-static variable // Instance Variable
    static String school_name = "ABCD";

public student(int age){
    this.age= age;

}
    //IIB
    {
        System.out.println("My name is Aniket");
        System.out.println("I work as a Qa engineer");
        System.out.println("Influencer");
    }

    //SIB
    static {
        System.out.println("SIB");
        System.out.println("It is loaded once,When class is loaded");
    }
}