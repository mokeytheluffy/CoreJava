package Oct.ex_29102024;

public class Lab132 {
    public static void main (String[] args){
        // Creation , Size--Fix
        int[] marks_2 = new int[5]; // Fixed size
        System.out.println(marks_2.length);
        marks_2[0] = 11;
        marks_2[1] = 18;
        marks_2[2] = 17;
        marks_2[3] = 10;
        marks_2[4] = 19;
        System.out.println(marks_2[0]);
        System.out.println(marks_2[4]);
        System.out.println(marks_2[2]);
        // System.out.println(marks_2[-1]);  == ArrayIndexOutOfBoundsException
        // System.out.println(marks_2[+1]);  == ArrayIndexOutOfBoundsException

    }
}
