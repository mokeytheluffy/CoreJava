package Oct.ex_14112024_Static_Keyword;

public class Lab170 {
    public static void main(String[] args) {
        ATB a = new ATB("Aniket");
        ATB a1 = new ATB("Sakshi");
        ATB a2 = new ATB("Pappu");
        ATB a3 = new ATB("Pandu");
        ATB a5 = new ATB("Praful");

        ATB a6;
        new ATB("daddu");

        a.readdocument();
        a1.readdocument();


        //static
        ATB.doAssignment(); // Static Method
        System.out.println(ATB.Course); // Static Variable

    }
}
class ATB{
    {
        System.out.println("IIB");
        /*
        What is the purpose?
        Here u can write code related to
        start the website or anything before starting the
        Web automation or api automation
         */
        System.out.println("Reading from CSV file");
    }
    static {
        System.out.println("Load the class, I will execute");
    }

    private String name;
    private String phone;
    static String Course = "ATBx";
public ATB(String name){
    this.name=name;

}
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
void readdocument(){
    System.out.println("Non-staic method");
    System.out.println(Course);
}
static void doAssignment(){
    // System.out.println(phone);  static function can not access instance variable
    System.out.println("Do assignment");
}




}
