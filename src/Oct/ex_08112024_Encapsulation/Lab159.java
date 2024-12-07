package Oct.ex_08112024_Encapsulation;

public class Lab159 {
    public static void main(String[] args) {
    /*    person p1 = new person();
        p1. getName(); this can be used
        p1.setName(); this can be used
    but user can not directly access the variable, as it is encapsulated
    like:
    p1.name ----not possible

    */
    }
}
class person{

    private String name;
    private String phone_no;

    public person(String phone_no, String name) {
        this.phone_no = phone_no;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}