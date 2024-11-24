package Oct.ex_25102024;

public class Lab125_String_Created {
    public static void main(String[]args){
        String name = "aniket";
        // String ---> data type
        // name ---> Variable
        // = ---> assignment operator
        // "Aniket" ---> literal (String)
        name = "jadhav";
        name = "sakshi";
        name = "aniket"; // it is stored in string constant pool
        //Here total of 3 strings are created


        System.out.println(name);


        String name1 = new String("Aniket");// A new area is created in heap area
        String name2 = new String("Aniket");
        String name3 = new String("Aniket");
        String name5 = name3;
        //Here total of 3 strings are created

    }
}
