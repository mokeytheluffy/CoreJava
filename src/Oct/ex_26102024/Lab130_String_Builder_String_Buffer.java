package Oct.ex_26102024;

public class Lab130_String_Builder_String_Buffer {
    public static void main(String[]args){
        StringBuffer stringBuffer = new StringBuffer("Aniket");
        stringBuffer.append("Jadhav");// append means it will add new values to existing string
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Aniket");
        stringBuilder.append("Jadhav");
        System.out.println(stringBuilder);



    }
}
