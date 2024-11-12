package Oct.ex_16102024;

public class Lab072 {
    public static void main(String[] args) {
//Create a program whether Aniket will go to Goa or not
// Take a input age of Aniket
// age---> greater than 25 than allowed to drink ---in Goa
        // use ternary operator
        // By using argument (in console)
        //Steps:- click on 3 dots
        //click on Edit configuration
        // enter user input in CLI textbox
        // click on apply and ok
 int age =Integer.parseInt(args[0]) ;
        System.out.println( (age>25)? "Allowed to go Goa" : "Not allowed to go Goa");

    }
}
