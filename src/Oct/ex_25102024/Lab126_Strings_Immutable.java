package Oct.ex_25102024;

public class Lab126_Strings_Immutable {
    public static void main(String[] args) {
        String name = "aniket";
        name = name.toUpperCase(); // Convert all the characters in this String to Upper Case
        //but here still upper case value is not stored in any of the variables so it will still print "aniket"

        System.out.println(name);// now  it will display output as ANIKET, As now vairable is assign
    }
}
