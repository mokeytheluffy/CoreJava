package Oct.ex_26102024;

public class Lab129_String_Functions {
    public static void main(String[]args){
        String a = "Aniket";
        String b = a.substring(1,4);// from index no.1 to 4-1=3 will get displayed in output
        System.out.println(b);
        //substring is asked in interview


        // concatination --- to combine to strings
        String s1 = "Aniket";
        String s2 = s1.concat("Jadhav");
        System.out.println(s2);
        // We can also use "+"

        //Spliting Strings
        String fruits = "apple,banana,cherry";// delimiter =,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);


        //Other method
        String fruits1 = "apple-banana-cherry";// delimiter =,
        String[] split_fruits1 = fruits1.split("-");
        System.out.println(split_fruits1[0]);
        System.out.println(split_fruits1[1]);
        System.out.println(split_fruits1[2]);

        //ChatAt()
        String s33 ="Aniket";
        System.out.println(s1.charAt(0));// will present char at particular index
        //System.out.println(s1.charAt(10));// error will occur----exceptional bound

        //trim
        String s22 =" Aniket ";
        System.out.println(s22.trim());// it removes first and last space...

        //indexof
        String s44 ="Aniket";
        System.out.println(s44.indexOf("k"));// it will show the index no. for the character mentioned

        //Contains()
        String s32 ="Aniket";
        System.out.println(s32.contains("k"));

        //lastIndexOf()
        String s55 =" AniketJadhav";
        System.out.println(s55.lastIndexOf("a"));

        //replace
        String s12 =" Aniket ";
        System.out.println(s12.replace("k","z"));

        //startsWith---endsWith
        String s111 =" Aniket ";
        System.out.println(s111.startsWith("k"));
        System.out.println(s111.endsWith(""));

        //replaceAll()
        String s ="Aniket123 Sakshi 123";
        String t = s.replaceAll("\\d+","");// "\\d+" regex

        System.out.println(t);
    }
}
