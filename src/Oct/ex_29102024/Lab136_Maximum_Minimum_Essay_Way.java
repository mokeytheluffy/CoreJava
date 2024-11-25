package Oct.ex_29102024;

import java.util.Arrays;

public class Lab136_Maximum_Minimum_Essay_Way {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }
}
