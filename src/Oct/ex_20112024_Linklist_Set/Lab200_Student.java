package Oct.ex_20112024_Linklist_Set;

import java.security.PrivateKey;

public class Lab200_Student {

        private String name;
        private String rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    Lab200_Student(String name, String rollNo){
this.name = name;
this.rollNo=rollNo;

        }
    public void printdetails(){
        System.out.println("Student Name is"+ name);
        System.out.println("Roll No = "+rollNo);

    }
}
