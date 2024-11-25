package Oct.ex_29102024;

import java.util.Arrays;

public class Lab134_Array_Iterate {
    public static void main(String[]args){
        int[] number ={32,45,34,67,54,23,30};
        Arrays.sort(number); // it will sort in ascending order
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        System.out.println(number[5]);
        System.out.println(number[6]);

        System.out.println("-----------");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }//Binary Search---use to find index of any element---binary search works only on sorted array
            int search = Arrays.binarySearch(number,45);
            System.out.println(search);




    }

}
