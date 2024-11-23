package Oct.ex_23102024_Functions;

public class Lab120 {
    public static void main(String[] args) {
        //3. With parameters and without return types.
        //Main is a 3th type of user define function
        greet_with_your_name("Aniket");
        greet_with_your_name("Sakshi");
        greet_with_your_name("Me");

        firstname_lastname("Aniket","Sakshi");
    }

    static void greet_with_your_name(String name) {
        System.out.println("What is your name" + name);
    }
    static void firstname_lastname(String firstname, String lastname) {
        System.out.println("What is your name" + firstname + "" + lastname);
    }
}
