package Oct.ex_14112024_Static_Keyword;

public class Lab169 {
    public static void main(String[] args) {
        Aniket a1; //Only reference is not helping to load SIB and IIB
       // new Aniket(); ----- this will help creating the object in class
        Aniket a = new Aniket(); // now object is created and we can call the SIN and IIB
        Aniket b = new Aniket();
    }
}

class Aniket {
    {
        System.out.println("IIB");
    }

    static {
        System.out.println("SIB");
    }
}
