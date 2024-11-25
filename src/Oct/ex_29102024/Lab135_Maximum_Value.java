package Oct.ex_29102024;

public class Lab135_Maximum_Value {
    public static void main(String[] args) {
        // How to find the maximum/minimun value in the array
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int maximum = max(array);
        System.out.printf("Maximum value is %d\n", maximum);

        int minimum = min(array);
        System.out.printf("Minimum value is %d", minimum);
    }

    static int max(int[] array) {
        int max = array[0]; // taking index 0 value means 25 first
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {// now here comparing 25 to index 1 number and if greater than will get stored in max
                max = array[i];// this process will continues until array ends and maximum value is define
            }
        }


        return max;
    }

    static int min(int[] array) {
        int min = array[0]; // taking index 0 value means 25 first
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {// now here comparing 25 to index 1 number and if greater than will get stored in max
                min = array[i];// this process will continues until array ends and maximum value is define
            }
        }


        return min;
    }


}
